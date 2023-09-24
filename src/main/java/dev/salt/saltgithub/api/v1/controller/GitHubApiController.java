package dev.salt.saltgithub.api.v1.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/saltgithub")
@AllArgsConstructor
public class GitHubApiController {

  @GetMapping("status")
  public void status() {}
}
