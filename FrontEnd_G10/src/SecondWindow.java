import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SecondWindow extends JFrame{

    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextArea textArea1;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JRadioButton a1RadioButton;
    private JRadioButton a2RadioButton;
    private JRadioButton a3RadioButton;
    private JCheckBox inspeccionadoEnAduanasCheckBox;



    public SecondWindow(Contenedor c, boolean aduanas){

        textField1.setText(String.valueOf(c.getItentificador()));
        textField2.setText(String.valueOf(c.getPeso()));
        textArea1.setText(String.valueOf(c.getDescripción()));
        textField3.setText(String.valueOf(c.getEmpresaEmisora()));
        textField4.setText(c.getEmpresaReceptora());
        textField5.setText(c.getPaísProcedencia());
        if(aduanas)
            inspeccionadoEnAduanasCheckBox.setSelected(true);
        if(c.getPrioridad()==1)
            a1RadioButton.setSelected(true);
        if(c.getPrioridad()==2)
            a2RadioButton.setSelected(true);
        if(c.getPrioridad()==3)
            a3RadioButton.setSelected(true);
        setTitle("Gestión de contenedor");
        setContentPane(panel1);
        setBounds(470,410,1205,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        setVisible(true);

        inspeccionadoEnAduanasCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(inspeccionadoEnAduanasCheckBox.isSelected()){
                    JOptionPane.showMessageDialog(null,"Pulsaste el botón 'Inspeccionado en aduanas'.","",JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null,"Despulsaste el botón 'Inspeccionado en aduanas'.","",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        a1RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(a1RadioButton.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Pulsaste 'prioridad 1'.", "", JOptionPane.INFORMATION_MESSAGE);
                    a3RadioButton.setSelected(false);
                    a2RadioButton.setSelected(false);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Despulsaste 'prioridad 1'.","",JOptionPane.INFORMATION_MESSAGE);
                }

            }

        });
        a2RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(a2RadioButton.isSelected()){
                    JOptionPane.showMessageDialog(null,"Pulsaste 'prioridad 2'.","",JOptionPane.INFORMATION_MESSAGE);
                    a1RadioButton.setSelected(false);
                    a3RadioButton.setSelected(false);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Despulsaste 'prioridad 2'.","",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        a3RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(a3RadioButton.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Pulsaste 'prioridad 3'.", "", JOptionPane.INFORMATION_MESSAGE);
                    a1RadioButton.setSelected(false);
                    a2RadioButton.setSelected(false);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Despulsaste 'prioridad 3'.","",JOptionPane.INFORMATION_MESSAGE);

                }
            }
        });

    }

    public static void main1(String[] args) {
        ObjectOutputStream salida = null;
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("personas.dat");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            salida = new ObjectOutputStream(fos);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
