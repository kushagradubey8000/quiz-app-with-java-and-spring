package com.kushagra.quizapp.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kushagra.quizapp.Question;

public interface QuestionDao extends JpaRepository<Question, Integer> {

    

    
}
