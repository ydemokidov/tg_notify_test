package com.example.tg_notify_test.service;

import com.example.tg_notify_test.model.NodeRegistryRequest;
import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.response.SendResponse;
import org.springframework.stereotype.Service;

@Service
public class TgNotifyService {

    private final TelegramBot tgBot;

    public TgNotifyService() {
        this.tgBot = new TelegramBot("5651331024:AAG6Mxxg1Ymwhy0uEXigb8fOe4K908xv1QM");
    }

    public void notify(NodeRegistryRequest registryRequest){
        SendResponse response = tgBot.execute(new SendMessage("274332174",registryRequest.toString()));
    }

}
