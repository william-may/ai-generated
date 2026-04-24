package com.example.demo.controller

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import org.springframework.test.web.servlet.setup.MockMvcBuilders

class HelloControllerTest {

    private lateinit var mockMvc: MockMvc

    @BeforeEach
    fun setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(HelloController()).build()
    }

    @Test
    fun `hello returns default greeting`() {
        mockMvc.perform(get("/hello"))
            .andExpect(status().isOk)
            .andExpect(jsonPath("$.message").value("Hello, World!"))
    }

    @Test
    fun `hello returns greeting with name`() {
        mockMvc.perform(get("/hello").param("name", "Kotlin"))
            .andExpect(status().isOk)
            .andExpect(jsonPath("$.message").value("Hello, Kotlin!"))
    }
}
