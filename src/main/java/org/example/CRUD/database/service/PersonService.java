package org.example.CRUD.database.service;

import org.example.CRUD.database.model.Person;
import org.example.CRUD.database.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Transactional
    public Person createPerson(Person person) {
        if (personRepository.existsById(person.getId())) {
            throw new IllegalArgumentException("Person with this ID already exists.");
        }
        return personRepository.save(person);
    }

    public Optional<Person> getPerson(String id) {
        return personRepository.findById(id);
    }

    @Transactional
    public Person updatePerson(Person person) {
        if (!personRepository.existsById(person.getId())) {
            throw new IllegalArgumentException("Person with this ID does not exist.");
        }
        return personRepository.save(person);
    }

    @Transactional
    public void deletePerson(String id) {
        if (!personRepository.existsById(id)) {
            throw new IllegalArgumentException("Person with this ID does not exist.");
        }
        personRepository.deleteById(id);
    }

    public List<Person> listAllPersons() {
        return personRepository.findAll();
    }
}
