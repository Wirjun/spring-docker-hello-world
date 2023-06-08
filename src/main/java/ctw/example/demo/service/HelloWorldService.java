package ctw.example.demo.service;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class HelloWorldService {

    String helloWorld;

    @PostConstruct
    private void init(){
        helloWorld = "Hello World!\n";
    }

    public String getHelloWorld() {
        return helloWorld;
    }
}
