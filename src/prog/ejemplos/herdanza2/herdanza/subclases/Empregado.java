package prog.ejemplos.herdanza2.herdanza.subclases;

import prog.ejemplos.herdanza2.herdanza.Persoa;

public class Empregado extends Persoa {

    private float soldo;

    public Empregado(){
        //super();

    }

    public Empregado(String nome,int edade, float soldo) {
        super(nome,edade);
        this.soldo = soldo;
    }

    @Override
    public String toString() {
        return super.toString()+ " ,soldo=" + soldo;
    }

    @Override
    public void amosar() {

        System.out.println(super.toString()+ " ,soldo=" + soldo);
    }
}
