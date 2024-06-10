package com.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryNameSpaceHandler;
import org.springframework.stereotype.Repository;

import com.quiz.entites.Quiz;

@Repository
public interface QuizRepo extends JpaRepository<Quiz, Long>{
	
}
