package io.dargenn.zad3;

import io.dargenn.zad1_4.MessageSearch;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MessageResource {
    private final MessageService messageService;

    public MessageResource(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/messages")
    public List<Message> getMessages(@RequestParam(value = "startsWith", required = false) String startsWith) {
        return messageService.getMessages(startsWith);
    }

    @PostMapping("/messages")
    public List<Message> getMessages(@RequestBody MessageSearch messageSearch) {
        return messageService.getMessagesByParams(messageSearch);
    }
}
