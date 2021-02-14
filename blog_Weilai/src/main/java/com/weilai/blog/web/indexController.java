package com.weilai.blog.web;

import com.weilai.blog.NoFoundException;
import javassist.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class indexController {
    @GetMapping("/{id}/{name}")
    public String index(@PathVariable  Integer id,@PathVariable String name){
//      //  int a = 9/0;
//        String blog = null;
//        if (blog == null){
//
//            throw new NoFoundException("博客不存在");
//        }
        System.out.println("------------index-------------");
        return "index";
    }

}
