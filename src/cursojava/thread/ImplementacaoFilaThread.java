package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread{

    private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = new ConcurrentLinkedQueue<ObjetoFilaThread>();

    public static void add(ObjetoFilaThread objetoFilaThread) {
        pilha_fila.add(objetoFilaThread);
    }

    @Override
    public void run() {
        Iterator iteracao = pilha_fila.iterator();

        synchronized (iteracao) {/*bloquia o acesso a esta lista por outro processo*/
            while (iteracao.hasNext()) {/*enquato conter dados na lista ira processsar*/

                ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();/*pega o objeto atual preocessa e remove e vai para o proximo*/

                /*processar  ex: notas fiscais, lista grande de pdf, gerar envio em massa de email*/

                System.out.println("----------------");
                System.out.println(processar.getEmail());
                System.out.println(processar.getNome());

                iteracao.remove();

                try {
                    Thread.sleep(100);/*tempo para limpeza de memoria*/
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            try {
                Thread.sleep(1000);/*processou toda a lista, tempo para limpeza de memoria*/
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
