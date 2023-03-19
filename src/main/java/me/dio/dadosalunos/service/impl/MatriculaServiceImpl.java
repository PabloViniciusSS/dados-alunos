package me.dio.dadosalunos.service.impl;

import me.dio.dadosalunos.entity.Aluno;
import me.dio.dadosalunos.entity.Matricula;
import me.dio.dadosalunos.entity.form.MatriculaForm;
import me.dio.dadosalunos.respository.MatriculaRepository;
import me.dio.dadosalunos.respository.AlunoRepository;
import me.dio.dadosalunos.service.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

    @Autowired
    private MatriculaRepository matriculaRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public Matricula create(MatriculaForm form) {
        Matricula matricula = new Matricula();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

        matricula.setAluno(aluno);

        return matriculaRepository.save(matricula);
    }

    @Override
    public Matricula get(Long id) {
        return null;
    }

    @Override
    public List<Matricula> getAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Matricula> getAll(String bairro) {
        return null;
    }
}