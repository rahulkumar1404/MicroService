package com.quiz.service;

import java.util.List;

import com.quiz.entites.Quiz;

public interface QuizService {
	public Quiz add(Quiz quiz);
	
	public List<Quiz> get();
	
	public Quiz get(Long id);
	
}
