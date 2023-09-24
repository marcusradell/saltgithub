package dev.salt.saltgithub.api.v1.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class GitHubApiControllerTest {

  @Autowired private GitHubApiController gitHubApiController;
  @Autowired private MockMvc mockMvc;

  @SneakyThrows
  @Test
  void shouldReturn200Ok() {
    mockMvc.perform(get("/api/v1/saltgithub/status")).andExpect(status().isOk());
  }
}
