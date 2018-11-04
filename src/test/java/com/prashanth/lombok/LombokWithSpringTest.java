package com.prashanth.lombok;

import com.prashanth.lombok.model.Person;
import com.prashanth.lombok.model.Users;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class LombokWithSpringTest {
    @Test
    void testGetterSetters() {
        Users users = new Users();
        users.setFirstName("first_name_01");
        assertEquals("first_name_01", users.getFirstName());
    }

    @Test
    void testEquals() {
        Person person = new Person();
        person.setFullName("fullName");

        Person person01 = new Person();
        person01.setFullName("fullName");

        assertEquals(true, person.equals(person01));
    }

    @Test
    void testLogger() {
        LombokLoggers lombokLoggers = new LombokLoggers();
        lombokLoggers.loggerSlf4j();
    }

    @Test
    void testSneakyThrowsRunnable() {
        assertThrows(InterruptedException.class, () -> new LombokSneakyThrows().new SneakyRunnable().run());
    }

    @Test
    void testSneakyThrowsFile() {
        assertThrows(FileNotFoundException.class, () -> new LombokSneakyThrows().readFile());
    }

    @Test
    void testNonNull() {
        assertThrows(NullPointerException.class, () -> new LombokNonNull().nonNullExperiment());
    }
}
