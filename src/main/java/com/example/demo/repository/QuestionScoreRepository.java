package com.example.demo.repository;

import com.example.demo.dataobject.QuestionScore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionScoreRepository extends JpaRepository<QuestionScore,Integer > {

    public QuestionScore findByQuestionType(String questionType);
}
