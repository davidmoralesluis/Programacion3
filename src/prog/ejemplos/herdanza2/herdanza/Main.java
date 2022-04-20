package prog.ejemplos.herdanza2.herdanza;

import prog.ejemplos.herdanza2.herdanza.subclases.Empregado;
import prog.ejemplos.herdanza2.herdanza.subclases.Marinero;
import prog.ejemplos.herdanza2.herdanza.subclases.Tenista;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Persoa> lista=new ArrayList<>();

        //Persoa p = new Persoa("persona",20);
        Empregado e = new Empregado("empregado",30,1500);
        Tenista t = new Tenista("tenista",18,100);
        Marinero m = new Marinero("Mari",22,7);

        e.amosar();
        t.amosar();
        amosar(m);

        Metodos.engadir(lista,t);

    }



    public static void amosar(Persoa ob){

        System.out.println(ob.toString());
    }
}
