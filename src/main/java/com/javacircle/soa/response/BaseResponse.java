package com.javacircle.soa.response;

import java.util.ArrayList;
import java.util.List;

public class BaseResponse {
	private List<String> errorMessages = new ArrayList<>();
	private List<String> userMessages = new ArrayList<>();

	public List<String> getErrorMessages() {
		return errorMessages;
	}

	public void setErrorMessages(List<String> errorMessages) {
		this.errorMessages = errorMessages;
	}

	public List<String> getUserMessages() {
		return userMessages;
	}

	public void setUserMessages(List<String> userMessages) {
		this.userMessages = userMessages;
	}

}
