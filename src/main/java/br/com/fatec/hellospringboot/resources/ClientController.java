package br.com.fatec.hellospringboot.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.fatec.hellospringboot.entities.Client;
import br.com.fatec.hellospringboot.services.ClientService;

@RestController
public class ClientController {
    
    @Autowired
    private ClientService service;

    @GetMapping("clients")
    public ResponseEntity<List<Client>> getClients(){
        return ResponseEntity.ok(service.getClients());
    }
    
    @GetMapping("clients/{id}")
    public ResponseEntity<Client> getClientById(@PathVariable int id){
        return ResponseEntity.ok(service.getClientById(id));
    }

    @DeleteMapping("clients/{id}")
    public ResponseEntity<Void> deleteClient(@PathVariable int id){
        this.service.deleteClientById(id);
        return ResponseEntity.noContent().build();
    }   
    





}
