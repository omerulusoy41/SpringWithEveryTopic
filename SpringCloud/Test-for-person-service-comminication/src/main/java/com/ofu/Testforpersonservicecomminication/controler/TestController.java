package com.ofu.Testforpersonservicecomminication.controler;

import com.ofu.Testforpersonservicecomminication.feign.PersonService;
import com.ofu.Testforpersonservicecomminication.model.Person;
import com.ofu.Testforpersonservicecomminication.repository.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private PersonService personService;
    @Autowired
    private PersonRepo repo;

    @GetMapping
    public List<Person> sayHello(){
        List<Person> people = personService.getAllPerson();
        for (Person p :people){
            System.out.println(p.toString());
        }
        repo.saveAll(people);
        return  people;
    }

}
