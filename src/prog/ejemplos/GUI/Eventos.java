package prog.ejemplos.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Eventos implements ActionListener {

    JFrame marco;
    JPanel panel;
    JButton bVerde;
    JButton bAzul;

    public void crearEventos(){

        marco = new JFrame("***EVENTOS***");
        marco.setSize(800,600);

        panel = new JPanel();
        panel.setSize(750,550);

        bVerde = new JButton();
        bVerde.setText("VERDE");

        bAzul = new JButton();
        bAzul.setText("AZUL");

        //poñemos compoñentes no panel
        panel.add(bVerde);
        panel.add(bAzul);
        marco.add(panel);
        marco.setLocationRelativeTo(marco);

        // xestion de eventos
        bVerde.addActionListener((ActionListener) this); // this porque o ActionPerformed esta na mesma clase
        bAzul.addActionListener(this);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object ob=e.getSource();


        if (ob==bVerde){
            panel.setBackground(Color.green);
        }

        if (ob==bAzul){
            panel.setBackground(Color.blue);
        }

        if (ob instanceof JButton){

        }else if(ob instanceof JTextField){

        }
    }
}
