package com.example.spring.controller;

import com.example.spring.DTO.Teacher;
import com.example.spring.repository.UserRepository;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HardController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/add")
    public String add(@RequestBody Teacher user) {
        userRepository.save(user);
       return ("添加");

    }
    @GetMapping("/select")
    public  List select(@RequestParam Long id){
        List<Teacher> teacherList = userRepository.findAll();
        return teacherList;
    }
    @GetMapping("/update")
    public List update(@RequestParam Long gender){
        List<Teacher> teacherList = userRepository.findAll();
        return teacherList;
    }

}












