package cursojava.thread;

import javax.swing.*;

public class AulaThread {
    public static void main(String[] args) throws  InterruptedException{

        /*thread processsando em paralelo*/
        new Thread() {

            @Override
            public void run() {/*executa o qe queremos*/

                /*codigo da rotina*/
                /*codigo que executa em paralelo*/
                for(int pos =0; pos < 10; pos ++) {

                    /*quero executar essa rotina com tempo de para ou com tempo determinado*/
                    System.out.println("executando alguma rotina:");

                    try {
                        Thread.sleep(1000);/*coloca tempo na execução, precisa de uma exeption*/
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
                System.out.println("chegou ao fim do teste de thread");
                /*fim do codigo em paralelo*/
            }
        }.start();/*start liga a thread que ifca processando paralelamente*/



        /*fluxo do sistema, cadastro de venda, emissao de nota fiscal etc*/
        JOptionPane.showMessageDialog(null,"sistema continua executando para o usuario");

    }
}
