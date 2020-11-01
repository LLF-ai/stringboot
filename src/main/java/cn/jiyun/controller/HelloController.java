package cn.jiyun.controller;

import cn.jiyun.pojo.Address;
import cn.jiyun.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController//方法的返回值是json
//@Controller//方法的返回值是页面
public class HelloController {


    @Autowired
    AddressService addressService;


    @RequestMapping("list")
    public List<Address> list(){
        return addressService.list();
    }


     @GetMapping("address/{id}")
    public Address getAddressbyid(@PathVariable("id") Integer id){
        return addressService.getbyid(id);
     }

}
