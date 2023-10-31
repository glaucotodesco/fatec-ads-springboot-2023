package br.com.fatec.hellospringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fatec.hellospringboot.entities.Client;

public interface ClientRepository extends JpaRepository<Client,Integer>{
    
}
