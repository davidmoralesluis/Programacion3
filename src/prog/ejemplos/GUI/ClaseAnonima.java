package prog.ejemplos.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClaseAnonima {
    /*
    Se define en la misma lina

    Superclase obx = new Superclase() {definicion clase anonima};
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
        bVerde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.green);
            }
        }); // this porque o ActionPerformed esta na mesma clase
        bAzul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.blue);
            }
        });
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}
