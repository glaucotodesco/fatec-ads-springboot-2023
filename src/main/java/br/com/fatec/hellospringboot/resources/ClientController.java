package br.com.fatec.hellospringboot.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.fatec.hellospringboot.entities.Client;
import br.com.fatec.hellospringboot.repositories.ClientRepository;

@RestController
public class ClientController {
    
    @Autowired
    private ClientRepository repository;


    @GetMapping("clients")
    public List<Client> getClients(){
        return repository.findAll();
    }
    
    @GetMapping("clients/{id}")
    public Client getClientById(@PathVariable int id){
        return repository.findById(id).get();
    }
    





}
