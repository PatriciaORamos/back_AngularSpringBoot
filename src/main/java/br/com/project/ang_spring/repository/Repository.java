package br.com.project.ang_spring.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.project.ang_spring.model.Customer;

public interface Repository extends CrudRepository<Customer, Long>{

  

}
