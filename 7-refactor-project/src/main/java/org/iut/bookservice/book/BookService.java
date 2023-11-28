package org.iut.bookservice.book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.iut.bookservice.exception.UserNotLoggedInException;
import org.iut.bookservice.user.User;
import org.iut.bookservice.user.UserSession;

public class BookService {

	public List<Book> getBooksByUser(User user) throws UserNotLoggedInException {
		List<Book> bookList = new ArrayList<Book>();
		User loggedUser = UserSession.getInstance().getLoggedUser();
		boolean isFriend = false;
		if (loggedUser != null) {
			for (User friend : user.getFriends()) {
				if (friend.equals(loggedUser)) {
					isFriend = true;
					break;
				}
			}
			if (isFriend) {
				bookList = BookDAO.findBooksByUser(user);
			}
			return bookList;
		} else {
			throw new UserNotLoggedInException();
		}
	}
}
