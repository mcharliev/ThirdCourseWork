package com.skypro.charliev.thirdcoursework.controller;

import com.skypro.charliev.thirdcoursework.model.Question;
import com.skypro.charliev.thirdcoursework.service.JavaQuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class JavaQuestionController {
    private final JavaQuestionService service;

    public JavaQuestionController(JavaQuestionService javaQuestionService) {
        this.service = javaQuestionService;
    }
    @PostMapping("exam/java/add")
    public Question addQuestion(@RequestParam String question, @RequestParam String answer) {
        return this.service.add(question, answer);
    }

    @DeleteMapping("exam/java/remove")
    public Question removeQuestion(@RequestParam String question, @RequestParam String answer) {
        return this.service.remove(new Question(question, answer));
    }

    @GetMapping("exam/java")
    public Collection<Question> getQuestions() {
        return this.service.getAll();
    }
}

