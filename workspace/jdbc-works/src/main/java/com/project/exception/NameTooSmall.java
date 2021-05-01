package com.project.exception;

public class NameTooSmall  extends Exception{
	private String msg; 
	public NameTooSmall() {
		msg = "Name too small"; 
	}
	public NameTooSmall(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "NameTooSmall [msg=" + msg + "]";
	}
}
