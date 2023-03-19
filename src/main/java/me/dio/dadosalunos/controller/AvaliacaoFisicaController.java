package me.dio.dadosalunos.controller;

import me.dio.dadosalunos.entity.AvaliacaoFisica;
import me.dio.dadosalunos.entity.form.AvaliacaoFisicaForm;
import me.dio.dadosalunos.service.impl.AvaliacaoFisicaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



    @RestController
    @RequestMapping("/avaliacoes")
    public class AvaliacaoFisicaController {

        @Autowired
        private AvaliacaoFisicaServiceImpl service;

        @PostMapping
        public AvaliacaoFisica create(@RequestBody AvaliacaoFisicaForm form) {
            return service.create(form);
        }

        @GetMapping
        public List<AvaliacaoFisica> getAll() {
            return service.getAll();
        }

    }


