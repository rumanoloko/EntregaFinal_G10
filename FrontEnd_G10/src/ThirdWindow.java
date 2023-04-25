import com.sun.nio.sctp.AbstractNotificationHandler;

import javax.swing.*;

public class ThirdWindow extends JFrame{
    private JTextArea textArea1;
    private JPanel panel2;

    public ThirdWindow(String s){
        setTitle("Contenedores con peso el minimo requerido");
        setContentPane(panel2);
        setBounds(470,410,1205,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        setVisible(true);
        textArea1.setText(s);
    }
}
