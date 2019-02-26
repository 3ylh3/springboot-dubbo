package com.xiaobai.dubbo.service.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xiaobai.dubbo.service.DubboProviderService;
import org.springframework.stereotype.Component;

@Component
@Service
public class DubboProviderImpl implements DubboProviderService {
    public String provider(String name){
        return "Hello " + name;
    }
}
