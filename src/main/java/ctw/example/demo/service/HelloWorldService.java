package ctw.example.demo.service;

import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service
public class HelloWorldService {

    private String helloWorld;

    @PostConstruct
    private void init(){
        helloWorld = "Hello World!\n";
    }

    public String getHelloWorld() {
        return helloWorld;
    }
}
