package com.rest.testes.result.restResult.controller;
import com.rest.testes.result.restResult.domain.Tarefa;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;


@RestController
@RequestMapping(value ="rest-results")
public class RestResultsController {
    @GetMapping
    public Page<Tarefa> listTarefas(@RequestParam(value = "offset",
            required = false) int offset, @RequestParam(value = "limit",  required = false) int limit) {
       RestTemplate rest = new RestTemplate();
       Pageable pageable = PageRequest.of(offset, limit);
       Tarefa[] tarefas = rest.getForObject("http://localhost:3000/tarefa",Tarefa[].class);
       List<Tarefa> tarefasList= Arrays.asList(tarefas);
       Page<Tarefa> page = new PageImpl<>(tarefasList,pageable,tarefasList.size() );
       return page;
    }
}
