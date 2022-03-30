package prog.ejemplos.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClaseInterna {
    /*
    NomeClaseExterna.NomeClaseInterna obx= new nomeClaseExterna().new nomeClaseInterna();
    Externa.Interna obx = new Externa().new Interna();
    obx.amosar();
     */

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
        bVerde.addActionListener(new InternaInterna()); // this porque o ActionPerformed esta na mesma clase
        bAzul.addActionListener(new InternaInterna());
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

    private class InternaInterna implements ActionListener{



        @Override
        public void actionPerformed(ActionEvent e) {

            Object obx = e.getSource();

            if (obx==bVerde){
                panel.setBackground(Color.green);
            }

            if (obx == bAzul){
                panel.setBackground(Color.blue);
            }
        }
    }
}
