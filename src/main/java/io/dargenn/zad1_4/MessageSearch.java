package io.dargenn.zad1_4;

import java.io.Serializable;

public class MessageSearch implements Serializable {
    private String author;
    private String content;

    public MessageSearch() {

    }

    public MessageSearch(String author, String content) {
        this.author = author;
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
