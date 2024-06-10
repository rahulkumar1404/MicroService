package com.question.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.question.entites.Question;
import com.question.service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {

	@Autowired
	private QuestionService questionService;
	
	//create
	@PostMapping
	public Question create(@RequestBody Question question) {
		return questionService.create(question);
	}

	//get all
	@GetMapping
	public List<Question> getAll( Question question){
		return questionService.get();
	}

	//get by id
	@GetMapping("/{id}")
	public Question get(@PathVariable Long id) {
		return questionService.getOne(id);
	}
	
	//get all question of specific quiz
	@GetMapping("/quiz/{quizId}")
	public List<Question> getQuestionOfQuiz(@PathVariable Integer quizId){
		return questionService.getQuestionOfQuiz(quizId);
	}
	
}
