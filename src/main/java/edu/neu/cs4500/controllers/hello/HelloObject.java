package edu.neu.cs4500.controllers.hello;

//Based on source code from assignment A1

public class HelloObject {
	private String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public HelloObject(String message) {
		this.message = message;
	}
	public HelloObject() {
	}
}
