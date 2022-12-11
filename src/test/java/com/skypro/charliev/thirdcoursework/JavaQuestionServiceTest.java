package com.skypro.charliev.thirdcoursework;

import com.skypro.charliev.thirdcoursework.model.Question;
import com.skypro.charliev.thirdcoursework.service.JavaQuestionService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaQuestionServiceTest {
    private JavaQuestionService javaQuestionService;
    private List<Question> actualQuestions;
    private Question question1;
    private Question question2;
    private Question question3;

    @BeforeEach
    public void setQuestionService() {
        javaQuestionService = new JavaQuestionService();
        question1 = javaQuestionService.add(new Question("QuestionAboutWrapperClasses",
                "AnswerAboutWrapperClasses"));
        question2 = javaQuestionService.add(new Question("QuestionAboutPrimitiveDataTypes",
                "AnswerAboutPrimitiveDataTypes"));
        question3 = javaQuestionService.add(new Question("QuestionAboutOOPs",
                "AnswerAboutOOPs"));
        actualQuestions = new ArrayList<>(List.of(question1, question2, question3));
    }

    @Test
    public void shouldGetAllQuestions() {
        Collection<Question> expectedQuestions = javaQuestionService.getAll();
        assertEquals(expectedQuestions, actualQuestions);
    }

    @Test
    public void shouldAddQuestion() {
        Question expectedQuestion = new Question("QuestionAboutWrapperClasses",
                "AnswerAboutWrapperClasses");
        JavaQuestionService javaQuestionServiceTest = new JavaQuestionService();
        javaQuestionServiceTest.add(expectedQuestion);
        expectedQuestion = javaQuestionServiceTest.getRandomQuestion();
        assertEquals(expectedQuestion.getQuestion(), actualQuestions.get(0).getQuestion());
        assertEquals(expectedQuestion.getAnswer(), actualQuestions.get(0).getAnswer());
    }

    @Test
    public void shouldRemoveQuestion() {
        javaQuestionService.remove(question1);
        Collection<Question> expected = javaQuestionService.getAll();
        assertEquals(2, expected.size());
        assertEquals(expected, List.of(question2, question3));
    }

    @Test
    public void shouldGetRandomQuestion() {
        Question actualQuestion = new Question("QuestionAboutWrapperClasses",
                "AnswerAboutWrapperClasses");
        JavaQuestionService javaQuestionServiceTest = new JavaQuestionService();
        javaQuestionServiceTest.add(actualQuestion);
        Question expectedQuestion = javaQuestionServiceTest.getRandomQuestion();
        assertEquals(expectedQuestion,actualQuestion);
    }
}



