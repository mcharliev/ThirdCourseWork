package com.skypro.charliev.thirdcoursework;

import com.skypro.charliev.thirdcoursework.exception.InvalidAmountException;
import com.skypro.charliev.thirdcoursework.model.Question;
import com.skypro.charliev.thirdcoursework.service.ExaminerServiceImpl;
import com.skypro.charliev.thirdcoursework.service.JavaQuestionService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

import java.util.Collection;
import java.util.Set;


import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(MockitoExtension.class)
public class ExaminerServiceTest {

    private Question question = new Question("QuestionAboutWrapperClasses",
            "AnswerAboutWrapperClasses");

    @Mock
    private JavaQuestionService javaQuestionService;

    @InjectMocks
    private ExaminerServiceImpl examinerService;


    @Test
    public void shouldGetQuestions() {
        when(javaQuestionService.getSize()).thenReturn(1);
        when(javaQuestionService.getRandomQuestion()).thenReturn(question);
        Collection<Question> expected = Set.of(question);
        Collection<Question> actual = examinerService.getQuestions(1);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetQuestion() {
        assertThrows(InvalidAmountException.class, () -> examinerService.getQuestions(5));
    }

}
