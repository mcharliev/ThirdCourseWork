package com.skypro.charliev.thirdcoursework.service;

import com.skypro.charliev.thirdcoursework.exception.InvalidAmountException;
import com.skypro.charliev.thirdcoursework.model.Question;
import org.springframework.stereotype.Service;


import java.util.Collection;
import java.util.HashSet;


@Service
public class ExaminerServiceImpl implements ExaminerService {
    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount)  {
        if (amount > questionService.getSize()) {
            throw new InvalidAmountException();
        }
        Collection<Question> randomQuestions = new HashSet<>();
        while (randomQuestions.size() < amount) {
            randomQuestions.add(questionService.getRandomQuestion());
        }
        return randomQuestions;
    }
}
