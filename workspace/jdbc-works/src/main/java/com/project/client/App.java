package com.project.client;

import com.project.dao.QuestionDOO;
import com.project.entity.Question;
import com.project.interfaces.IQuestionDAO;

public class App {
	public static void main(String[] args) {
		
		Question question = new Question(); 
		question.setqId(102);
		question.setTitle("How can you be fit");
		question.setDescription("dont simply sit work out to burn calories"); 
		question.setVote(3);
		
		IQuestionDAO dao = new QuestionDOO(); 
		
//		System.out.println(dao.insertQuestion(question) ?"Inserted":"Not Inserted");
		
		for(Question q : dao.getAllQuestion()) {
			System.out.println(q);
		}
		
		
	}
}
