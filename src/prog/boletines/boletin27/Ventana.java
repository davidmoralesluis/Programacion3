package prog.boletines.boletin27;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana implements ActionListener {
    JFrame marco;
    JPanel panel,panel2;
    JButton boton1,boton2;
    JTextField textField1,textField2;
    JLabel label1,label2;
    JTextArea textArea;

    public void crearVentana(){

        marco = new JFrame(" Boletin 26 ");
        // marco.setUndecorated(true);
        marco.setBackground(new Color(159, 25, 231));
        marco.setBounds(1200,50,600,900);
        marco.setLayout(null);


        panel = new JPanel();
        panel.setSize(600,450);
        panel.setBackground(new Color(0x9F3253));
        panel.setLayout(null);
        //marco.add(panel);

        panel2 = new JPanel();
        panel2.setSize(600,450);
        panel2.setLayout(null);

        label1 = new JLabel("NOME");
        label1.setBounds(100,50,100,30);

        textField1 = new JTextField();
        textField1.setBackground(new Color(0xDE8828));
        textField1.setBounds(300,50,200,30);

        label2 = new JLabel("PASSWORD");
        label2.setBackground(Color.orange);
        label2.setBounds(100,150,100,30);

        textField2 = new JTextField();
        textField2.setBackground(new Color(0xDE8828));
        textField2.setBounds(300,150,200,30);

        textArea = new JTextArea();
        textArea.setBackground(new Color(207, 234, 59));
        textArea.setBounds(100,275,400,100);
        //textArea.setText("Placeholder");
        textArea.setFont(new Font("Dialog", Font.BOLD, 36));

        boton1 = new JButton("PREMER");
        boton1.setBounds(100,300,100,50);

        boton2 = new JButton("LIMPAR");
        boton2.setBounds(400,300,100,50);
        boton2.setToolTipText("Limpiar texto");

        panel.add(label1);
        panel.add(label2);
        panel.add(textField1);
        panel.add(textField2);
        panel.add(boton1);
        panel.add(boton2);

        panel2.add(textArea);


        marco.add(panel);
        marco.add(panel2);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra Aplicacion cuando X;
        marco.setVisible(true);

        boton1.addActionListener(this);
        boton2.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==boton1){
        }

        if (e.getSource()==boton2){
        }

    }
}
