package com.skypro.charliev.thirdcoursework.model;

public class Question {
    private String question;
    private String answer;

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Question)) return false;

        Question question1 = (Question) o;

        if (getQuestion() != null ? !getQuestion().equals(question1.getQuestion()) : question1.getQuestion() != null)
            return false;
        return getAnswer() != null ? getAnswer().equals(question1.getAnswer()) : question1.getAnswer() == null;
    }

    @Override
    public int hashCode() {
        int result = getQuestion() != null ? getQuestion().hashCode() : 0;
        result = 31 * result + (getAnswer() != null ? getAnswer().hashCode() : 0);
        return result;
    }

}
