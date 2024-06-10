package com.quiz.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Question {
	
	private Long questionId;
	private String question;
	private Integer quizId;

}
