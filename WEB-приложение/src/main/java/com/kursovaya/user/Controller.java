package com.kursovaya.user;

import com.kursovaya.User;
import com.kursovaya.table.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    public UserService userService;

    @PostMapping("/check")
    public String addBlanket(@ModelAttribute("user") User user){
        try {
            User user2 = userService.findBy(user.getLogin(), user.getPassword());
            if(user2 != null)
                return "redirect:/menu";
        }
       catch (Exception e){
           return "redirect:/error";
       }
        return "redirect:/error";
    }

    @GetMapping("/error")
    public String error() {
        return "error";
    }

    @GetMapping("/menu")
    public String menu() {
        return "menu";
    }
}
