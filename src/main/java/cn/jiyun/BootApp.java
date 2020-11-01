package cn.jiyun;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan({"cn.jiyun.mapper"})
public class BootApp {
    //springboot的启动类
    public static void main(String[] args){
        //启动springboot应用
        SpringApplication.run(BootApp.class,args);
    }

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
