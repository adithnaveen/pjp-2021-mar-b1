package com.sapient.reps.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.reps.dao.QuestionDOO;
import com.sapient.reps.entity.Question;
import com.sapient.reps.interfaces.IQuestionDAO;

// http://localhost:8080/api  - health
//http://localhost:8080/api/questions - all questions
//http://localhost:8080/api/question - all questions 

@RestController
@RequestMapping("/api")
public class QuestionController {

	
	IQuestionDAO dao = new QuestionDOO(); 
	
	@GetMapping
	public String health() {
		return "Service is Up... ";
	}
	
	@GetMapping("/questions")
	public List<Question> getAllQuestion() {
		return dao.getAllQuestion(); 
	}
	
	@PostMapping("/question")
	public String insertQuestion(@RequestBody Question question) {
		return dao.insertQuestion(question)
				?"Inserted":"Not Inserted";  
	}
	
	@GetMapping("/question/{qId}")
	public Question getQuestion(@PathVariable
			int qId) {
		return dao.getQuestion(qId); 
	}
	
	
}

















