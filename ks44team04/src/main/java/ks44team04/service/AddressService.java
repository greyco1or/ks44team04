package ks44team04.service;

import ks44team04.mapper.AddressMapper;
import ks44team04.dto.AddressList;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class AddressService {

    private final AddressMapper addressMapper;

    public AddressService(AddressMapper addressMapper) {
        this.addressMapper = addressMapper;
    }

    public List<AddressList> getAddressList(Map addressInfo) {
        List<AddressList> addressLists = addressMapper.getAddressList(addressInfo);
        return addressLists;
    }

    public String getAddressListCode() {
        String addressListCode = addressMapper.getAddressListCode();
        return addressListCode;
    }

    public void addressRegister(AddressList addressList) {
        addressMapper.addressRegister(addressList);
    }

    public void addressModify(AddressList addressList) {
        addressMapper.addressModify(addressList);
    }

    public void addressDelete(String addressList) {
        addressMapper.addressDelete(addressList);
    }


}
