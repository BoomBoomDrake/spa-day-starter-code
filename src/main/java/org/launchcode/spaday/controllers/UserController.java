package org.launchcode.spaday.controllers;

import org.launchcode.spaday.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping(value = "/add")
    public String displayAddUserForm() {
        return "user/add";
    }

    @PostMapping(value = "")
    public String processAddUserFormSubmission(Model model, @ModelAttribute User user, String verify){
        if (verify.equals(user.getPassword())) {
            return "user/index";
        } else return "user/add";
    }

}
