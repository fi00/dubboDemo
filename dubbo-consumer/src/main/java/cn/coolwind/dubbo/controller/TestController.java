package cn.coolwind.dubbo.controller;

import cn.coolwind.dubbo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/test")
    @ResponseBody
    public Object test() {
        return testService.test();
    }
}
