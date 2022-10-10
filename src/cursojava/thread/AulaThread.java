package cursojava.thread;

import javax.swing.*;

public class AulaThread {
    public static void main(String[] args) throws InterruptedException {


        /*thread processsando em paralelo*/
        Thread threadNota = new Thread(thread1);
        threadNota.start();


        /*thread processsando em paralelo*/
        Thread threadEmail = new Thread(thread2);
        threadEmail.start();

        JOptionPane.showMessageDialog(null, "sistema continua executando para o usuario");

    }

    private static Runnable thread1 = new Runnable() {
        @Override
        public void run() {

            /*codigo da rotina*/
            /*codigo que executa em paralelo*/
            for (int pos = 0; pos < 10; pos++) {

                /*quero executar essa rotina com tempo de para ou com tempo determinado*/
                System.out.println("executando alguma rotina de nota fiscal");

                try {
                    Thread.sleep(1000);/*coloca tempo na execução, precisa de uma exeption*/
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
            System.out.println("chegou ao fim do teste de thread de nota fiscal");
            /*fim do codigo em paralelo*/
        }

    };

    private static Runnable thread2 = new Runnable() {
        @Override
        public void run() {

            /*codigo da rotina*/
            /*codigo que executa em paralelo*/
            for (int pos = 0; pos < 10; pos++) {

                /*quero executar essa rotina com tempo de para ou com tempo determinado*/
                System.out.println("executando alguma rotina de email");

                try {
                    Thread.sleep(1000);/*coloca tempo na execução, precisa de uma exeption*/
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
            System.out.println("chegou ao fim do teste de thread de email");
            /*fim do codigo em paralelo*/
        }

    };
};





