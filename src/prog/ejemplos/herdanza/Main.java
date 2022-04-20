package prog.ejemplos.herdanza;

import prog.ejemplos.herdanza.subclases.Empregado;
import prog.ejemplos.herdanza.subclases.Tenista;

public class Main {
    public static void main(String[] args) {

        Persoa p = new Persoa("persona",20);
        Empregado e = new Empregado("empregado",30,1500);
        Tenista t = new Tenista("tenista",18,100);

        amosar(p);
        amosar(e);
        amosar(t);

    }

    public static void amosar(Persoa ob){

        System.out.println(ob.toString());
    }
}
