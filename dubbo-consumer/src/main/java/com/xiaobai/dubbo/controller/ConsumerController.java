package com.xiaobai.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xiaobai.dubbo.service.DubboProviderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConsumerController {
    @Reference
    private DubboProviderService dubboProviderService;
    @RequestMapping("/consumer")
    public String consumer(Model model){
        String message = dubboProviderService.provider("xiaobai");
        model.addAttribute("message",message);
        return "consumer";
    }
}