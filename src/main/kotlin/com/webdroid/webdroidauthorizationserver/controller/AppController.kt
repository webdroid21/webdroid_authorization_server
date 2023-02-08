package com.webdroid.webdroidauthorizationserver.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class AppController {

    @GetMapping("/")
    fun home(): String {
        return "index"
    }

}