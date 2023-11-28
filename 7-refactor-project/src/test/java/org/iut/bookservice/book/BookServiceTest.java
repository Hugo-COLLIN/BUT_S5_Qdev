package org.iut.bookservice.book;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.BDDMockito.given;

import org.iut.bookservice.exception.UserNotLoggedInException;
import org.iut.bookservice.user.User;
import org.iut.bookservice.user.UserBuilder;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {

    private static final User GUEST = null;
    private static final User REGISTERED_USER = new User();
    private static final User ANOTHER_USER = new User();
    private static final Book BOOK_1 = new Book();
    private static final Book BOOK_2 = new Book();
    private static final User UNUSED_USER = new User();

    @InjectMocks
    @Spy
    private BookService realBookService;

    @Mock
    private BookDAO bookDAO;


    @Test
    public void doit_retourner_exception_user_not_logged_in () {
        assertThrows(UserNotLoggedInException.class, () -> {
            realBookService.getBooksByUser(UNUSED_USER, GUEST);
        });
    }

    @Test
    public void doit_retourner_une_liste_vide_si_user_n_est_pas_un_ami () throws UserNotLoggedInException {
        // given
        User friend = UserBuilder.user()
                .friendsWith(ANOTHER_USER)
                .likesBooks(BOOK_1).build();

        given(bookDAO.booksBy(friend)).willReturn(friend.books());

        List<Book> friendBooks = realBookService.getBooksByUser(friend, REGISTERED_USER);
        // when
        // then
        assertThat(friendBooks.size(), is(0));
    }

    @Test
    public void doit_retourner_une_liste_books_quand_amis () throws UserNotLoggedInException {
        User friend = UserBuilder.user()
                .friendsWith(ANOTHER_USER, REGISTERED_USER)
                .likesBooks(BOOK_1, BOOK_2).build();

        given(bookDAO.booksBy(friend)).willReturn(friend.books());
        List<Book> friendBooks = realBookService.getBooksByUser(friend, REGISTERED_USER);
        assertThat(friendBooks.size(), is(2));
    }

}
