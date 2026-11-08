package com.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest
@AutoConfigureMockMvc
class DemoApplicationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testHomeEndpoint() throws Exception {

        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(content().string(
                    "Hello! Java application deployed using AWS CI/CD!"
                ));
    }

    @Test
    void testHealthEndpoint() throws Exception {

        mockMvc.perform(get("/health"))
                .andExpect(status().isOk())
                .andExpect(content().string(
                    "Application is healthy!"
                ));
    }

    @Test
    void testVersionEndpoint() throws Exception {

        mockMvc.perform(get("/version"))
                .andExpect(status().isOk())
                .andExpect(content().string(
                    "Version 1.0"
                ));
    }

    @Test
    void testInvalidEndpoint() throws Exception {

        mockMvc.perform(get("/invalid"))
                .andExpect(status().isNotFound());
    }
}
