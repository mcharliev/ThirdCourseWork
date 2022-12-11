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
        if (!StringUtils.isAlpha(question) ||
                !StringUtils.isAlpha(answer)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
        Question newQuestion = new Question(StringUtils.capitalize(question),
                StringUtils.capitalize(answer));
        questionsAboutJava.add(newQuestion);
        return newQuestion;
    }

    @Override
    public Question add(Question question) {
        questionsAboutJava.add(question);
        return question;
    }

    @Override
    public Question remove(Question question) {
        questionsAboutJava.remove(question);
        return question;
    }

    @Override
    public Collection<Question> getAll() {
        return questionsAboutJava;
    }

    @Override
    public Question getRandomQuestion() {
        int index = random.nextInt(questionsAboutJava.size());
        return questionsAboutJava.get(index);
    }

    @Override
    public int getSize() {
        return questionsAboutJava.size();
    }
}
