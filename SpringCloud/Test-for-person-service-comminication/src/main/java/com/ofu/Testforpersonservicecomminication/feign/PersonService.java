package com.ofu.Testforpersonservicecomminication.feign;

import com.ofu.Testforpersonservicecomminication.model.Person;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "calculation-service", url = "http://localhost:8080/")
public interface PersonService {

    @GetMapping("/person")
    public List<Person> getAllPerson();
}
