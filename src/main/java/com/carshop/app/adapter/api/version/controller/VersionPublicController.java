package com.carshop.app.adapter.api.version;

import com.carshop.app.infrastructure.http.HttpResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public/versions")
public class VersionPublicController {

    private final VersionPublicControllerAdapter versionPublicControllerAdapter;

    public VersionPublicController(final VersionPublicControllerAdapter versionPublicControllerAdapter) {
        this.versionPublicControllerAdapter = versionPublicControllerAdapter;
    }

    @GetMapping("/v1")
    public HttpResponse listAllUniversal() {
        return this.versionPublicControllerAdapter.listAllUniversal();
    }

}
