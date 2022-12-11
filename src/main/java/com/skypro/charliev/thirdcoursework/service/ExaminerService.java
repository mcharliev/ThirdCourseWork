package com.skypro.charliev.thirdcoursework.service;

import com.skypro.charliev.thirdcoursework.model.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}
