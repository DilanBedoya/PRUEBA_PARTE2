import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Depositos extends JFrame{
    private JPanel panel_deposito;
    private JTextField valor_ingresado;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a0Button;
    private JButton depositarButton;
    private JButton menuButton;
    private JButton regresarButton;
    private JButton borrarButton;

    public Depositos(Transaccion ventana_transaccion){

        super("Depósito");
        setSize(500,500);
        setLocationRelativeTo(null);
        add(panel_deposito);



        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menu pagina_menu=new menu();
                pagina_menu.setVisible(true);
                dispose();
            }
        });

        regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Transaccion pagina_transaccion=new Transaccion();

                //pagina_transaccion.setVisible(true);
                ventana_transaccion.setVisible(true);
                //pagina_transaccion.setVer_saldo(ventana_transaccion.getVer_saldo());

                dispose();
            }
        });

        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor_ingresado.setText(valor_ingresado.getText()+"1");
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor_ingresado.setText(valor_ingresado.getText()+"2");
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor_ingresado.setText(valor_ingresado.getText()+"3");
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor_ingresado.setText(valor_ingresado.getText()+"4");
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor_ingresado.setText(valor_ingresado.getText()+"5");
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor_ingresado.setText(valor_ingresado.getText()+"6");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor_ingresado.setText(valor_ingresado.getText()+"7");
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor_ingresado.setText(valor_ingresado.getText()+"8");
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor_ingresado.setText(valor_ingresado.getText()+"9");
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor_ingresado.setText(valor_ingresado.getText()+"0");
            }
        });
        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor_ingresado.setText("");
            }
        });

        depositarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                JOptionPane.showMessageDialog(null,"Se ha depositado: $"+valor_ingresado.getText());

                double numero= Double.parseDouble(valor_ingresado.getText());
                double valor_actual= ventana_transaccion.getVer_saldo();
                double suma=numero+valor_actual;
                ventana_transaccion.setVer_saldo(suma);

                valor_ingresado.setText("");
            }
        });
    }

}
