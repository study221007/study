package study.sportstoto.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

  @GetMapping
  public ResponseEntity<String> get() {
    return ResponseEntity.ok("get success!");
  }

  @PostMapping
  public ResponseEntity<?> create() {
    return ResponseEntity.ok("created!");
  }

  @GetMapping
  public ResponseEntity<String> getTest() {
    return ResponseEntity.noContent().build();
  }
}
