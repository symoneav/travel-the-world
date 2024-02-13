package com.traveltheworld.traveltheworld;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController

public class travelTheWorldController {

    // public String getMethodName(@RequestParam String param) {
    //     return new String();
    // }
    @GetMapping("/welcome")
    public String first_api(){
        return "Welcome to a traveler's bestfriend";
    }
}
