package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

import javax.swing.*;

public class ArrayVetor {

    public static void main(String[] args) {

        /*objeto aluno*/
        Aluno aluno = new Aluno();
        aluno.setNome("Lucas");
        aluno.setNomeEscola("JDEV");

        /*objeto disciplina*/
        Disciplina disciplina = new Disciplina();
        disciplina.setDisciplina("Java");
        double[] notas = {9.0, 10.0, 8.0, 6.0};
        disciplina.setNota(notas);
        /*relaciona as ddiciplinas*/
        aluno.getDisciplina().add(disciplina);

        System.out.println("nome do aluno " + aluno.getNome() + "inscito no curso: " + aluno.getNomeEscola());

        for(Disciplina disciplina1 : aluno.getDisciplina()) {
            System.out.println("disciplina do aluno ");
            System.out.println(" disciplina : " + disciplina1.getDisciplina());
            System.out.println("as nostas das disciplaina sao");

            double notaMax = 0.0;
            for (int pos = 0; pos < disciplina1.getNota().length; pos++){
                System.out.println("nota " + pos + "é igual = "  + disciplina1.getNota()[pos]);

                if (pos == 0 ) {
                    notaMax = disciplina1.getNota()[pos]; /*notamax recebe a nota do objeto disciplina1*/
                } else {
                    if (disciplina1.getNota()[pos] > notaMax) { /*se a nota do objeto for maior que a nota max a nota max vai receber ela*/
                        notaMax = disciplina1.getNota()[pos];  /*senao continua o laco ate varrer o array*/
                    }
                }
            }
            System.out.println("a maior nota da disc: " + disciplina1.getDisciplina() + "é de valor" + notaMax);

            for (int pos = 0; pos < disciplina1.getNota().length; pos++) {
                System.out.println("nota" + pos + "é igual " + disciplina1.getNota()[pos]);

                if(pos == 0) {
                    notaMax = disciplina1.getNota()[pos];
                } else {
                    if (disciplina1.getNota()[pos] < notaMax) {
                        notaMax = disciplina1.getNota()[pos];
                    }
                }
            }
        }





       /*// double[] valores = {9.5, 8.9, 6.0};

        String[] valores = {"lucas", "curso"};

        for (int pos = 0; pos < valores.length; pos++) {
            System.out.println("Valor na posicao" + (pos +1) + "é = " + valores[pos]);
        }





        *//*array porde ser de todos os tipos de dados e objetos *//*

        String posicoes = JOptionPane.showInputDialog("Quantas posicoes o array deve ter?");

        *//*array sempre deve ter a quantidadde de posicoes definidas*//*
        double[] notas = new double[Integer.parseInt(posicoes)];


        for (int pos = 0; pos < notas.length; pos ++) {
            String valor = JOptionPane.showInputDialog("Qual o valor da posicao = " + pos);
            notas[pos] = Double.valueOf(valor);
        }

        for (int pos = 0; pos < notas.length; pos ++) {
            System.out.println("Nota " + (pos+1)+ " é = " + notas[pos]);
        }*/
    }
}
