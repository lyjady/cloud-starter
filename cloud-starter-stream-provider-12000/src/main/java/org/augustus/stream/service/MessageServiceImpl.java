package org.augustus.stream.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author LinYongJin
 * @date 2020/6/12 9:42
 */
@Service
@EnableBinding(Source.class)
public class MessageServiceImpl {

    @Autowired
    @Qualifier(value = "output")
    private MessageChannel channel;

    public String sendMessage() {
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        channel.send(MessageBuilder.withPayload(uuid).build());
        return "success";
    }
}
