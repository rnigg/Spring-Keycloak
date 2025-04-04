package rhafen.springboot.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping(value="hello")
    String hello(){
        return "Hello from HomeController";
    }
}
