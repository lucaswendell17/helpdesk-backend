package com.lucasdev.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasdev.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
