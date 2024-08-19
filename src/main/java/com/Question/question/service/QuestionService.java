package com.Question.question.service;

import com.Question.question.Question;
import com.Question.question.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionDao questionDao;
    public List<Question> getAllQuestion(){
        return questionDao.findAll();
    }
    public List<Question> getQuestionByCategory(String category) {
        return questionDao.findByCategory(category);
    }
    public String addQuestion(Question question)
    {
        questionDao.save(question);
        return "Inserted successfuly";
    }

    public String updateQuestion(Question question) {
        questionDao.save(question);
        return "Updated successfully";
    }

    public String deleteQuestion(Question question) {
        questionDao.delete(question);
        return "Deleted successfully";
    }

}