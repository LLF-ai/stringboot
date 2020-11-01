package cn.jiyun.test;

import cn.jiyun.BootApp;
import cn.jiyun.pojo.Address;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootApp.class)
public class AppTest {


    @Autowired
    RestTemplate restTemplate;

    @Test
    public void test(){
        Address address = restTemplate.getForObject("http://localhost:8080/address/1", Address.class);
        System.out.println(address);
//        for (Object o : forObject) {//forObject.for //for循环
//            System.out.println(o);//o.sout 输出语句
//        }

    }


}
