package com.quiz.controllers;

import com.quiz.entities.Question;
import com.quiz.entities.Question_Answer;
import com.quiz.services.IQuestionAnswerService;
import com.quiz.services.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/questions")
public class QuestionController {
    @Autowired
    private IQuestionService questionService;
    @Autowired
    private IQuestionAnswerService questionAnswerService;

    @ModelAttribute("questionAnswers")
    private Iterable<Question_Answer> findAll() {
        return questionAnswerService.findAll();
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<Iterable<Question>> listQuestion() {
        Iterable<Question> questions = questionService.findAll();
        if (questions == null) {
            return new ResponseEntity<Iterable<Question>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<Iterable<Question>>(questions, HttpStatus.OK);
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Question> updateQuestion(@PathVariable("id") Long id, @RequestBody Question question) {
        System.out.println("Updating Question " + id);
        if (!questionService.findById(id).isPresent()) {
            return new ResponseEntity<Question>(HttpStatus.NOT_FOUND);
        }
        question.setId(id);
        return new ResponseEntity<Question>(questionService.save(question), HttpStatus.OK);

    }
}
