package br.com.project.ang_spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.project.ang_spring.repository.Repository;
import br.com.project.ang_spring.valid.Validation;


@Service
public class Services {

    @Autowired
    private Validation validation;

    @Autowired
    private Repository repository;



}
