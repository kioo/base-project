package com.wangchi.baseproject.modules.app.controller;

import com.wangchi.baseproject.common.utils.BPResponseBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppTestController {

    @GetMapping("/hello")
    public BPResponseBody sayHello(){
        return BPResponseBody.ok();
    }
}
