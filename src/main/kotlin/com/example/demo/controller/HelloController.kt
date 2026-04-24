package com.example.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

data class GreetingResponse(val message: String)

@RestController
class HelloController {

    @GetMapping("/hello")
    fun hello(@RequestParam(defaultValue = "World") name: String): GreetingResponse {
        return GreetingResponse("Hello, $name!")
    }
}
