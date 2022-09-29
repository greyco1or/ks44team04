package ks44team04.user.controller;

import ks44team04.dto.AddressList;
import ks44team04.service.AddressService;
import ks44team04.util.CodeIndex;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user/address")
public class UserAddressController {

    private final AddressService addressService;
    private final Logger log = LoggerFactory.getLogger(getClass());

    public UserAddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping("/list")
    public String addressList(@RequestParam(value = "userId", required = false) String userId, Model model) {
        userId = "buyer01";
        Map<String, String> addressInfo = new HashMap<>();
        addressInfo.put("userId", userId);
        List<AddressList> addressLists = addressService.getAddressList(addressInfo);
        model.addAttribute("addressList", addressLists);
        return "user/order/addressList";
    }

    @GetMapping("/register")
    public String addressRegister() {

        return "user/order/addressRegister";
    }
    @PostMapping("/register")
    public String addressRegister(AddressList addressList) {

        String addressListCode = addressService.getAddressListCode();
        addressListCode = CodeIndex.codeIndex(addressListCode, 13);

        addressList.setAddressList(addressListCode);
        addressList.setBuyerId("buyer01");
        addressService.addressRegister(addressList);

        return "redirect:/user/address/success";
    }

    @GetMapping("/success")
    public String successClose() {

        return "user/order/success";
    }

    @GetMapping("/modify/{addressList}")
    public String getAddressModify(@PathVariable(value = "addressList", required = false) String addressList,
                                Model model) {
        Map<String, String> addressInfo = new HashMap<>();
        addressInfo.put("addressList", addressList);
        AddressList addressLists = addressService.getAddressList(addressInfo).get(0);
        model.addAttribute("addressList", addressLists);
        return "user/order/addressModify";
    }

    @PostMapping("/modify")
    public String addressModify(AddressList addressList) {
        addressService.addressModify(addressList);
        log.info("userAddress.addressList, {}", addressList.getAddressList());
        return "redirect:/user/address/list";
    }

    @GetMapping("/delete/{addressList}")
    public String getAddressDelete(@PathVariable("addressList") String addressList) {
        addressService.addressDelete(addressList);
        return "redirect:/user/address/list";
    }

    @GetMapping("/checkoutlist")
    @ResponseBody
    public AddressList checkoutList(@RequestParam(value = "userId", required = false) String userId) {
        userId = "buyer01";
        Map<String, String> addressInfo = new HashMap<>();
        addressInfo.put("userId", userId);
        List<AddressList> addressLists = addressService.getAddressList(addressInfo);

        return addressLists.get(addressLists.size() - 1);
    }
  
}
