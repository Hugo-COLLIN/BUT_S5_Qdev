package org.iut.bookservice.book;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.iut.bookservice.exception.UserNotLoggedInException;
import org.iut.bookservice.user.User;
import org.iut.bookservice.user.UserBuilder;
import org.junit.jupiter.api.Test;

import java.util.List;

public class BookServiceTest {

    private static final User GUEST = null;
    private static final User REGISTERED_USER = new User();
    private static final User ANOTHER_USER = new User();
    private static final Book BOOK_1 = new Book();
    private static final Book BOOK_2 = new Book();
    private static final User UNUSED_USER = new User();

    private User loggedInUser;

    @Test
    public void doit_retourner_exception_user_not_logged_in () {
        // given
        BookService bookService = new TestableBookService();
        // when
        // then
        assertThrows(UserNotLoggedInException.class, () -> {
            bookService.getBooksByUser(UNUSED_USER, loggedInUser);
        });
    }

    @Test
    public void doit_retourner_une_liste_vide_si_user_n_est_pas_un_ami () throws UserNotLoggedInException {
        // given
        BookService bookService = new TestableBookService();
        loggedInUser = REGISTERED_USER;
        User friend = UserBuilder.user()
                .friendsWith(ANOTHER_USER)
                .likesBooks(BOOK_1).build();

        List<Book> friendBooks = bookService.getBooksByUser(friend, REGISTERED_USER);
        // when
        // then
        assertThat(friendBooks.size(), is(0));
    }

    @Test
    public void doit_retourner_une_liste_books_quand_amis () throws UserNotLoggedInException {
        // given
        BookService bookService = new TestableBookService();
        loggedInUser = REGISTERED_USER;
        User friend = UserBuilder.user()
                .friendsWith(ANOTHER_USER, loggedInUser)
                .likesBooks(BOOK_1, BOOK_2).build();

        List<Book> friendBooks = bookService.getBooksByUser(friend, REGISTERED_USER);
        // when
        // then
        assertThat(friendBooks.size(), is(2));
    }

    private class TestableBookService extends BookService {

        @Override
        protected List<Book> booksByUsers(User user) {
            return user.books();
        }
    }

}
