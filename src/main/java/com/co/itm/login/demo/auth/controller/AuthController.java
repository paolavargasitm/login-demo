package com.co.itm.login.demo.auth.controller;

import com.co.itm.login.demo.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String register(@RequestBody Map<String, String> request) {
        String username = request.get("username");
        String password = request.get("password");
        userService.registerUser(username, password);
        return "Usuario registrado con éxito";
    }

    @PostMapping("/login")
    public String login(@RequestBody Map<String, String> request) {
        String username = request.get("username");
        String password = request.get("password");

        if (userService.validateLogin(username, password)) {
            return "Login exitoso";
        } else {
            return "Credenciales incorrectas";
        }
    }
}