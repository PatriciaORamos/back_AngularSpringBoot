package br.com.project.ang_spring.model;

import org.springframework.stereotype.Component;

@Component
public class Message {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
