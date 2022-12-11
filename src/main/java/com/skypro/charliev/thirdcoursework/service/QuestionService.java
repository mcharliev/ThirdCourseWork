package com.skypro.charliev.thirdcoursework.service;

import com.skypro.charliev.thirdcoursework.model.Question;

import java.util.Collection;

public interface QuestionService {

    Question add(String question, String answer);

    Question add(Question question);

    Question remove(Question question);

    Collection<Question> getAll();

    Question getRandomQuestion();

    int getSize();
}
