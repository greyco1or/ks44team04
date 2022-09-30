package ks44team04.user.controller;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import ks44team04.dto.PostInfo;
import ks44team04.dto.RegularPostHistory;
import ks44team04.service.AddressService;
import ks44team04.service.RegularPostService;
import ks44team04.service.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user/regularpost")
public class UserRegularPostController {

	private final Logger log = LoggerFactory.getLogger(getClass());
	private final RegularPostService regularPostService;
	private final AddressService addressService;
	private final Service service;
	private final Gson gson;

	public UserRegularPostController(RegularPostService regularPostService, AddressService addressService,
			Service service, Gson gson) {
		this.regularPostService = regularPostService;
		this.addressService = addressService;
		this.service = service;
		this.gson = gson;
	}

	@GetMapping("/list")
	public String regularPostList(Model model) {

		return "user/regularPost/regularPostList";
	}

	@GetMapping("/postcheck/{postCode}")
	public String postCheck(@PathVariable(value = "postCode") String postInfo) {
		PostInfo post = addressService.getPostInfo(postInfo);
		String pcn = post.getPostCompanyName();
		String in = post.getInvoiceNumber();
		String company = "";

		ResponseEntity<Object> companyObj = service.getData("https://apis.tracker.delivery/carriers");
		JsonArray companyArray = gson.toJsonTree(companyObj.getBody()).getAsJsonArray();
		for (JsonElement jsonElement : companyArray) {
			log.info("{}", jsonElement);
			if (jsonElement.getAsJsonObject().get("name").getAsString().contains(pcn)) {
				company = jsonElement.getAsJsonObject().get("id").getAsString();
			}
		}
		return "redirect:https://tracker.delivery/#/" + company + "/" + in;
	}

	@GetMapping("/history")
	public String regularPostHistory(Model model) {
		String userId = "buyer01";
		List<RegularPostHistory> regularPostHistory = regularPostService.getRegularPostHistory(userId);
		model.addAttribute("regularPostHistory", regularPostHistory);
		return "user/regularPost/regularPostHistory";
	}

	
    @GetMapping("/confirm/{orderdetailcode}")
    public String regularPostConfirm(@PathVariable(value = "orderdetailcode") String orderDetailCode) {
        Map<String, String> orderProcess = new HashMap<>();
        orderProcess.put("orderDetailCode", orderDetailCode);
        orderProcess.put("orderStatus", "구매확정");
        regularPostService.setOrderDetailStatus(orderProcess);
        return "redirect:/user/regularPostHistory";
    }

    @GetMapping("/modify")
    public String regularPostModify(Model model) {

		return "user/regularPost/regularPostModify";
	}

	@GetMapping("/delete")
	public String regularPostDelete(Model model) {

		return "user/regularPost/regularPostDelete";
	}

	@GetMapping("/skip")
	public String regularPostSkip(Model model) {

		return "user/regularPost/regularPostSkip";
	}
}
