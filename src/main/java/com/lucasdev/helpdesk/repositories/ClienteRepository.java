package com.lucasdev.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasdev.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
