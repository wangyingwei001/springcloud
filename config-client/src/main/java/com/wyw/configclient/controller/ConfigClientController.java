package com.wyw.configclient.controller;


import com.wyw.configclient.config.ConfigInfoProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ConfigClientController {

    @Autowired
    private ConfigInfoProperties configInfoValue;

    @GetMapping("/configInfo")
    public String configInfo(){
        return configInfoValue.getConfig();
    }
}
