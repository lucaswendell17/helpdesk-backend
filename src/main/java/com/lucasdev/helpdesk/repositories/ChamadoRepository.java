package com.lucasdev.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasdev.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Long> {

}
