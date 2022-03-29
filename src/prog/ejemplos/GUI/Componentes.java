package prog.ejemplos.GUI;

import javax.swing.*;
import java.awt.*;

public class Componentes {

    JFrame marco;
    JPanel panel;
    JLabel etiqueta;
    JTextField lineaTexto;
    JButton boton1,boton2;

    public void crearComponentes(){

        //instanciar
        marco = new JFrame();
        panel = new JPanel();
        etiqueta = new JLabel("ETIQUETA");
        lineaTexto = new JTextField();
        boton1 = new JButton("Boton 1");
        boton2 = new JButton();

        // dámoslle características
        marco.setBounds(1500,500,600,600);
        panel.setLayout(null);
        panel.setBackground(Color.orange);
        panel.setBounds(1500,500,600,600);
        etiqueta.setBounds(100,20,150,50);
        lineaTexto.setBounds(300,20,150,50);
        boton1.setBounds(100,400,100,50);
        boton1.setBackground(Color.red);
        boton2.setBounds(400,400,100,50);
        boton2.setText("Boton 2");
        boton2.setToolTipText("limpia o texto");


        // engadimos compoñentes o panel e o panel ao marco
        panel.add(etiqueta);
        panel.add(lineaTexto);
        panel.add(boton1);
        panel.add(boton2);
        marco.add(panel);

        marco.setLocationRelativeTo(marco);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra Aplicacion cuando X;
        marco.setVisible(true);

    }
}
