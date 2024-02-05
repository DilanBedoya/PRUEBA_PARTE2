import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Saldo extends JFrame{
    private JPanel panel_saldo;
    private JButton menuButton;
    private JButton regresarButton;
    private JLabel cuenta;


    public Saldo(Transaccion ventana_saldo){
        super("Saldo");
        setSize(500,500);
        setLocationRelativeTo(null);
        add(panel_saldo);
        cuenta.setText(String.valueOf(ventana_saldo.getVer_saldo()));

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
                Transaccion pagina_transaccion=new Transaccion();
                pagina_transaccion.setVer_saldo(ventana_saldo.getVer_saldo());
                pagina_transaccion.setVisible(true);
                dispose();
            }
        });
    }
}
