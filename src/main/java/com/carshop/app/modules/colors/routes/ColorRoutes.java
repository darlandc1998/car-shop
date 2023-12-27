package com.carshop.app.modules.colors.routes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carshop.app.authentication.filters.AuthorizationDataFilter;
import com.carshop.app.http.HttpResponse;
import com.carshop.app.modules.colors.controllers.ColorController;
import com.carshop.app.modules.colors.dtos.ColorRegisterDTO;
import com.carshop.app.modules.colors.dtos.ColorUpdateDTO;

@RestController
@RequestMapping("/api/v1/colors")
public class ColorRoutes extends AuthorizationDataFilter {

    private final ColorController colorController;

    @Autowired
    public ColorRoutes(final ColorController colorController) {
        this.colorController = colorController;
    }

    @GetMapping("/{colorId}")
    public HttpResponse findById(
            @PathVariable final Integer colorId) {
        return this.colorController.findById(getCustomerId(), colorId);
    }

    @GetMapping
    public HttpResponse listAll() {
        return this.colorController.listAll(getCustomerId());
    }

    @PostMapping
    public HttpResponse save(
            @RequestBody ColorRegisterDTO colorRegisterDTO) {
        return this.colorController.save(getCustomerId(), colorRegisterDTO);
    }

    @PutMapping("/{colorId}")
    public HttpResponse update(
            @PathVariable final Integer colorId,
            @RequestBody ColorUpdateDTO colorUpdateDTO) {
        colorUpdateDTO.setId(colorId);
        return this.colorController.update(getCustomerId(), colorUpdateDTO);
    }

    @DeleteMapping("/{colorId}")
    public HttpResponse delete(
            @PathVariable final Integer colorId) {
        return this.colorController.delete(getCustomerId(), colorId);
    }

}
