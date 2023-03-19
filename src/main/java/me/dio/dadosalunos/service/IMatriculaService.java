package me.dio.dadosalunos.service;

import me.dio.dadosalunos.entity.Matricula;
import me.dio.dadosalunos.entity.form.MatriculaForm;

import java.util.List;

public interface IMatriculaService {

    Matricula create(MatriculaForm form);

    Matricula get(Long id);

    List<Matricula> getAll();

    void delete(Long id);

    List<Matricula> getAll(String bairro);
}
