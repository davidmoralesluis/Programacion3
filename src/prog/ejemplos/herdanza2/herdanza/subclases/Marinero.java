package prog.ejemplos.herdanza2.herdanza.subclases;

import prog.ejemplos.herdanza2.herdanza.Persoa;

public class Marinero extends Persoa {

    private int diasEm;

    public Marinero() {
    }

    public Marinero(String nome, int edade, int diasEm) {
        super(nome, edade);
        this.diasEm = diasEm;
    }

    @Override
    public void amosar() {

        System.out.println(super.toString()+ " ,diasE=" + diasEm);


    }
}
