package org.iut.bookservice.user;

import org.iut.bookservice.exception.ClassCallException;

public class UserSession {

	private static final UserSession userSession = new UserSession();
	
	private UserSession() {
	}
	
	public static UserSession getInstance() {
		return userSession;
	}

	public User getLoggedUser() {
		throw new ClassCallException(
				"UserSession.getLoggedUser() should not be called in an unit test");
	}

}
