package com.lanou.controller;

import com.lanou.model.User;
import com.lanou.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
  //我改了
    @RequestMapping(value = "login")
    public String login(){
        return "login";
    }

    //我爱你~~~~~~~~~~~`
}
