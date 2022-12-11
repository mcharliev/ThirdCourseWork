package com.skypro.charliev.thirdcoursework.controller;

import com.skypro.charliev.thirdcoursework.model.Question;
import com.skypro.charliev.thirdcoursework.service.ExaminerServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class ExamController {
    ExaminerServiceImpl examinerService;

    public ExamController(ExaminerServiceImpl examinerService) {
        this.examinerService = examinerService;
    }
    @GetMapping("exam/java/random/{amount}")
    Collection<Question> getQuestions(@PathVariable int amount) {
        return this.examinerService.getQuestions(amount);
    }
}
