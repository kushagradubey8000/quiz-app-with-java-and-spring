package com.kushagra.quizapp.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kushagra.quizapp.Question;

public interface QuestionDao extends JpaRepository<Question, Integer> {

    List<Question> findByCategory(String category);

    
}
