package org.iut.bookservice.book;

import org.junit.jupiter.api.Test;
import org.iut.bookservice.exception.ClassCallException;
import org.iut.bookservice.user.User;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class BookDAOTest {

    @Test
    public void exception_qd_return_books_from_users() {
        assertThrows(ClassCallException.class, () -> {
            new BookDAO().booksBy(new User());
        });
    }
}
