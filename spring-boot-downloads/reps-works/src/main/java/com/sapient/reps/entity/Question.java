package com.sapient.reps.entity;

public class Question {
	private int qId; 
	private String title; 
	private String description; 
	private int vote; 
	
	public Question() {
	}

	public Question(int qId, String title, String description, int vote) {
		super();
		this.qId = qId;
		this.title = title;
		this.description = description;
		this.vote = vote;
	}

	public int getqId() {
		return qId;
	}

	public void setqId(int qId) {
		this.qId = qId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getVote() {
		return vote;
	}

	public void setVote(int vote) {
		this.vote = vote;
	}

	@Override
	public String toString() {
		return "Question [qId=" + qId + ", title=" + title + ", description=" + description + ", vote=" + vote + "]";
	}
	
	
	
}
