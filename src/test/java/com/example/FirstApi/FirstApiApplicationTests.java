package com.example.FirstApi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootTest
@RestController
class FirstApiApplicationTests {

	@Test
	@RequestMapping("/")
    public String home(){
        return "Hello World!";
    }

}
