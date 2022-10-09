package cursojava.classes;

import java.util.Arrays;
import java.util.Objects;

public class Disciplina {

    private double[] nota = new double[4];
    private String disciplina;

    public double[] getNota() {
        return nota;
    }

    public void setNota(double[] nota) {
        this.nota = nota;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Disciplina that)) return false;
        return Arrays.equals(getNota(), that.getNota()) && Objects.equals(getDisciplina(), that.getDisciplina());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getDisciplina());
        result = 31 * result + Arrays.hashCode(getNota());
        return result;
    }
}