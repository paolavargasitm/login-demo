package com.co.itm.login.demo.auth.controller;

import com.co.itm.login.demo.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/register")
    public String registerPage() {
        return "register";
    }

    @PostMapping("/register")
    public String register (@RequestParam String username,
                            @RequestParam String password,
                            Model model) {
        userService.registerUser(username, password);
        model.addAttribute("message", "Usuario registrado con éxito. Ahora puedes iniciar sesión.");
        return "login";
    }

    @PostMapping("/login")
    public String login (@RequestParam String username,
                         @RequestParam String password,
                         Model model) {

        if (userService.validateLogin(username, password)) {
            model.addAttribute("message", "Bienvenido " + username + "!");
            return "success";
        } else {
            model.addAttribute("errorMessage", "Credenciales incorrectas");
            return "error";
        }
    }
}