package com.kushagra.quizapp.controller;

import org.springframework.web.bind.annotation.RestController;

import com.kushagra.quizapp.Question;
import com.kushagra.quizapp.Service.QuestionService;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;




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
    @GetMapping("category/{category}")
    public List<Question> getQuestionCategory(@PathVariable String category){
        return questionService.getQuestionByCategory(category);
    }


@PostMapping("add")
    public String addQuestion(@RequestBody Question question){
        
        return questionService.addQuestion(question);
    }
}
