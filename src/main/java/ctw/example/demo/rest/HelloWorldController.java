package ctw.example.demo.rest;

import ctw.example.demo.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping("/helloWorld")
    String helloWorld()  {
        return helloWorldService.getHelloWorld();
    }
}
