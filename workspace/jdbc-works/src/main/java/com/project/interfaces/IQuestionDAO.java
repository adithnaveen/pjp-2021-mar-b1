package com.project.interfaces;

import java.util.List;

import com.project.entity.Question;

// contracts 
public interface IQuestionDAO {
	
	public boolean insertQuestion(Question question); 
	public List<Question> getAllQuestion(); 
	public Question getQuestion(int qId); 
}
