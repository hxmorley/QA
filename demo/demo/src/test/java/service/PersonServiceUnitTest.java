package service;


import com.qa.demo.entities.Person;
import com.qa.demo.repos.PersonRepo;
import com.qa.demo.services.PersonService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

@SpringBootTest
public class PersonServiceUnitTest {

    @Autowired
    private PersonService service;

    @MockBean
    private PersonRepo repo;

    @Test
    void testUpdate(){
        int id = 1;
        Person updated = new Person(id, "Top", 50, "Cat");

        Mockito.when(this.repo.findById(id)).thenReturn(Optional.of(new Person(1, null, null, null)));
        Mockito.when(this.repo.save(updated)).thenReturn(updated);

        Assertions.assertEquals(updated,
                this.service.updatePerson(id, updated.getName(), updated.getAge(), updated.getJob()));
    }

    @Test
    void testCreate(){
        Person newPerson = new Person("Bill", 27, "Accountant");
        Person savedPerson = new Person(1, "Bill", 27, "Accountant");

        Mockito.when(this.repo.save(newPerson)).thenReturn(savedPerson);

        Assertions.assertEquals(savedPerson, this.service.createPerson(newPerson));
    }

    @Test
    void testGet(){
        int id = 1;
        Person existingPerson = new Person(id, "Ben", 27, "Actuary");

        Mockito.when(this.repo.findById(id)).thenReturn(Optional.of(existingPerson));

        Assertions.assertEquals(existingPerson, this.service.get(id));
    }

    @Test
    void testDelete(){
        int id = 1;
        Person existingPerson = new Person(id, "Ben", 27, "Actuary");

        Mockito.when(this.repo.findById(id)).thenReturn(Optional.of(existingPerson));

        Assertions.assertEquals(existingPerson, this.service.removePerson(id));
    }


}
