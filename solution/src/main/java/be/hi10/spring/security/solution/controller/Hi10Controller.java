package be.hi10.spring.security.solution.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hi10Controller {

    @GetMapping("/secured")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("secured");
    }

    @GetMapping("/secured-admin")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<String> testAdmin() {
        return ResponseEntity.ok("secured admin");
    }
}
