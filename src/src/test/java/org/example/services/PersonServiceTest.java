package org.example.services;

import domain.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonServiceTest {

    private Person person;


    @BeforeEach
    void setup() {
        person = new Person(
                "Luis Felipe",
                "Rodrigues",
                "luisfelipebr1995@gmail.com",
                "São Luis - MA",
                "Male"
        );
    }


    @DisplayName("When Create a Person with Success Should Return a Person Object")
    @Test
    void testCreatePerson_WhenSuccess_ShouldReturnPersonObject() {

        IPersonService service = new PersonService();

        Person actual = service.createPerson(person);

        assertNotNull(actual, () -> " The createPerson() should not have returned null!");
    }

    @DisplayName("When Create a Person with Success Should Contains All Attributes in Returned Person")
    @Test
    void testCreatePerson_WhenSuccess_ShouldContainsAllAttributesReturnPersonObject() {

        IPersonService service = new PersonService();

        Person actual = service.createPerson(person);
        assertNotNull(actual, () -> " The createPerson() should not have returned null!");
        assertEquals(actual.getFirstName(), person.getFirstName(), () -> "The test do not produce the same firstName");
        assertEquals(actual.getLastName(), person.getLastName(), () -> "The test do not produce the same lastName");
        assertEquals(actual.getAddress(), person.getAddress(), () -> "The test do not produce the same address");
        assertEquals(actual.getGender(), person.getGender(), () -> "The test do not produce the same gender");
        assertEquals(actual.getEmail(), person.getEmail(), () -> "The test do not produce the same email");
        assertEquals(actual.getEmail(), person.
                getEmail(), () -> "The test do not produce the same firstName");
        assertNull(actual.getId());
        assertNotNull(actual, () -> "Actual its not null");
    }
}
