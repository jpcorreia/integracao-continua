package com.br.jp.integracaocontinua.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class MainController {

    @GetMapping(path = "/home")
    public ResponseEntity home() {
        return ResponseEntity.ok("Ok, vc está na home.");
    }
}
