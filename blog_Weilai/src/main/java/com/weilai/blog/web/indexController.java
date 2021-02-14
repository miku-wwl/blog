package com.weilai.blog.web;

import com.weilai.blog.NoFoundException;
import javassist.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {
    @GetMapping("/")
    public String index(){
      //  int a = 9/0;
        String blog = null;
        if (blog == null){

            throw new NoFoundException("博客不存在");
        }

        return "index";
    }

}
