import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Retiro extends JFrame{
    private JPanel panel_retiro;
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
    private JButton retirarButton;
    private JButton menuButton;
    private JButton regresarButton;
    private JButton borrarButton;

    private Transaccion ventana_transaccion;

    public Retiro(Transaccion ventana_transaccion){
        super("Retiro");
        setSize(500,500);
        setLocationRelativeTo(null);
        add(panel_retiro);



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
                ventana_transaccion.setVisible(true);
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

        retirarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    double numero= Double.parseDouble(valor_ingresado.getText());
                    double valor_actual= ventana_transaccion.getVer_saldo();
                    double resta=valor_actual-numero;
                if(resta>=0){
                    JOptionPane.showMessageDialog(null,"Se ha retirado: $"+valor_ingresado.getText());
                    ventana_transaccion.setVer_saldo(resta);
                    valor_ingresado.setText("");
                }else {
                    JOptionPane.showMessageDialog(null,"No tiene el saldo suficiente");
                }

            }
        });
    }
}
