package cursojava.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno extends Pessoa{

    private String dataMatricula;
    private String nomeEscola;
    private String serieMatriculado;
    private List<Disciplina> disciplina = new ArrayList<Disciplina>();

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getSerieMatriculado() {
        return serieMatriculado;
    }

    public void setSerieMatriculado(String serieMatriculado) {
        this.serieMatriculado = serieMatriculado;
    }

    public List<Disciplina> getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(List<Disciplina> disciplina) {
        this.disciplina = disciplina;
    }

  /*  public double getMediaNotas() {

        double somaTotal = 0;
        for (int pos = 0; pos < nota.lenght; pos ++) {
            somaTotal += nota[pos];
        }
        return  somaTotal / 4;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno aluno)) return false;
        return Objects.equals(getDataMatricula(), aluno.getDataMatricula()) && Objects.equals(getNomeEscola(), aluno.getNomeEscola()) && Objects.equals(getSerieMatriculado(), aluno.getSerieMatriculado()) && Objects.equals(getDisciplina(), aluno.getDisciplina());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDataMatricula(), getNomeEscola(), getSerieMatriculado(), getDisciplina());
    }
    /*metodo que retorna a media do aluno*//*
    public double getMediaNota() {
        double somaNotas = 0.0;

        for (Disciplina disciplina : disciplinas) {
            somaNotas += disciplina.getMediaNotas();
        }

    }*/
}
