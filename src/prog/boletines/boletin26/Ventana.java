package prog.boletines.boletin26;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;

public class Ventana implements ActionListener{

    JFrame marco;
    JPanel panel;
    JButton boton1,boton2;
    JTextField textField1,textField2;
    JLabel label1,label2;
    JTextArea textArea;

    public void crearVentana(){

        marco = new JFrame(" Boletin 26 ");
       // marco.setUndecorated(true);
        marco.setBackground(new Color(159, 25, 231));
        marco.setBounds(1200,50,600,600);


        panel = new JPanel();
        panel.setBackground(new Color(0x0000064, true));
        //marco.add(panel);

        label1 = new JLabel("NOME");
        label1.setBackground(new Color(207, 234, 59));
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
        textArea.setBackground(new Color(255, 255, 255));
        textArea.setBounds(100,275,400,100);
        //textArea.setText("Placeholder");
        textArea.setFont(new Font("Dialog", Font.BOLD, 36));

        boton1 = new JButton("PREMER");
        boton1.setBounds(100,450,100,50);

        boton2 = new JButton("LIMPAR");
        boton2.setBounds(400,450,100,50);
        boton2.setToolTipText("Limpiar texto");

        panel.add(label1);
        panel.add(label2);
        panel.add(textField1);
        panel.add(textField2);
        panel.add(textArea);
        panel.add(boton1);
        panel.add(boton2);
        panel.setLayout(null);
        marco.add(panel);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra Aplicacion cuando X;
        marco.setVisible(true);

        boton1.addActionListener(this);
        boton2.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==boton1){
            textArea.setText("Hola "+textField1.getText()+" !!");
        }

        if (e.getSource()==boton2){
            textArea.setText("");
        }

    }



}
