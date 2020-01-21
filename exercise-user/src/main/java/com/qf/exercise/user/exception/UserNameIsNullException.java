package com.qf.exercise.user.exception;

import org.apache.shiro.authc.AuthenticationException;


public class UserNameIsNullException extends AuthenticationException {

	public UserNameIsNullException() {
		super();
	}

	public UserNameIsNullException(String string) {
		super(string);
	}

}
