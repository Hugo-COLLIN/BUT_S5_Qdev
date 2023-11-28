package org.iut.bookservice.book;

import java.util.Collections;
import java.util.List;

import org.iut.bookservice.exception.UserNotLoggedInException;
import org.iut.bookservice.user.User;
import org.iut.bookservice.user.UserSession;

public abstract class BookService {

    private BookDAO bookDAO;

    public BookService(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

	public List<Book> getBooksByUser(User user, User loggedInUser) throws UserNotLoggedInException {
        // validation user
        if(loggedInUser == null) {
            throw new UserNotLoggedInException();
        }

        // recherche books des amis
        return user.isFriendWith(loggedInUser)
            ? booksByUsers(user)
            : Collections.emptyList();
    }

    protected List<Book> booksByUsers(User user) {
        return bookDAO.booksBy(user);
    }

}
