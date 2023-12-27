package com.carshop.app.modules.users.routes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carshop.app.http.HttpResponse;
import com.carshop.app.modules.users.controllers.UserController;
import com.carshop.app.modules.users.dtos.UserRegisterDTO;

@RestController
@RequestMapping("/api/v1/users")
public class UserRoutes {

    private final UserController userController;
    private final int DEFAULT_CUSTOMER_ID = 1;

    @Autowired
    public UserRoutes(final UserController userController) {
        this.userController = userController;
    }

    @PostMapping
    public HttpResponse save(@RequestBody final UserRegisterDTO registerDTO) {
        return userController.save(DEFAULT_CUSTOMER_ID, registerDTO);
    }

}
