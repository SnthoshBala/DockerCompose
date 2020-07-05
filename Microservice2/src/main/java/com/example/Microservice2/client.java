package com.example.Microservice2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class client {
    String url="http://client:8080/name/Bala";
    RestTemplate restTemplate=new RestTemplate();
    String finalname=restTemplate.getForObject(url,String.class);
    @GetMapping("/hello")
    public String hello()
    {
        return finalname;
    }
}
