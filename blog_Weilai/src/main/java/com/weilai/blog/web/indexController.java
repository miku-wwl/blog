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

    @GetMapping("/admin/index")
    public String admin_index(){

        return "admin/index";
    }
    @GetMapping("/admin/login")
    public String admin_login(){

        return "admin/login";
    }

    @GetMapping("/admin/blogs")
    public String admin_blogs(){

        return "admin/blogs";
    }
    @GetMapping("/admin/blogs-input")
    public String admin_blogs_input(){

        return "admin/blogs-input";
    }




}
