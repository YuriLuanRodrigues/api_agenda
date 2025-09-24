package com.yuriluan.agenda.controller;

import com.yuriluan.agenda.model.Tarefa;
import com.yuriluan.agenda.repository.TarefaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    private final TarefaRepository tarefaRepository;

    public TarefaController(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    @GetMapping
    public List<Tarefa> listar() {
        return tarefaRepository.findAll();
    }

    @PostMapping
    public Tarefa criar(@RequestBody Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }
}