package cursojava.thread;

import javax.swing.*;
import java.awt.*;

public class TelaTimeThread extends JDialog {

    private JPanel jPanel = new JPanel(new GridBagLayout());/*painel de componentes*/

    private JLabel descicaoHora = new JLabel("time da thread 1");
    private JTextField mostraTempo = new JTextField();

    private JLabel descricaoHora2 = new JLabel("time thread 2");
    private JTextField mostraTempo2 = new JTextField();

    public TelaTimeThread (){/*executa o que tiver dentro no momento da execucao*/

        /*primeira parte*/
        setTitle("time thread");
        setSize(new Dimension(240, 240));
        setLocationRelativeTo(null);
        setResizable(false);


        GridBagConstraints gridBagConstraints = new GridBagConstraints();/*controlador de posicionamento de componentes*/
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;


        /*first component*/
        descicaoHora.setPreferredSize(new Dimension(200, 25));
        jPanel.add(descicaoHora, gridBagConstraints);

        mostraTempo.setPreferredSize(new Dimension(200, 25));
        gridBagConstraints.gridy ++;
        jPanel.add(mostraTempo, gridBagConstraints);


        /*second component*/
        descricaoHora2.setPreferredSize(new Dimension(200,25));
        gridBagConstraints.gridy ++;
        jPanel.add(descricaoHora2, gridBagConstraints);

        mostraTempo2.setPreferredSize(new Dimension(200,25));
        gridBagConstraints.gridy ++;
        jPanel.add(mostraTempo2, gridBagConstraints);

        add(jPanel, BorderLayout.WEST);
        setVisible(true);/*ultimo a ser executado(torna a tela vsisivel ao user*/
    }


}
