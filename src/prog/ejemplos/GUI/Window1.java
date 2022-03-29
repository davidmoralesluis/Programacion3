package prog.ejemplos.GUI;

import javax.swing.*;

public class Window1 {
    JFrame marco;

    public void crearVentana1(){
        // instanciamos a ventana
        marco = new JFrame("* 1º VENTANA *");

        // dámoslle características
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra Aplicacion cuando X;

        marco.setBounds(1500,500,400,400);
    }
}
