package com.mangakassa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class Application {

    // Comment
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    public record User(Integer id, String name) {
    }

    @GetMapping
    public List<User> getUsers() {
        return List.of(
                new User(1, "Ahmad"),
                new User(2, "Khadija"),
                new User(3, "Jamila")
        );
    }

}
