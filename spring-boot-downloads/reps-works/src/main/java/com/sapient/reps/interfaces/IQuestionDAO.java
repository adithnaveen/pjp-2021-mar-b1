package com.sapient.reps.interfaces;

import java.util.List;

import com.sapient.reps.entity.Question;

// contracts 
public interface IQuestionDAO {
	
	public boolean insertQuestion(Question question); 
	public List<Question> getAllQuestion(); 
	public Question getQuestion(int qId); 
}
