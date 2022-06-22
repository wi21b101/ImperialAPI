package com.example.imperialapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImperialAPIController {

    ImperialAPI imperial = new ImperialAPI();

    @RequestMapping
    public double gram(
            @RequestParam double ounce){
        return imperial.gram(ounce);
    }
}
