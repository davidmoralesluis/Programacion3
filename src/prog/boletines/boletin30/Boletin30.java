package prog.boletines.boletin30;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Boletin30 implements ActionListener {


    JFrame calculadora;
    JPanel teclado;
    JLabel display;
    JButton tec1,tec2,tec3,tec4,tec5,tec6,tec7,tec8,tec9,tec0,tecDiv,tecMul,tecMin,tecMas,tecIgual,tecPoint,tecAC,tecOff;

    String[] textoOperacion=new String[3];

    boolean isOP=false;

    double num;
    double op1;
    double op2;
    String operacion;
    String textoDisplay;



    public void run(){

        calculadora = new JFrame();
        calculadora.setBounds(1650,600,290,450);

        calculadora.getContentPane().setBackground(new Color(100,100,100));
        calculadora.setLayout(null);

        display = new JLabel("< La Calculadora >");
        display.setBounds(20,20,250,50);
        display.setBackground(new Color(255,255,255));
        display.setOpaque(true);
        display.setFont(new Font("Dialog", Font.ITALIC, 20));
        display.setHorizontalAlignment(SwingConstants.CENTER);

        teclado = new JPanel();
        teclado.setBounds(20,100,250,290);
        teclado.setBackground(new Color(180,180,180));
        teclado.setLayout(null);

        tecAC = new JButton("AC");
        tecAC.setBounds(50,5,70,20);
        tecAC.setBackground(new Color(7, 51, 201));
        tecAC.setForeground(new Color(7, 51, 201));
        //tecAC.setForeground(new Color(255,255,255));
        tecAC.setFont(new Font("Dialog", Font.BOLD, 12));
        teclado.add(tecAC);

        tecOff = new JButton("OFF");
        tecOff.setBounds(130,5,70,20);
        tecOff.setBackground(new Color(178, 5, 39));
        tecOff.setForeground(new Color(178, 5, 39));
        //tecOff.setOpaque(true);
        //tecOff.setForeground(new Color(255,255,255));
        tecOff.setFont(new Font("Dialog", Font.BOLD, 12));
        teclado.add(tecOff);

        tec7 = new JButton("7");
        tec7.setBounds(10,50,50,50);
        tec7.setBackground(new Color(150,150,150));
        tec7.setForeground(Color.black);
        tec7.setFont(new Font("Dialog", Font.ITALIC, 20));
        teclado.add(tec7);

        tec8 = new JButton("8");
        tec8.setBounds(70,50,50,50);
        tec8.setBackground(new Color(150,150,150));
        tec8.setForeground(Color.black);
        tec8.setFont(new Font("Dialog", Font.ITALIC, 20));
        teclado.add(tec8);

        tec9 = new JButton("9");
        tec9.setBounds(130,50,50,50);
        tec9.setBackground(new Color(150,150,150));
        tec9.setForeground(Color.black);
        tec9.setFont(new Font("Dialog", Font.ITALIC, 20));
        teclado.add(tec9);

        tecDiv = new JButton("/");
        tecDiv.setBounds(190,50,50,50);
        tecDiv.setBackground(new Color(150,150,150));
        tecDiv.setForeground(Color.black);
        tecDiv.setFont(new Font("Dialog", Font.ITALIC, 20));
        teclado.add(tecDiv);

        tec4 = new JButton("4");
        tec4.setBounds(10,110,50,50);
        tec4.setBackground(new Color(150,150,150));
        tec4.setForeground(Color.black);
        tec4.setFont(new Font("Dialog", Font.ITALIC, 20));
        teclado.add(tec4);

        tec5 = new JButton("5");
        tec5.setBounds(70,110,50,50);
        tec5.setBackground(new Color(150,150,150));
        tec5.setForeground(Color.black);
        tec5.setFont(new Font("Dialog", Font.ITALIC, 20));
        teclado.add(tec5);

        tec6 = new JButton("6");
        tec6.setBounds(130,110,50,50);
        tec6.setBackground(new Color(150,150,150));
        tec6.setForeground(Color.black);
        tec6.setFont(new Font("Dialog", Font.ITALIC, 20));
        teclado.add(tec6);

        tecMul = new JButton("*");
        tecMul.setBounds(190,110,50,50);
        tecMul.setBackground(new Color(150,150,150));
        tecMul.setForeground(Color.black);
        tecMul.setFont(new Font("Dialog", Font.ITALIC, 20));
        teclado.add(tecMul);

        tec1 = new JButton("1");
        tec1.setBounds(10,170,50,50);
        tec1.setBackground(new Color(150,150,150));
        tec1.setForeground(Color.black);
        tec1.setFont(new Font("Dialog", Font.ITALIC, 20));
        teclado.add(tec1);

        tec2 = new JButton("2");
        tec2.setBounds(70,170,50,50);
        tec2.setBackground(new Color(150,150,150));
        tec2.setForeground(Color.black);
        tec2.setFont(new Font("Dialog", Font.ITALIC, 20));
        teclado.add(tec2);

        tec3 = new JButton("3");
        tec3.setBounds(130,170,50,50);
        tec3.setBackground(new Color(150,150,150));
        tec3.setForeground(Color.black);
        tec3.setFont(new Font("Dialog", Font.ITALIC, 20));
        teclado.add(tec3);

        tecMin = new JButton("-");
        tecMin.setBounds(190,170,50,50);
        tecMin.setBackground(new Color(150,150,150));
        tecMin.setForeground(Color.black);
        tecMin.setFont(new Font("Dialog", Font.ITALIC, 20));
        teclado.add(tecMin);

        tec0 = new JButton("0");
        tec0.setBounds(10,230,50,50);
        tec0.setBackground(new Color(150,150,150));
        tec0.setForeground(Color.black);
        tec0.setFont(new Font("Dialog", Font.ITALIC, 20));
        teclado.add(tec0);

        tecPoint = new JButton(".");
        tecPoint.setBounds(70,230,50,50);
        tecPoint.setBackground(new Color(150,150,150));
        tecPoint.setForeground(Color.black);
        tecPoint.setFont(new Font("Dialog", Font.ITALIC, 20));
        teclado.add(tecPoint);

        tecIgual = new JButton("=");
        tecIgual.setBounds(130,230,50,50);
        tecIgual.setBackground(new Color(150,150,150));
        tecIgual.setForeground(Color.black);
        tecIgual.setFont(new Font("Dialog", Font.ITALIC, 19));
        teclado.add(tecIgual);

        tecMas = new JButton("+");
        tecMas.setBounds(190,230,50,50);
        tecMas.setBackground(new Color(150,150,150));
        tecMas.setForeground(Color.black);
        tecMas.setFont(new Font("Dialog", Font.ITALIC, 19));
        teclado.add(tecMas);

        calculadora.add(display);
        calculadora.add(teclado);
        calculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra Aplicacion cuando X;
        calculadora.setVisible(true);
        calculadora.setResizable(false);

        tecAC.addActionListener(this);
    }

    public void onOff(boolean state){

        if (state) {
            display.setFont(new Font("Dialog", Font.BOLD, 24));
            display.setHorizontalAlignment(SwingConstants.RIGHT);
            tecOff.addActionListener(this);
            tecDiv.addActionListener(this);
            tecMul.addActionListener(this);
            tecMin.addActionListener(this);
            tecMas.addActionListener(this);
            tecIgual.addActionListener(this);
            tecPoint.addActionListener(this);
            tec0.addActionListener(this);
            tec1.addActionListener(this);
            tec2.addActionListener(this);
            tec3.addActionListener(this);
            tec4.addActionListener(this);
            tec5.addActionListener(this);
            tec6.addActionListener(this);
            tec7.addActionListener(this);
            tec8.addActionListener(this);
            tec9.addActionListener(this);
        }else {
            display.setText("off");
            tecOff.removeActionListener(this);
            tecDiv.removeActionListener(this);
            tecMul.removeActionListener(this);
            tecMin.removeActionListener(this);
            tecMas.removeActionListener(this);
            tecIgual.removeActionListener(this);
            tecPoint.removeActionListener(this);
            tec0.removeActionListener(this);
            tec1.removeActionListener(this);
            tec2.removeActionListener(this);
            tec3.removeActionListener(this);
            tec4.removeActionListener(this);
            tec5.removeActionListener(this);
            tec6.removeActionListener(this);
            tec7.removeActionListener(this);
            tec8.removeActionListener(this);
            tec9.removeActionListener(this);
        }
    }

    public void result(){
        textoDisplay=display.getText();
        isOP=false;
        textoOperacion=textoDisplay.split(" ");
        operacion=textoOperacion[1];
        op1=Double.parseDouble(textoOperacion[0]);
        op2=Double.parseDouble(textoOperacion[2]);
        if(operacion.equalsIgnoreCase("+")){
            display.setText(op1+op2+"");
        }
        if(operacion.equalsIgnoreCase("-")){
            display.setText(op1-op2+"");
        }
        if(operacion.equalsIgnoreCase("*")){
            display.setText(op1*op2+"");
        }
        if(operacion.equalsIgnoreCase("/")){
            display.setText(op1/op2+"");
        }
        textoDisplay="";
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object t=e.getSource();



        if (t==tecAC){
            display.setText("0");
            onOff(true);
        }

        if (t==tecOff){
            display.setText("");
            onOff(false);
        }

        if (t==tecMas){
            if (isOP) {
                result();
            }
            display.setText(display.getText()+" + ");
            isOP=true;
        }

        if (t==tecMin){
            if (isOP) {
                result();
            }
            display.setText(display.getText()+" - ");
            isOP=true;
        }

        if (t==tecMul){
            if (isOP) {
                result();
            }
            display.setText(display.getText()+" * ");
            isOP=true;
        }

        if (t==tecDiv){
            if (isOP) {
                result();
            }
            display.setText(display.getText()+" / ");
            isOP=true;
        }

        if (t==tecIgual){
            result();
        }

        if (t==tec1){
            if(isOP){
                display.setText(display.getText()+"1");
            }else{
                display.setText("");
                display.setText(display.getText()+"1");

            }
        }

        if (t==tec2){
            if(isOP){
                display.setText(display.getText()+"2");
            }else{
                display.setText("");
                display.setText(display.getText()+"2");

            }
        }

        if (t==tec3){
            if(isOP){
                display.setText(display.getText()+"3");
            }else{
                display.setText("");
                display.setText(display.getText()+"3");

            }
        }

        if (t==tec4){
            if(isOP){
                display.setText(display.getText()+"4");
            }else{
                display.setText("");
                display.setText(display.getText()+"4");

            }
        }

        if (t==tec5){
            if(isOP){
                display.setText(display.getText()+"5");
            }else{
                display.setText("");
                display.setText(display.getText()+"5");

            }
        }

        if (t==tec6){
            if(isOP){
                display.setText(display.getText()+"6");
            }else{
                display.setText("");
                display.setText(display.getText()+"6");

            }
        }

        if (t==tec7){
            if(isOP){
                display.setText(display.getText()+"7");
            }else{
                display.setText("");
                display.setText(display.getText()+"7");

            }
        }

        if (t==tec8){
            if(isOP){
                display.setText(display.getText()+"8");
            }else{
                display.setText("");
                display.setText(display.getText()+"8");

            }
        }

        if (t==tec9){
            if(isOP){
                display.setText(display.getText()+"9");
            }else{
                display.setText("");
                display.setText(display.getText()+"9");

            }
        }

        if (t==tec0){
            if(isOP){
                display.setText(display.getText()+"0");
            }else{
                display.setText("");
                display.setText(display.getText()+"0");

            }
        }




        }//acticn
    }//fin

