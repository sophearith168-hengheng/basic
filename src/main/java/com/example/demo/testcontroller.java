package com.example.demo;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/api/user")
public class testcontroller {
    @GetMapping("/")
    public String Get(){
        return "This is Get Method";
    }

    @GetMapping("/{id}")
    public String Get(@PathVariable int id){
        return "This is Get By ID Method" + id;
    }

    @PostMapping("/create")
    public Map<String, Object> Create(@RequestBody Map<String, Object>body){
        return body;
    }

    @PutMapping("/update/{id}")
    public Map<String, Object> Update(@PathVariable int id,@RequestBody Map<String, Object>body){
        return body;
    }

    @DeleteMapping("/delete/{id}")
    public String Delete(@PathVariable int id){
        return "This is Delete Method";
    }

//    Request Param
//    localhost:8080/api/user/search?name=rith&id=1&age=21
    @GetMapping("/search")
    public String Search(@RequestParam String name ,@RequestParam int id , @RequestParam int age){
        return "This is Search Method";
    }
}
