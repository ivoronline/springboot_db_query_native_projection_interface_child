package com.ivoronline.springboot_db_query_native_projection_interface_child.runners;

import com.ivoronline.springboot_db_query_native_projection_interface_child.entities.Address;
import com.ivoronline.springboot_db_query_native_projection_interface_child.entities.Person;
import com.ivoronline.springboot_db_query_native_projection_interface_child.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class LoadPersons implements CommandLineRunner {

  @Autowired PersonRepository personRepository;

  @Override
  @Transactional
  public void run(String... args) {
    personRepository.save(new Person("John" , 20, new Address("london"    , "First street")));
    personRepository.save(new Person("Bill" , 40, new Address("Washington", "Second street")));
  }

}

