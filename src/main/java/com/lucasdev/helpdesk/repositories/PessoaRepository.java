package com.lucasdev.helpdesk.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasdev.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
	Optional<Pessoa> findByCpf(String cpf);
	Optional<Pessoa> findByEmail(String email);
}
