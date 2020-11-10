package com.wozu.ccidproject.cicdproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MathController {

    //endpoint that adds two numbers in path
    //and returns sum
    @GetMapping("/add/{x}/{y}")
    public int addIntegers(@PathVariable int x, @PathVariable int y){
        return x + y;
    }


}
