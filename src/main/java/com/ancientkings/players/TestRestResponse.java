package com.ancientkings.players;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestResponse {

    @GetMapping(value="/bady", produces = MediaType.TEXT_PLAIN_VALUE)
    public String test(){
        return "HELLO, MY NAME IS BADY, BUT YOU CAN CALL ME: ANYTIME";
    }

}
