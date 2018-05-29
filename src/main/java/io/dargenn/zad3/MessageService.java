package io.dargenn.zad3;

import io.dargenn.zad1_4.MessageSearch;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
class MessageService {
    private List<Message> messages = new ArrayList<>();

    @PostConstruct
    private void populate() {
        messages.add(new Message(1L, "1", "tresc1"));
        messages.add(new Message(2L, "2", "aa2"));
        messages.add(new Message(3L, "3", "aa3"));
        messages.add(new Message(4L, "4", "bb4"));
        messages.add(new Message(5L, "5", "bb5"));
        messages.add(new Message(6L, "6", "cc6"));
        messages.add(new Message(7L, "7", "cc7"));
        messages.add(new Message(8L, "8", "cc8"));
    }

    List<Message> getMessages(String startsWith) {
        if (startsWith != null) {
            return messages.stream().filter(message -> message.getContent().startsWith(startsWith)).collect(Collectors.toList());
        }
        return messages;
    }

    List<Message> getMessagesByParams(MessageSearch messageSearch) {
        return messages.stream()
                .filter(message -> message.getContent().startsWith(messageSearch.getContent()) && message.getAuthor().startsWith(messageSearch.getAuthor()))
                .collect(Collectors.toList());
    }
}
