package com.epam.creationaldesignpatterns.factory;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NotificationFactory {

    private final Map<String, NotificationSender> senderMap;

    public NotificationFactory(List<NotificationSender> senderList) {
        this.senderMap = senderList.stream().collect(
                Collectors.toMap(
                        NotificationSender::type,
                        s -> s
                )
        );
    }

    public NotificationSender getSender(String type) {
        NotificationSender sender = senderMap.get(type);

        if(sender == null) {
            throw new IllegalArgumentException("No sender found for type " + type);
        }

        return sender;
    }
}
