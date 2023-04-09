import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class FirstWindow extends JFrame implements Serializable {


    private JPanel panel1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JComboBox comboBox1;
    private JCheckBox inspeccionadoEnAduanasCheckBox;
    private JRadioButton a1RadioButton;
    private JRadioButton a2RadioButton;
    private JRadioButton a3RadioButton;
    private JTextField textField1;
    private JTextArea textArea1;
    private JLabel t1;
    private JLabel t2;
    private JLabel t3;
    private JLabel t4;
    private JLabel t5;
    private JLabel foto;
    private JButton apilarButton;
    private JButton desapilarButton;
    private JButton mostrarDatosContenedorButton;
    private JButton cuántosButton;
    private JComboBox comboBox2;
    private JTextField textField5;
    private JTextField textField6;
    private JTextArea textArea2;
    private JTextField textField7;
    private JTextField textfield;
    private Carguero c;
    private boolean aduanas = false;
    FileInputStream fis = null;
    ObjectInputStream entrada = null;
    ObjectOutputStream salida = null;
    FileOutputStream fos = null;
    public FirstWindow() throws IOException, ClassNotFoundException {
        /*
        ObjectOutputStream salida = null;
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("C:\\Users\\Vlad\\OneDrive - Universidad de Castilla-La Mancha\\Escritorio\\EntregaFinal_G10\\FrontEnd_G10\\puerto.dat");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            salida = new ObjectOutputStream(fos);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        Carguero c = new Carguero();
        try {
            salida.writeObject(c);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try {
            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            salida.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

         */


        comboBox1.addItem("España");
        comboBox1.addItem("Francia");
        comboBox1.addItem("EEUU");
        comboBox1.addItem("Inglaterra");
        comboBox1.addItem("Rumania");
        comboBox1.addItem("Rusia");
        comboBox1.addItem("Australia");
        comboBox1.addItem("Egipto");
        comboBox1.addItem("Canada");
        comboBox1.addItem("Mexico");
        comboBox1.addItem("Argentina");
        comboBox1.addItem("China");
        comboBox1.addItem("Japon");
        comboBox1.addItem("Cor.Sur");
        comboBox1.addItem("Arabia Saudita");
        comboBox1.addItem("Alemania");
        comboBox1.addItem("Noruega");
        comboBox1.addItem("Holanda");
        comboBox1.addItem("Albania");
        comboBox1.addItem("India");
        comboBox1.setSelectedItem(null);
        comboBox2.addItem("España");
        comboBox2.addItem("Francia");
        comboBox2.addItem("EEUU");
        comboBox2.addItem("Inglaterra");
        comboBox2.addItem("Rumania");
        comboBox2.addItem("Rusia");
        comboBox2.addItem("Australia");
        comboBox2.addItem("Egipto");
        comboBox2.addItem("Canada");
        comboBox2.addItem("Mexico");
        comboBox2.addItem("Argentina");
        comboBox2.addItem("China");
        comboBox2.addItem("Japon");
        comboBox2.addItem("Cor.Sur");
        comboBox2.addItem("Arabia Saudita");
        comboBox2.addItem("Alemania");
        comboBox2.addItem("Noruega");
        comboBox2.addItem("Holanda");
        comboBox2.addItem("Albania");
        comboBox2.addItem("India");
        comboBox2.setSelectedItem(null);
        setTitle("Gestión de contenedor");
        setContentPane(panel1);
        setBounds(200, 0, 1200, 900);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        /////////////////////////////////
        /////////////////////////////////
        /////////////////////////////////
        FileInputStream fis = null;
        ObjectInputStream entrada = null;
        ///////////Lectura///////////////
        fis = new FileInputStream("C:\\Users\\Vlad\\OneDrive - Universidad de Castilla-La Mancha\\Escritorio\\EntregaFinal_G10\\FrontEnd_G10\\puerto.dat");
        entrada = new ObjectInputStream(fis);
        c = (Carguero) entrada.readObject();
        //System.out.println(c.toString());
        //textArea2.setText(c.toString(0));

        /////////////Cierre//////////////
        fis.close();
        entrada.close();
        ////////////////////////////////
        textArea2.setText(c.toString());
        ////////////////////////////////
        mostrarDatosContenedorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SecondWindow sw = new SecondWindow(c.mostrarContenedor(Integer.parseInt(textField6.getText())), aduanas);
            }
        });
        apilarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Pulsaste el botón 'Apilar'.", "", JOptionPane.INFORMATION_MESSAGE);
                if(textField1.getText()!=null &&
                        textField2.getText()!=null &&
                        textField3.getText()!=null &&
                        textField4.getText()!=null &&
                        textArea1.getText()!=null &&
                        comboBox1.getSelectedItem()!=null &&
                        (a1RadioButton.isSelected() || a2RadioButton.isSelected() || a3RadioButton.isSelected())

                ){
                    int x=0;
                    if(a1RadioButton.isSelected())
                        x=1;
                    if(a2RadioButton.isSelected())
                        x=2;
                    if(a3RadioButton.isSelected())
                        x=3;
                    Contenedor cont = new Contenedor(Integer.parseInt(textField1.getText()),x,Double.parseDouble(textField2.getText()),
                            (String)comboBox1.getSelectedItem(), textArea1.getText(), textField3.getText(), textField4.getText());
                    c.apilarContenedor(cont);
                    textArea2.setText(c.toString());
                    try {
                        fos = new FileOutputStream("C:\\Users\\Vlad\\OneDrive - Universidad de Castilla-La Mancha\\Escritorio\\EntregaFinal_G10\\FrontEnd_G10\\puerto.dat");
                    } catch (FileNotFoundException y) {
                        throw new RuntimeException(y);
                    }
                    try {
                        salida = new ObjectOutputStream(fos);
                    } catch (IOException y) {
                        throw new RuntimeException(y);
                    }
                    try {
                        salida.writeObject(c);
                    } catch (IOException y) {
                        throw new RuntimeException(y);
                    }

                    try {
                        fos.close();
                    } catch (IOException y) {
                        throw new RuntimeException(y);
                    }
                    try {
                        salida.close();
                    } catch (IOException y) {
                        throw new RuntimeException(y);
                    }
                }
            }
        });
        desapilarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Pulsaste el botón 'Desapìlar'.", "", JOptionPane.INFORMATION_MESSAGE);
            if(textField5.getText()!=null && textfield.getText()!=null){
                c.desapilarContenedor(Integer.parseInt(textField5.getText()), Integer.parseInt(textfield.getText()));
                textArea2.setText(c.toString());
                try {
                    fos = new FileOutputStream("C:\\Users\\Vlad\\OneDrive - Universidad de Castilla-La Mancha\\Escritorio\\EntregaFinal_G10\\FrontEnd_G10\\puerto.dat");
                } catch (FileNotFoundException y) {
                    throw new RuntimeException(y);
                }
                try {
                    salida = new ObjectOutputStream(fos);
                } catch (IOException y) {
                    throw new RuntimeException(y);
                }
                try {
                    salida.writeObject(c);
                } catch (IOException y) {
                    throw new RuntimeException(y);
                }


                try {
                    fos.close();
                } catch (IOException y) {
                    throw new RuntimeException(y);
                }
                try {
                    salida.close();
                } catch (IOException y) {
                    throw new RuntimeException(y);
                }
            }
            }
        });
        cuántosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Pulsaste el botón '¿Cuántos?'.", "", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        inspeccionadoEnAduanasCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inspeccionadoEnAduanasCheckBox.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Pulsaste el botón 'Inspeccionado en aduanas'.", "", JOptionPane.INFORMATION_MESSAGE);
                    aduanas = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Despulsaste el botón 'Inspeccionado en aduanas'.", "", JOptionPane.INFORMATION_MESSAGE);
                    aduanas = false;
                }
            }
        });
        a1RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (a1RadioButton.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Pulsaste 'prioridad 1'.", "", JOptionPane.INFORMATION_MESSAGE);
                    a3RadioButton.setSelected(false);
                    a2RadioButton.setSelected(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Despulsaste 'prioridad 1'.", "", JOptionPane.INFORMATION_MESSAGE);
                }

            }

        });
        a2RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (a2RadioButton.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Pulsaste 'prioridad 2'.", "", JOptionPane.INFORMATION_MESSAGE);
                    a1RadioButton.setSelected(false);
                    a3RadioButton.setSelected(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Despulsaste 'prioridad 2'.", "", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        a3RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (a3RadioButton.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Pulsaste 'prioridad 3'.", "", JOptionPane.INFORMATION_MESSAGE);
                    a1RadioButton.setSelected(false);
                    a2RadioButton.setSelected(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Despulsaste 'prioridad 3'.", "", JOptionPane.INFORMATION_MESSAGE);

                }
            }
        });
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comboBox1.getSelectedItem() == "Sin desayuno")
                    JOptionPane.showMessageDialog(null, "Has seleccionado sin desayuno", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        cuántosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(comboBox2.getSelectedItem()!=null){
                    String pais= (String) comboBox2.getSelectedItem();
                    int x =0;
                    x = c.contenedoresporPais(pais);
                    textField7.setText(String.valueOf(x));
                }
            }
        });
    }
}
