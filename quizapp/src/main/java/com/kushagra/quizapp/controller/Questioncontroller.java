package com.kushagra.quizapp.controller;

import org.springframework.web.bind.annotation.RestController;

import com.kushagra.quizapp.Question;
import com.kushagra.quizapp.Service.QuestionService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;



@RestController
@RequestMapping("questionss")



public class Questioncontroller {
    final QuestionService questionService;

    Questioncontroller(QuestionService questionService) {
        this.questionService = questionService;
    }
    @GetMapping("allQuestions")
    public List<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }
    
}
