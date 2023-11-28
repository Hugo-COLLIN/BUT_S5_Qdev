package org.iut.bookservice.book;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.BDDMockito.given;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.iut.bookservice.exception.UserNotLoggedInException;
import org.iut.bookservice.user.User;
import org.junit.jupiter.api.Test;
import org.iut.bookservice.user.UserBuilder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

public class BookServiceTest {

}
