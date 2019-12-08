package com.example.demo.service;

import com.example.demo.dataobject.QuestionScore;

public interface QuestionScoreService {
   public QuestionScore findByQuestionType(String questionType);
}
