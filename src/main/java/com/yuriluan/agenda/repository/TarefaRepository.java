package com.yuriluan.agenda.repository;

import com.yuriluan.agenda.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}