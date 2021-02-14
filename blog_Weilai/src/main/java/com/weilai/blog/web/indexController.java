package com.weilai.blog.web;

import com.weilai.blog.NoFoundException;
import javassist.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class indexController {
    @GetMapping("/")
    public String index(){
        System.out.println("------------index-------------");
        return "index";
    }
    @GetMapping("/blog")
    public String blog(){

        return "blog";
    }
    @GetMapping("/about")
    public String about(){

        return "about";
    }
    @GetMapping("/archives")
    public String archieves(){

        return "archives";
    }
    @GetMapping("/tags")
    public String tags(){

        return "tags";
    }
    @GetMapping("/types")
    public String types(){

        return "types";
    }



}
