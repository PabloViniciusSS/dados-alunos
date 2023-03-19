package me.dio.dadosalunos.service;

import me.dio.dadosalunos.entity.Aluno;
import me.dio.dadosalunos.entity.AvaliacaoFisica;
import me.dio.dadosalunos.entity.form.AlunoForm;
import me.dio.dadosalunos.entity.form.AlunoUpdateForm;

import java.util.List;

public interface IAlunoService {

    Aluno create(AlunoForm form);

    Aluno get(Long id);

    List<Aluno> getAll(String dataDeNascimento);


    Aluno update(Long id, AlunoUpdateForm formUpdate);

    void delete(Long id);


    List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);


    Aluno update(Long id, AlunoForm formAluno);

    List<Aluno> getAll();
}