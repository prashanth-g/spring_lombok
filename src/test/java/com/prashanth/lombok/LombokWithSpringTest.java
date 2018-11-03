package com.prashanth.lombok;

import com.prashanth.lombok.model.Person;
import com.prashanth.lombok.model.Users;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
