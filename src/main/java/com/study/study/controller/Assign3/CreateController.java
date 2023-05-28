package com.study.study.controller.Assign3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/study")

public class CreateController {

    @PostMapping("/create")
    public String create(MultiParam multiParam){
        return "Success";
    }
}
