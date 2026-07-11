package com.kushagra.quizapp.Service;
import com.kushagra.quizapp.Question;
import com.kushagra.quizapp.Dao.QuestionDao;

import java.util.List;


import org.springframework.stereotype.Service;
@Service

public class QuestionService {
    final QuestionDao questionDao;

    QuestionService(QuestionDao questionDao) {
        this.questionDao = questionDao;
    }
    public List<Question> getAllQuestions(){
            return questionDao.findAll();
    }
}
