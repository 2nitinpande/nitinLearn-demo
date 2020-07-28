package com.nitinlearn.nitinlearndemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {

@RequestMapping("/demo")
    public String getDemodata (){
      return "Hello World with Feature01";
}


}
