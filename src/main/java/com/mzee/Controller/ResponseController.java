package com.mzee.Controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
public class ResponseController {

    @GetMapping("/guuleyste")
    public ResponseEntity<String> guuleyste() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Custom-Header", "Value");
        return ResponseEntity.ok()
                .headers(headers)
                .body("Codsigagu wuu guuleystay, Hore u soco!");
    }

    @GetMapping("/lamaHelin")
    public ResponseEntity<String> lamaHelin() {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("Codsigagu wuu guuldareyste, Dib ulaabo!");
    }

    @PostMapping("/abuur")
    public ResponseEntity<String> abuur() {
        URI location = URI.create("/codsi/123");
        return ResponseEntity.created(location)
                .body("Codsi cusub ayaa lagu abuuray!");
    }
}
