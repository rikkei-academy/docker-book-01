package rikkei.academy.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rikkei.academy.dto.response.ResponseMessage;

@RestController
@CrossOrigin
@RequestMapping("/api/helloworld")
public class HelloWorldApi {
    @GetMapping
    public ResponseEntity<?> helloWorld() {
        return ResponseEntity.ok(new ResponseMessage("Hello World!!!"));
    }
}