import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menu extends JFrame{
    private JPanel panel_menu;
    private JTextField usuario_menu;
    private JButton ingresarButton;

    public menu() {
        super("Menu");
        setVisible(true);
        setSize(500,500);
        setLocationRelativeTo(null);
        add(panel_menu);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String usuario="ingegod";

                    usuario_menu.getText();
                    if (usuario.equals(usuario_menu.getText())){
                        Transaccion pagina2=new Transaccion();
                        pagina2.setVisible(true);
                        dispose();
                    }else{
                        throw new IllegalArgumentException("Usuario Incorrecto");
                    }
                }catch (IllegalArgumentException ex){
                        JOptionPane.showMessageDialog(null,"Usuario Incorrecto, Intentar Otra Vez");
                        usuario_menu.setText("");
                    }



            }
        });
    }
}
