package cursojava.thread;

import javax.swing.*;
import java.awt.*;

public class TelaTimeThread extends JDialog {

    public TelaTimeThread (){/*executa o que tiver dentro no momento da execucao*/

        /*primeira parte*/
        setTitle("Tela time com thread");
        setSize(new Dimension(240, 240));
        setLocationRelativeTo(null);
        setResizable(false);




        setVisible(true);/*ultimo a ser executado(torna a tela vsisivel ao user*/
    }


}
