package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaUFC extends JFrame {
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
    private JPanel marcarLuta;
    private JComboBox cmbLutador1;
    private JComboBox cmbLutador2;
    private JButton btnMarcarLuta;
    private JPanel resultadoLuta;
    private JTextPane txtpaneResultado;
    private JLabel lblResultadoLuta;
    private JPanel resultadoErro;

    int c = 0;
    int i = 0;
    String[] lutNome = new String[25];
    String[] lutNacio = new String[25];
    int[] lutIdade = new int[25];
    float[] lutAltura = new float[25];
    float[] lutPeso = new float[25];
    int[] lutVitorias = new int[25];
    int[] lutDerrotas = new int[25];
    int[] lutEmpates = new int[25];


    public TelaUFC() {
        setTitle("UFC");
        setContentPane(mainPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(620, 670);
        Luta.setVisible(false);
        marcarLuta.setVisible(false);
        resultadoLuta.setVisible(false);

        SpinnerModel sm = new SpinnerNumberModel(1, 1, 9, 1);
        txtNumLutadores.setModel(sm);

        btnAddNumLutadores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numlutadores = Integer.parseInt(txtNumLutadores.getValue().toString());
                Lutador[] l = new Lutador[numlutadores];
                System.out.println(l.length);

                NumLutadores.setVisible(false);
                lblNumLutadores.setText(Integer.toString(l.length));

                //for  (int c = 0; c <= l.length; c++) {
                Luta.setVisible(true);
                btnCriarLutador.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        while (c <= l.length - 1) {
                            //lutNome[c] = (txtNome.getText());
                            //l[c] = new Lutador(txtNome.getText(), txtNacio.getText(), Integer.parseInt(txtIdade.getValue().toString()));
                            System.out.println(c);

                            lutNome[c] = JOptionPane.showInputDialog(null, "Informe um nome: ", "Nome");
                            lutNacio[c] = JOptionPane.showInputDialog(null, "Informe uma nacionalidade: ", "Nacionalidade");
                            lutIdade[c] = Integer.parseInt((JOptionPane.showInputDialog(null, "Informe uma idade: ", 1)));
                            lutAltura[c] = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe uma altura: ", 1.80));
                            lutPeso[c] = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe um peso: ", 70));
                            lutVitorias[c] = Integer.parseInt((JOptionPane.showInputDialog(null, "Informe o número de vitórias: ", 1)));
                            lutDerrotas[c] = Integer.parseInt((JOptionPane.showInputDialog(null, "Informe o número de derrotas: ", 1)));
                            lutEmpates[c] = Integer.parseInt((JOptionPane.showInputDialog(null, "Informe o número de empates:", 1)));

                            l[c] = new Lutador(lutNome[c], lutNacio[c], lutIdade[c], lutAltura[c], lutPeso[c], lutVitorias[c], lutDerrotas[c], lutEmpates[c]);

                            c++;
                        }
                        Luta.setVisible(false);
                        System.out.println("Nome: " + lutNome[0] + l[0].getNacio() + l[0].getIdade());

                        for (i = 0; i <= l.length - 1; i++) {
                            //lista.addItem(lutNome[i]);
                            cmbLutador1.addItem(lutNome[i]);
                            cmbLutador2.addItem(lutNome[i]);
                        }
                        marcarLuta.setVisible(true);
                        //lista.setModel(cmbLutador1);

                        btnMarcarLuta.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                int vetorLutador1 = cmbLutador1.getSelectedIndex() - 1;
                                int vetorLutador2 = cmbLutador2.getSelectedIndex() - 1;
                                System.out.println(vetorLutador1);
                                System.out.println(vetorLutador2);

                                Luta luta = new Luta();
                                luta.marcarLuta(l[vetorLutador1], l[vetorLutador2]);
                                luta.getDesafiado();
                                luta.getDesafiante();
                                luta.lutar();

                                if (luta.getAprovada()) {
                                    marcarLuta.setVisible(false);
                                    resultadoLuta.setVisible(true);
                                    lblResultadoLuta.setForeground(Color.BLACK);

                                    txtpaneResultado.setText((l[vetorLutador1].getNome())); // ?

                                    lblResultadoLuta.setText("Vencedor: " + luta.getVencedor() + "\n - Perdedor: "+ luta.getPerdedor());
                                    txtpaneResultado.setText("Vencedor: " + luta.getVencedor() + "\nPerdedor: " +
                                            luta.getPerdedor() + "\n-------> Estatísticas Pós Luta <-------\n" +
                                            l[vetorLutador1].getNome() + " agora tem: \n" + l[vetorLutador1].getVitorias() + ((l[vetorLutador1].getVitorias() == 1) ? " vitória" : " vitórias") +
                                            ", " + l[vetorLutador1].getDerrotas() + ((l[vetorLutador1].getDerrotas() == 1) ? " derrota" : " derrotas") +
                                            " e " + l[vetorLutador1].getEmpates() + ((l[vetorLutador1].getEmpates() == 1) ? " empate" : " empates") +
                                            "\n---------------------------------------\n" +
                                            l[vetorLutador2].getNome() + " agora tem: \n" + l[vetorLutador2].getVitorias() + ((l[vetorLutador2].getVitorias() == 1) ? " vitória" : " vitórias") +
                                            ", " + l[vetorLutador2].getDerrotas() + ((l[vetorLutador2].getDerrotas() == 1) ? " derrota" : " derrotas") +
                                            " e " + l[vetorLutador2].getEmpates() + ((l[vetorLutador2].getEmpates() == 1) ? " empate" : " empates"));
                                } else if (!l[vetorLutador1].getCategoria().equals(l[vetorLutador2].getCategoria())){ // Painel luta não pode acontecer categorias diferentes
                                    resultadoLuta.setVisible(true);

                                    lblResultadoLuta.setForeground(Color.RED);
                                    lblResultadoLuta.setText("A luta não pode acontecer");
                                    txtpaneResultado.setText("A luta não pode acontecer pois " + l[vetorLutador1].getNome() + " pertence a categoria " + l[vetorLutador1].getCategoria() + ", diferentemente de "+ l[vetorLutador2].getNome() + ", que pertence a categoria " + l[vetorLutador2].getCategoria());
                                    //txtpaneResultado.setText("A luta não pode acontecer pois ou o lutador está lutando contra si mesmo ou está lutando contra um lutador de uma categoria diferente");
                                } else { // Luta não pode acontecer pois lutador lutando contra si mesmo
                                    lblResultadoLuta.setForeground(Color.RED);
                                    lblResultadoLuta.setText("A luta não pode acontecer");
                                    txtpaneResultado.setText(l[vetorLutador1].getNome() + " não pode lutar contra si mesmo");
                                }
                                marcarLuta.setVisible(true);

                                /*for (i = 0; i <= l.length -1; i++) {

                                }*/
                            }

                        });
                    }

                });

            }
        });
    }

    public static void main(String[] args) {
        new TelaUFC();
    }
}
