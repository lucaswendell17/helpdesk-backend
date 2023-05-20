package com.lucasdev.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasdev.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Long> {

}
