package com.question.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.question.entites.Question;
@Repository
public interface QuestionRepository extends JpaRepository<Question, Long>{
	List<Question> findByQuizId(Integer quizId);
}
