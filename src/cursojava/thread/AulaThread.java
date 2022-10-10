package cursojava.thread;

public class AulaThread {
    public static void main(String[] args) throws  InterruptedException{

        for(int pos =0; pos < 10; pos ++) {

            /*quero executar essa rotina com tempo de para ou com tempo determinado*/
            System.out.println("executando alguma rotina:");

            Thread.sleep(1000);/*coloca tempo na execução, precisa de uma exeption*/

        }
        System.out.println("chegou ao fim do teste de thread");

    }
}
