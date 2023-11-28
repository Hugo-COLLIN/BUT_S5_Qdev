package org.iut.bookservice.user;

import org.iut.bookservice.book.Book;

public class UserBuilder {
    private User[] friends = new User[] {};
    private Book[] books = new Book[] {};

    public static UserBuilder user() {
        return new UserBuilder();
    }

    public UserBuilder likesBooks(Book... books) {
        this.books = books;
        return this;
    }

    public UserBuilder friendsWith(User... friends) {
        this.friends  = friends;
        return this;
    }

    private void addFriendsTo(User user) {
        for (User friend : friends) {
            user.addFriend(friend);
        }
    }

    private void addBooksTo(User user) {
        for (Book trip : books) {
            user.addBook(trip);
        }
    }

    public User build() {
        User user = new User();
        addBooksTo(user);
        addFriendsTo(user);
        return user;
    }

}
