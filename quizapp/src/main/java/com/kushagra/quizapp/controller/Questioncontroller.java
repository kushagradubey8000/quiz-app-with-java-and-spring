package com.kushagra.quizapp.controller;

import org.springframework.web.bind.annotation.RestController;

import com.kushagra.quizapp.Service.questionService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;





@RestController
@RequestMapping("questionss")



public class Questioncontroller {
    @GetMapping("allQuestions")
    public String getAllQuesstions() {
        return questionService.getAllQuesstions();
    }
    
}
