package com.ivoronline.springboot_db_query_native_projection_interface_child.controllers;

import com.ivoronline.springboot_db_query_native_projection_interface_child.entities.AddressView;
import com.ivoronline.springboot_db_query_native_projection_interface_child.entities.PersonView;
import com.ivoronline.springboot_db_query_native_projection_interface_child.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @Autowired PersonRepository personRepository;

  //================================================================
  // RETURN PERSON VIEW
  //================================================================
  @RequestMapping("ReturnPersonView")
  AddressView returnPersonView() {
    PersonView  personView = personRepository.returnPersonView();
    AddressView address    = personView.getAddress();
    return      address;
  }

  //================================================================
  // RETURN PERSON VIEW
  //================================================================
  @RequestMapping("ReturnPersonView2")
  PersonView returnPersonView2() {
    PersonView  personView = personRepository.returnPersonView();
    return      personView;
  }

}
