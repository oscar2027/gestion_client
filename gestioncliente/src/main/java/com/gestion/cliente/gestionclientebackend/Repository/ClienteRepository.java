package com.gestion.cliente.gestionclientebackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.cliente.gestionclientebackend.Modelo.Cliente;
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
