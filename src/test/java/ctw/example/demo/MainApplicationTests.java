package ctw.example.demo;

import ctw.example.demo.service.HelloWorldService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MainApplicationTests {

    @Autowired
    private HelloWorldService helloWorldService;

    @Test
    public void test() {
        String expected = "Hello World!\n";
        String actual = helloWorldService.getHelloWorld();
        Assertions.assertEquals(expected, actual);
    }
}
