import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Transaccion extends JFrame{
    private JPanel panel_transaccion;
    private JRadioButton verSaldoRadioButton;
    private JRadioButton RetiroRadioButton;
    private JRadioButton depositoRadioButton;
    private JRadioButton salirRadioButton;

    private double ver_saldo;

    public void setVer_saldo(double ver_saldo) {
        this.ver_saldo = ver_saldo;
    }

    public Double getVer_saldo() {
        return ver_saldo;
    }

    public Transaccion() {
        super("Transacción a Realizar");
        ver_saldo=0;
        setUndecorated(true);
        setVisible(true);
        setSize(500,500);
        setLocationRelativeTo(null);
        add(panel_transaccion);



        verSaldoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Saldo pagina_saldo=new Saldo(Transaccion.this);

                pagina_saldo.setUndecorated(true);
                pagina_saldo.setVisible(true);
                dispose();
            }
        });
        RetiroRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Retiro pagina_retiro=new Retiro(Transaccion.this);
                pagina_retiro.setUndecorated(true);
                pagina_retiro.setVisible(true);
                dispose();
            }
        });
        depositoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Depositos pagina_deposito=new Depositos(Transaccion.this);
                pagina_deposito.setUndecorated(true);
                pagina_deposito.setVisible(true);
                dispose();
            }
        });
        salirRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"¡Muchas Gracias!");
                dispose();
            }
        });
    }
}
