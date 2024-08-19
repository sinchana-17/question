package com.Question.question.controller;
import com.Question.question.Question;
import com.Question.question.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("question")
public class QuestionController {
    @Autowired
    QuestionService questionService;

    @GetMapping("allQuestion")
    public List<Question> getAllQuestion() {
        return questionService.getAllQuestion();
    }
    @GetMapping("category/{category}")
    public List<Question> getQuestionByCategory(@PathVariable String category)
    {
        return questionService.getQuestionByCategory(category);
    }
    @PostMapping("add")
    public String addQuestion(@RequestBody Question question)
    {
        return questionService.addQuestion(question);
    }
    @PutMapping("update")
    public String updateQuestion(@RequestBody Question question)
    {
        return questionService.updateQuestion(question);
    }
    @DeleteMapping("delete")
    public String deleteQuestion(@RequestBody Question question)
    {
        return questionService.deleteQuestion(question);
    }
}
