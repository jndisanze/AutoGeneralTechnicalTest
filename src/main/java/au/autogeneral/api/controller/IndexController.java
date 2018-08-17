package au.autogeneral.api.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String sayHello() {
        return "Welcome to the Jean paul Librairy application. You can use our API with /tasks/validateBrackets/ or /todo endpoint.";
    }
}
