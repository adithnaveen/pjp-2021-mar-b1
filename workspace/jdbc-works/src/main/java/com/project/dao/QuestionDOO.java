package com.project.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.project.entity.Question;
import com.project.interfaces.IQuestionDAO;
import com.project.utils.DbConnect;

public class QuestionDOO implements IQuestionDAO {

	public boolean insertQuestion(Question question) {
		
		String sql ="insert into question values(?,?,?,?)";
		try {
			PreparedStatement ps = DbConnect.getMySQLConn().prepareStatement(sql);
			ps.setInt(1, question.getqId());
			ps.setString(2, question.getTitle());
			ps.setString(3, question.getDescription());
			ps.setInt(4, question.getVote());
			
			return ps.executeUpdate()>0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return false;
	}

	public List<Question> getAllQuestion() {
		String sql = "select quid,title,description,votes from question"; 
		
		List<Question> list;
		list = new ArrayList<Question>(); 
		try (
			PreparedStatement ps = DbConnect.getMySQLConn().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
				)
				{	while(rs.next()) {
				
				Question question = new Question(); 
				question.setqId(rs.getInt(1)); 
				question.setTitle(rs.getString(2));
				question.setDescription(rs.getString(3)); 
				question.setVote(rs.getInt(4)); 
				
				list.add(question); 
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list; 
	}

	public Question getQuestion(int qId) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
