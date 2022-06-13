
package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.*;
              
@SpringBootApplication
@RestController
public class DemoApplication {
                
  @CrossOrigin(origins = "*")
  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }
  @CrossOrigin(origins = "http://localhost:8081")
  @RequestMapping(value = "/hello", headers = "Accept=application/json")
  public Map hello() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("name", "Sazzadul Alam Ibrahim");
        map.put("age", "30");
        map.put("qualification", "M.Eng.in ICE");
        
        return map;
    }
                
}
            
            