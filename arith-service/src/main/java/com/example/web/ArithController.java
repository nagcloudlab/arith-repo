package com.example.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/arith")
public class ArithController {

    @GetMapping("/add/{n1}/{n2}")
    public ResponseEntity<String> add(
            @PathVariable("n1") int n1,
            @PathVariable("n2") int n2) {
        int result = n1 + n2;
        return ResponseEntity.ok(String.valueOf(result));
    }
    @GetMapping("/sub/{n1}/{n2}")
    public ResponseEntity<String> sub(
            @PathVariable("n1") int n1,
            @PathVariable("n2") int n2) {
        int result = n1 - n2;
        return ResponseEntity.ok(String.valueOf(result));
    }
    @GetMapping("/mul/{n1}/{n2}")
    public ResponseEntity<String> mul(
            @PathVariable("n1") int n1,
            @PathVariable("n2") int n2) {
        int result = n1 - n2
        return ResponseEntity.ok(String.valueOf(result));
    }


}
