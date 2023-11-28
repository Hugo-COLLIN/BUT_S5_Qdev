package org.iut.bookservice.book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.iut.bookservice.exception.UserNotLoggedInException;
import org.iut.bookservice.user.User;
import org.iut.bookservice.user.UserSession;

public abstract class BookService {

	public List<Book> getBooksByUser(User user) throws UserNotLoggedInException {
        // validation user
        User loggedUser = getLoggedInUser();
        if(loggedUser == null) {
            throw new UserNotLoggedInException();
        }

        // recherche books des amis
        return user.isFriendWith(loggedUser)
            ? booksByUsers(user)
            : Collections.emptyList();
    }

    protected List<Book> booksByUsers(User user) {
        return BookDAO.findBooksByUser(user);
    }

    protected User getLoggedInUser() {
        return UserSession.getInstance().getLoggedUser();
    }

}
