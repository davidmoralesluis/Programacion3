package prog.boletines.boletin29;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Boletin29 implements ActionListener {

    JFrame ventana;
    JPanel panel;
    JLabel nome, apellido;
    JTextField tnome, tapellido;
    JComboBox<String> clases;
    JButton agregar;
    JTable tabla;

    String [] columnas;

    public void window(){

        ventana = new JFrame();
        ventana.setBounds(1200,50,600,600);
        ventana.setLayout(null);

        panel = new JPanel();
        panel.setBounds(0,0,600,600);
        panel.setBackground(new Color(150, 150, 150));
        panel.setLayout(null);

        nome = new JLabel("NOME");
        nome.setBounds(40,40,100,30);
        nome.setBackground(Color.orange);

        tnome = new JTextField();
        tnome.setBackground(new Color(254,254,254));
        tnome.setBounds(150,40,180,30);

        clases = new JComboBox<String>();
        clases.addItem("DAM1");
        clases.addItem("DAM2");
        clases.addItem("ASIR1");
        clases.addItem("ASIR2");
        clases.setBackground(new Color(254,254,254));
        clases.setBounds(380,40,180,30);

        apellido = new JLabel("NOME");
        apellido.setBounds(40,140,100,30);
        apellido.setBackground(Color.orange);

        tapellido = new JTextField();
        tapellido.setBackground(new Color(254,254,254));
        tapellido.setBounds(150,140,180,30);

        agregar = new JButton("AGREGAR TABOA");
        agregar.setBounds(380,140,180,30);

        tabla = new JTable(2,3);
        tabla.setBounds(50,250,500,100);



        panel.add(nome);
        panel.add(tnome);
        panel.add(clases);
        panel.add(apellido);
        panel.add(tapellido);
        panel.add(agregar);
        panel.add(tabla);


        ventana.add(panel);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra Aplicacion cuando X;
        ventana.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
