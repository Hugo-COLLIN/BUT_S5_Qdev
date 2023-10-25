package org.iut.tdd;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumingThat;
import static org.junit.jupiter.api.DynamicTest.stream;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import org.assertj.core.api.Condition;
import static org.assertj.core.api.Assertions.*;

@TestMethodOrder(OrderAnnotation.class)
public class JUnitAnnotationsTest {

    @BeforeEach
    void beforeEach()
    {
        System.out.println("Before each test!");
    }


    @AfterEach
    void afterEach()
    {
        System.out.println("After each test!");
    }

    @Test
    void test1()
    {
        System.out.println("Appel de test1");
    }

    @Test
    void test2()
    {
        System.out.println("Appel de test2");
    }

    @BeforeAll
    static void beforeAll()
    {
        System.out.println("Before all tests");
    }

    @AfterAll
    static void afterAll()
    {
        System.out.println("After all tests");
    }

    @Test
    public void assertTrueAndFalse()
    {
        assertTrue(true);
        assertFalse(false);
    }

    @Test
    public void assertNullEtNonNull()
    {
        Object myObject = null;
        assertNull(myObject);
        myObject = "something";
        assertNotNull(myObject);
    }


    @Test
    public void assertIfEqual() {
        Integer i = 4;
        Integer j = 4;
        assertEquals(i,j);
    }

    @Test
    public void assertIfEqual2() {
        Integer i = Integer.valueOf(4);
        Integer j = i;
        assertEquals(i,j);
    }

    @Test
    @DisplayName("Should be not the same")
    public void assertIfSame() {
        String i = new String("IUT");
        String j = new String("IUT");
//        assertSame(i,j);
        assertNotSame(i,j);
    }

    @Test
    public void timeout() {
        assertTimeout(Duration.of(1, ChronoUnit.SECONDS), () -> {
            TimeUnit.MILLISECONDS.sleep(995);
        });
    }

    @Test
    @EnabledOnOs(OS.LINUX)
    public void LinuxTest() {
        fail();
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    public void WindowsTest() {
        assertTrue(true);
    }

    @TestFactory
    Stream<DynamicTest> dynamic() {
        final var dateJour = LocalDate.now();
        final Iterator<LocalDate> iterJours = Stream
                .iterate(dateJour, date -> date = date.plusDays(1))
                .limit(10).iterator();
        return stream(iterJours,
                DateTimeFormatter.ISO_LOCAL_DATE::format,
                Assertions::assertNotNull);
    }


    @Test
    public void assertionsInAssertJ()
    {
        Integer age = 30;
        assertThat(age)
                .isEqualTo(30)
                .isNotEqualTo(40);
        assertThat(age)
                .isIn(30,40,50)
                .isNotIn(20,80);
        assertThat(age)
                .isBetween(20,40);


        List<Double> x = List.of(50.00,200.00,500.00);
        assertThat(x)
                .hasSize(3)
                .contains(50.00, atIndex(0))
                .contains(200.00, atIndex(1))
                .contains(500.00, atIndex(2))
                .doesNotContain(100.00)
                .containsOnly(50.00,200.00,500.00)
                .containsExactly(50.00,200.00,500.00)
                .doesNotHaveDuplicates();

        String chaine = "Un petit texte";
        assertThat(chaine)
                .startsWith("Un")
                .endsWith("texte")
                .contains("petit");

    }
}
