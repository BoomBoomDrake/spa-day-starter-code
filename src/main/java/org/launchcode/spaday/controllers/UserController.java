package org.launchcode.spaday.controllers;

import org.launchcode.spaday.data.UserData;
import org.launchcode.spaday.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping(value = "/add")
    public String displayAddUserForm() {
        return "user/add";
    }
    @GetMapping(value = "")
    public String displayUserList(Model model) {
        model.addAttribute("users", UserData.getAll());
        return "user/index";
    }
    @PostMapping(value = "")
    public String processAddUserFormSubmission(Model model, @ModelAttribute User user, String verify){
        if (verify.equals(user.getPassword())) {
            UserData.add(user);
            return "redirect:/user";
        } else return "user/add";
    }

    @GetMapping(value = "/user")
    public String displayUserDetails(Model model, @RequestParam int id) {
        model.addAttribute("user", UserData.getById(id));
        return "user/user";
    }

}
