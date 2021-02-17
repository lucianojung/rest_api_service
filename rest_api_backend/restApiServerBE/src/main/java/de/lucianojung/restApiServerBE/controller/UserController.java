package de.lucianojung.restApiServerBE.controller;

import de.lucianojung.restApiServerBE.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/me")
    public Object me() {
        return User.getMe();
    }
}
