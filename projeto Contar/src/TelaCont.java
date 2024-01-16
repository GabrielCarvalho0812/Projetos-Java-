import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCont extends JFrame {
    private JSlider sliInicio;
    private JSlider sliFim;
    private JSlider sliPasso;
    private JButton btnCont;
    private JList lstCont;
    private JLabel lblInicio;
    private JLabel lblFim;
    private JLabel lblPasso;
    private JPanel tela;

    public TelaCont() {

        setContentPane(tela);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize(500,400);
        setLocationRelativeTo(null);




        sliInicio.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int i = sliInicio.getValue();
                lblInicio.setText(String.valueOf(i));
            }
        });

        sliFim.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int f = sliFim.getValue();
                lblFim.setText(String.valueOf(f));
            }
        });
        sliPasso.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int p = sliPasso.getValue();
                lblPasso.setText((String.valueOf(p)));
            }
        });
        btnCont.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = sliInicio.getValue();
                int f = sliFim.getValue();
                int p = sliPasso.getValue();

                DefaultListModel lista = new DefaultListModel(); // criando um objto lista ..

                for (int c = i; c <= f; c+= p){ // += mesma coisa de c = c + p
                    lista.addElement(c);
                }

                lstCont.setModel(lista);
            }
        });
    }

    public static void main(String[] args) {
        new TelaCont();
    }
}
