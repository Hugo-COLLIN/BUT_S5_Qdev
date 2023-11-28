package org.iut.bookservice.book;

import java.util.List;

import org.iut.bookservice.exception.ClassCallException;
import org.iut.bookservice.user.User;

public class BookDAO {

	public static List<Book> findBooksByUser(User user) {
		throw new ClassCallException(
				"BookDAO should not be invoked on an unit test.");
	}
}