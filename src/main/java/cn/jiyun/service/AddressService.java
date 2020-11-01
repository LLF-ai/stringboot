package cn.jiyun.service;

import cn.jiyun.mapper.AddressMapper;
import cn.jiyun.pojo.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {


    @Autowired
    AddressMapper addressMapper;

    public List<Address> list(){
        return addressMapper.selectAll();
    }

    public Address getbyid(Integer id) {
        return  addressMapper.selectByPrimaryKey(id);
    }
}
