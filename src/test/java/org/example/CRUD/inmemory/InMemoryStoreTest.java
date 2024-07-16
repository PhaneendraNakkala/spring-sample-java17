//package org.example.CRUD.inmemory;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class InMemoryStoreTest {
//
//    private InMemoryStore inMemoryStore;
//
//    @BeforeEach
//    public void setUp() {
//        inMemoryStore = new InMemoryStore();
//    }
//
//    @Test
//    public void testCreatePerson() {
//        Person person = new Person("1", "Alice", 30);
//        inMemoryStore.createPerson(person);
//
//        assertEquals(person, inMemoryStore.getPerson("1"));
//    }
//
//    @Test
//    public void testCreatePerson_duplicateId() {
//        Person person1 = new Person("1", "Alice", 30);
//        Person person2 = new Person("1", "Bob", 25);
//
//        inMemoryStore.createPerson(person1);
//
//        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
//            inMemoryStore.createPerson(person2);
//        });
//
//        assertEquals("Person with this ID already exists.", exception.getMessage());
//    }
//
//    @Test
//    public void testGetPerson() {
//        Person person = new Person("1", "Alice", 30);
//        inMemoryStore.createPerson(person);
//
//        assertEquals(person, inMemoryStore.getPerson("1"));
//        assertNull(inMemoryStore.getPerson("2"));
//    }
//
//    @Test
//    public void testUpdatePerson() {
//        Person person = new Person("1", "Alice", 30);
//        inMemoryStore.createPerson(person);
//
//        Person updatedPerson = new Person("1", "Alice", 31);
//        inMemoryStore.updatePerson(updatedPerson);
//
//        assertEquals(updatedPerson, inMemoryStore.getPerson("1"));
//    }
//
//    @Test
//    public void testUpdatePerson_notExistingId() {
//        Person person = new Person("1", "Alice", 30);
//
//        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
//            inMemoryStore.updatePerson(person);
//        });
//
//        assertEquals("Person with this ID does not exist.", exception.getMessage());
//    }
//
//    @Test
//    public void testDeletePerson() {
//        Person person = new Person("1", "Alice", 30);
//        inMemoryStore.createPerson(person);
//
//        inMemoryStore.deletePerson("1");
//        assertNull(inMemoryStore.getPerson("1"));
//    }
//
//    @Test
//    public void testDeletePerson_notExistingId() {
//        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
//            inMemoryStore.deletePerson("1");
//        });
//
//        assertEquals("Person with this ID does not exist.", exception.getMessage());
//    }
//}
