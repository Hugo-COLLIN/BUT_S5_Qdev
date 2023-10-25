package org.iut.tdd;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MockitoTest {

    private final NbAleatoireService service;

    public MockitoTest(@Mock NbAleatoireService service) {
        this.service = service;
    }

    @Test
    public void testInjectionConstructeur() {
        //given
        // when
        //then
        when(service.returnNb()).thenReturn(5);
        assertThat(service.returnNb()).isOdd();
    }

    @Test
    public void testInjectionMethode() {
        //given
        // when
        //then
        when(service.returnNb()).thenReturn(2);
        assertThat(service.returnNb()).isEven();
    }

    public class NbAleatoireService {
        public int returnNb() {
            return 0;
        }
    }

}