package com.skypro.charliev.thirdcoursework.service;

import com.skypro.charliev.thirdcoursework.model.Question;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.*;

@Service
public class JavaQuestionService implements QuestionService {
    List<Question> questionsAboutJava = new ArrayList<>();
    Random random = new Random();

    @Override
    public Question add(String question, String answer) {

}
