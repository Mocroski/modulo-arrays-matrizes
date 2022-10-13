package cursojava.thread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TelaTimeThread extends JDialog {

    private JPanel jPanel = new JPanel(new GridBagLayout());/*painel de componentes*/

    private JLabel descicaoHora = new JLabel("Time da thread 1");
    private JTextField mostraTempo = new JTextField();

    private JLabel descricaoHora2 = new JLabel("Time thread 2");
    private JTextField mostraTempo2 = new JTextField();

    private JButton jButton = new JButton("START");
    private JButton jButton2 = new JButton("STOP");

    private Runnable thread1 = new Runnable() {
        @Override
        public void run() {
            while (true) {
                mostraTempo.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").format(Calendar.getInstance().getTime()));

                try {
                    Thread.sleep(1000); /*cadenciar o while pra nao travar o PC*/
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    };

    private Runnable thread2 = new Runnable() {
        @Override
        public void run() {
            while (true) {
                mostraTempo2.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(Calendar.getInstance().getTime()));

                try {
                    Thread.sleep(3000); /*cadenciar o while pra nao travar o PC*/
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    };

    private Thread thread1Time;
    private Thread thread2Time;

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


        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {/*executa o evento de click no button*/

                thread1Time = new Thread(thread1);
                thread1Time.start();

                thread2Time = new Thread(thread2);
                thread2Time.start();

                jButton.setEnabled(false);
                jButton2.setEnabled(true);
            }
        });

        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                thread1Time.stop();
                thread2Time.stop();

                jButton.setEnabled(true);
                jButton2.setEnabled(false);
            }
        });

        jButton2.setEnabled(false);

        add(jPanel, BorderLayout.WEST);
        setVisible(true);/*ultimo a ser executado(torna a tela vsisivel ao user*/
    }


}
