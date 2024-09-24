package br.com.project.ang_spring.control;

import org.springframework.web.bind.annotation.RestController;

import br.com.project.ang_spring.model.Customer;
import br.com.project.ang_spring.repository.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@CrossOrigin(origins="*")
public class Control {

    @Autowired
    private Repository action;
    
    @PostMapping("/")
    public Customer cadastrar(@RequestBody Customer c){
        return action.save(c);
    }

    @GetMapping("/")
    public Iterable<Customer> list(){
        return action.findAll();
    }

    @PutMapping("/")
    public Customer edit(@RequestBody Customer c){
        return action.save(c);
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable long id){
        action.deleteById(id);
    }

}
