package me.dio.dadosalunos.service;

import me.dio.dadosalunos.entity.AvaliacaoFisica;
import me.dio.dadosalunos.entity.Matricula;
import me.dio.dadosalunos.entity.form.AvaliacaoFisicaForm;
import me.dio.dadosalunos.entity.form.AvaliacaoFisicaUpdateForm;

import java.util.List;

public interface IAvaliacaoFisicaService {
    AvaliacaoFisica create(AvaliacaoFisicaForm form);

    AvaliacaoFisica get(Long id);

    List<AvaliacaoFisica> getAll();

    AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate);

    void delete(Long id);
}
