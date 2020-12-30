package cn.chenyang.research.tomcat.tomcatresearch;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Package: cn.chenyang.research.tomcat.tomcatresearch
 * @Author: chenyange
 * @Date: 2020/12/30
 * @Version: 1.0
 */
public class MyAutoConfiguration {

    public MyAutoConfiguration() {
        System.out.println("my autoconfiguration");
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
