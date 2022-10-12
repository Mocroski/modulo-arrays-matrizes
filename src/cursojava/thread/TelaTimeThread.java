package cursojava.thread;

import javax.swing.*;
import java.awt.*;

public class TelaTimeThread extends JDialog {

    private JPanel jPanel = new JPanel(new GridBagLayout());/*painel de componentes*/

    private JLabel descicaoHora = new JLabel("Time da thread 1");
    private JTextField mostraTempo = new JTextField();

    private JLabel descricaoHora2 = new JLabel("Time thread 2");
    private JTextField mostraTempo2 = new JTextField();

    private JButton jButton = new JButton("START");
    private JButton jButton2 = new JButton("STOP");

    public TelaTimeThread (){/*executa o que tiver dentro no momento da execucao*/

        /*primeira parte*/
        setTitle("time thread");
        setSize(new Dimension(240, 240));
        setLocationRelativeTo(null);
        setResizable(false);


        GridBagConstraints gridBagConstraints = new GridBagConstraints();/*controlador de posicionamento de componentes*/
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new Insets(5,10,5,5);
        gridBagConstraints.anchor = GridBagConstraints.WEST;


        /*first components*/
        descicaoHora.setPreferredSize(new Dimension(200, 25));
        jPanel.add(descicaoHora, gridBagConstraints);

        mostraTempo.setPreferredSize(new Dimension(200, 25));
        gridBagConstraints.gridy ++;
        mostraTempo.setEditable(false);
        jPanel.add(mostraTempo, gridBagConstraints);


        /*second components*/
        descricaoHora2.setPreferredSize(new Dimension(200,25));
        gridBagConstraints.gridy ++;
        jPanel.add(descricaoHora2, gridBagConstraints);

        mostraTempo2.setPreferredSize(new Dimension(200,25));
        gridBagConstraints.gridy ++;
        mostraTempo2.setEditable(false);
        jPanel.add(mostraTempo2, gridBagConstraints);

        /*-------------------*/

        gridBagConstraints.gridwidth = 1;

        jButton.setPreferredSize(new Dimension(92,15));
        gridBagConstraints.gridy ++;
        jPanel.add(jButton, gridBagConstraints);


        jButton2.setPreferredSize(new Dimension(92,15));
        gridBagConstraints.gridx ++;
        jPanel.add(jButton2, gridBagConstraints);


        add(jPanel, BorderLayout.WEST);
        setVisible(true);/*ultimo a ser executado(torna a tela vsisivel ao user*/
    }


}
