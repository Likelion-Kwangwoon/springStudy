package com.study.study.controller.Assign3;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/study")

public class ReadController {

    @PostMapping("/view")
    public JsonArray Read(JsonArray jsonArray){
        return jsonArray;
    }
}