package com.example.tg_notify_test.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class NodeRegistryRequest {

    private final String name;

    private final String ip;

    private  final int minRate;

    private final int maxRate;

    @Override
    public String toString() {
        return "Привет. Я новый рабочий узел"+ name + '\''
                + "Мой ip-адрес " + ip + '\'' +
                "Обрабатываю игроков с рейтингом от" + minRate + " до " + maxRate + ".";
    }
}
