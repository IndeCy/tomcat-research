package cn.chenyang.research.tomcat.tomcatresearch;

import org.springframework.web.bind.annotation.RestController;

/**
 * @Package: cn.chenyang.research.tomcat.tomcatresearch
 * @Author: chenyang
 * @Date: 2020/12/30
 * @Version: 1.0
 */
@RestController
public class MyController {

    public MyController(){
        System.out.println("init my controller");
    }
}
