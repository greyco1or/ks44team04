package ks44team04.service;

import ks44team04.dto.RegularPostHistory;
import ks44team04.mapper.RegularPostMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class RegularPostService {

    RegularPostMapper regularPostMapper;

    public RegularPostService(RegularPostMapper regularPostMapper) {
        this.regularPostMapper = regularPostMapper;
    }

    public List<RegularPostHistory> getRegularPostHistory(String userId) {
        return regularPostMapper.getRegularPostHistory(userId);
    }

    public void setOrderDetailStatus(Map<String, String> orderProcess) {
        regularPostMapper.setOrderDetailStatus(orderProcess);
    }
}
