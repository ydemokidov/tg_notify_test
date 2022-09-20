package com.example.tg_notify_test.controller;

import com.example.tg_notify_test.model.NodeRegistryRequest;
import com.example.tg_notify_test.service.TgNotifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NodeRegistryController {


    private final TgNotifyService tgNotifyService;

    @Autowired
    public NodeRegistryController(TgNotifyService tgNotifyService) {
        this.tgNotifyService = tgNotifyService;
    }

    @PostMapping(path = "/registry")
    public void registry(@RequestBody NodeRegistryRequest registryRequest){
        tgNotifyService.notify(registryRequest);
    }

}
