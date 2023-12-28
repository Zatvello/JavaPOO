package classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaUltraEmojiCombat extends JFrame {
    private JPanel mainPanel;
    private JSpinner txtNumLutadores;
    private JCheckBox checkBox1;
    private JPanel Luta;
    private JButton btnAddNumLutadores;
    private JPanel NumLutadores;
    private JLabel lblNumLutadores;
    private JButton btnCriarLutador;
    private JTextField txtNome;
    private JTextField txtNacio;
    private JSpinner txtIdade;

    int c = 0;
    int i = 0;
    String lutNome[] = new String[25];
    String lutNacio[] = new String[25];
    String lutIdade[] = new String[25];

    public TelaUltraEmojiCombat() {
        setTitle("UFC");
        setContentPane(mainPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(420, 600);
        Luta.setVisible(false);

        btnAddNumLutadores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numlutadores = Integer.parseInt(txtNumLutadores.getValue().toString());
                Lutador l[] = new Lutador[numlutadores];
                System.out.println(l.length);

                NumLutadores.setVisible(false);
                lblNumLutadores.setText(Integer.toString(l.length));

                //for  (int c = 0; c <= l.length; c++) {
                Luta.setVisible(true);
                while (i < c) {
                    btnCriarLutador.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            while (c <= l.length - 1) {
                                //lutNome[c] = (txtNome.getText());
                                l[c] = new Lutador(txtNome.getText(), txtNacio.getText(), Integer.parseInt(txtIdade.getValue().toString()));
                                System.out.println(c);
                                //[c] = JOptionPane.showInputDialog(null, "Informe um nome: ", "Nome");
                                //JOptionPane.showInputDialog(null, "Informe uma nacionalidade: ", "Nome");
                                c++;
                                i++;
                            }
                            System.out.println("Nome: " + lutNome[0] + l[0].getNacio() + l[0].getIdade());

                        }

                    });
                    Luta.setVisible(true);
                    Luta.setVisible(false);
                }

            }
        });

    }

    public static void main(String[] args) {
        new TelaUltraEmojiCombat();
    }
}