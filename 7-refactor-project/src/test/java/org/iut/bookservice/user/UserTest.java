package org.iut.bookservice.user;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.iut.bookservice.user.UserBuilder.*;

public class UserTest {

    private static final User BOB = new User();
    private static final User ALICE = new User();

    @Test
    public void doit_retourner_ko_quand_amis () {
        User user = user()
                .friendsWith(BOB)
                .build();
        assertThat(user.isFriendWith(ALICE), is(false));
    }

    @Test
    public void doit_retourner_ok_quand_amis () {
        User user = user()
                .friendsWith(BOB, ALICE)
                .build();
        assertThat(user.isFriendWith(ALICE), is(true));
    }

}