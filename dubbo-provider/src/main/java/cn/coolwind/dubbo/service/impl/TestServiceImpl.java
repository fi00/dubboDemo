package cn.coolwind.dubbo.service.impl;

import cn.coolwind.dubbo.service.TestService;
import org.springframework.stereotype.Service;

@Service("testService")
public class TestServiceImpl implements TestService {
    public Object test() {
        return "hello world!";
    }
}
