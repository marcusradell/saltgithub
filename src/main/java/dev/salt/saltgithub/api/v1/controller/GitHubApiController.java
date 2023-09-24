package dev.salt.saltgithub.api.v1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/saltgithub")
public class GitHubApiController {

    @GetMapping("status")
    public void status() {

    }

}
