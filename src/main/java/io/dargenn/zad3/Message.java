package io.dargenn.zad3;

import java.io.Serializable;

public class Message implements Serializable {
    private Long id;
    private String author;
    private String content;

    public Message() {
    }

    public Message(Long id, String author, String content) {
        this.id = id;
        this.author = author;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
