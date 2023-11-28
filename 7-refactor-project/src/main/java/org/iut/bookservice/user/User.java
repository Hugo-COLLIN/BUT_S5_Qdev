package org.iut.bookservice.user;

import java.util.ArrayList;
import java.util.List;
import org.iut.bookservice.book.Book;

public class User {

	private List<Book> books = new ArrayList<Book>();
	private List<User> friends = new ArrayList<User>();
	
	public List<User> getFriends() {
		return friends;
	}
	
	public void addFriend(User user) {
		friends.add(user);
	}

	public void addBook(Book book) {
		books.add(book);
	}
	
	public List<Book> books() {
		return books;
	}

    public Boolean isFriendWith(User anotherUser) {
        return friends.contains(anotherUser);
    }
}
