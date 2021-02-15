package com.weilai.blog.service;

import com.weilai.blog.po.User;

public interface UserService {
    User checkUser(String username,String password);
    
}
