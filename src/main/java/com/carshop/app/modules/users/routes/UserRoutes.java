package com.carshop.app.modules.users.routes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carshop.app.authentication.filters.AuthorizationDataFilter;
import com.carshop.app.http.HttpResponse;
import com.carshop.app.modules.users.controllers.UserController;
import com.carshop.app.modules.users.dtos.UserRegisterDTO;

@RestController
@RequestMapping("/api/v1/users")
public class UserRoutes extends AuthorizationDataFilter {

    private final UserController userController;

    @Autowired
    public UserRoutes(final UserController userController) {
        this.userController = userController;
    }

    @GetMapping
    public HttpResponse listAll() {
        return userController.listAll(getCustomerId());
    }

    @GetMapping("/{userId}")
    public HttpResponse findById(
            @PathVariable final Integer userId) {
        return userController.findById(getCustomerId(), userId);
    }

    @PostMapping
    public HttpResponse save(@RequestBody final UserRegisterDTO registerDTO) {
        return userController.save(getCustomerId(), registerDTO);
    }

}
