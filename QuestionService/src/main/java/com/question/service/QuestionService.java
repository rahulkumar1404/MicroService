package com.question.service;

import java.util.List;

import com.question.entites.Question;

public interface QuestionService {
	
	Question create(Question question);
	
	List<Question> get();
	
	Question getOne(Long id);
	

	List<Question> getQuestionOfQuiz(Integer quizId);

}
