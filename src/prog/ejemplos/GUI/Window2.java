package prog.ejemplos.GUI;

import javax.swing.*;

public class Window2 extends JFrame{

    public void crearVentana2(){

        this.setTitle("** Ventana 2 **");

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra Aplicacion cuando X;

        this.setBounds(1500,0,400,400);


    }
}
