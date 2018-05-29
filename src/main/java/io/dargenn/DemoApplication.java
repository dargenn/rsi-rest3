package io.dargenn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(DemoApplication.class, args);

        RestTemplate restTemplate = new RestTemplate();
        RemoteMessage message = restTemplate.getForObject("http://localhost:8079/messages/1", RemoteMessage.class);
        System.out.println(message);

        RemoteMessage messageToPost = new RemoteMessage(99L, "abc", "1241532efwe");
        restTemplate.postForObject("http://localhost:8079/messages", messageToPost, RemoteMessage.class);
        Thread.sleep(1000);
        System.out.println("Message after post: " + restTemplate.getForObject("http://localhost:8079/messages/4", RemoteMessage.class));
    }
}
