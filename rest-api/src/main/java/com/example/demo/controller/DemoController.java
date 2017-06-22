package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Nhat on 21.06.2017
 */
@RestController
public class DemoController {

  @GetMapping("test")
  public String test() {
    return "Test";
  }
}
