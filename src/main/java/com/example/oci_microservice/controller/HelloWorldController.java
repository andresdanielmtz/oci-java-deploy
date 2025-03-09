package com.example.oci_microservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {
    @GetMapping
    public String helloWorld() {
        return "<html>" +
                "<body>" +
                "<h1>Hello, World!</h1>" +
                "<p>For more information, visit <a href='https://github.com/andresdanielmtz/oci-java-deploy'>the project repository</a>.</p>" +
                "</body>" +
                "</html>";
    }
}
