package com.ivoronline.springboot_db_query_native_projection_interface_child.repositories;

import com.ivoronline.springboot_db_query_native_projection_interface_child.entities.Person;
import com.ivoronline.springboot_db_query_native_projection_interface_child.entities.PersonView;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {

  //=======================================================================================
  // RETURN PERSON VIEW
  //=======================================================================================
  @Query(value = "SELECT * FROM PERSON WHERE NAME = 'John' AND AGE = 20", nativeQuery = true)
  PersonView returnPersonView();

}


