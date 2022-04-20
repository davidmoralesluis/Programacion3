package prog.ejemplos.herdanza.subclases;

import prog.ejemplos.herdanza.Persoa;

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
}
