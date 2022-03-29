package prog.ejemplos.GUI;

import javax.swing.*;
import java.awt.*;

public class Distribu {

    JFrame marco;
    JPanel panel;
    JButton boton1,boton2,boton3,boton4,boton5;

    public void disFlowLayout(){
        marco = new JFrame(" FLOWLAYOUT ");
        marco.setSize(600,600);
        panel = new JPanel();
        boton1 = new JButton("Boton 1");
        boton2 = new JButton("Boton 2");
        boton3 = new JButton("Boton 3");
        boton4 = new JButton("Boton 4");
        boton5 = new JButton("Boton 5");

        // indicamos o layout

        panel.setLayout(new FlowLayout(FlowLayout.LEFT,50,20));
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        marco.add(panel);
        marco.setLocationRelativeTo(marco);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra Aplicacion cuando X;
        marco.setVisible(true);
    }

    public void componentes(String text){

        marco = new JFrame(text);
        marco.setSize(600,600);
        panel = new JPanel();
        boton1 = new JButton("Boton 1");
        boton2 = new JButton("Boton 2");
        boton3 = new JButton("Boton 3");
        boton4 = new JButton("Boton 4");
        boton5 = new JButton("Boton 5");
    }

    public void pecharVentana(){

        marco.setLocationRelativeTo(marco);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra Aplicacion cuando X;
        marco.setVisible(true);
    }

    public void layout2(){
        this.componentes("FlowLayout");
        panel.setLayout(new FlowLayout(FlowLayout.LEFT,50,20));
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        marco.add(panel);
        this.pecharVentana();

    }

    public void disBoxlayout(){

        this.componentes("BoxLayout");
        panel.setLayout(new BoxLayout(panel,BoxLayout.X_AXIS));
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        marco.add(panel);
        this.pecharVentana();
    }

    public void disBorderLayout(){

        this.componentes("BorderLayout");
        panel.setLayout(new BorderLayout());
        panel.add(boton1,BorderLayout.NORTH);
        panel.add(boton2,BorderLayout.WEST);
        panel.add(boton3,BorderLayout.SOUTH);
        panel.add(boton4,BorderLayout.EAST);
        panel.add(boton5,BorderLayout.CENTER);
        marco.add(panel);
        this.pecharVentana();
    }

    public void disGridLayout(){

        this.componentes("GrindLayout");
        panel.setLayout(new GridLayout(3,3));
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        marco.add(panel);
        this.pecharVentana();
    }
}
