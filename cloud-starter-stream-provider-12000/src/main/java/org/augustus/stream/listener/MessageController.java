package org.augustus.stream.listener;

import org.augustus.stream.service.MessageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LinYongJin
 * @date 2020/6/12 9:50
 */
@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private MessageServiceImpl messageService;

    @GetMapping("/sendMessage")
    public String sendMessage() {
        return messageService.sendMessage();
    }
}
