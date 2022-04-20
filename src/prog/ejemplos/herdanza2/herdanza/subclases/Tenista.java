package prog.ejemplos.herdanza2.herdanza.subclases;

import prog.ejemplos.herdanza2.herdanza.Persoa;

public class Tenista extends Persoa {

    private double partidosXogados;

    public Tenista() {
    }

    public Tenista(String nome, int edade, double partidosXogados) {
        super(nome, edade);
        this.partidosXogados = partidosXogados;
    }

    public double getPartidosXogados() {
        return partidosXogados;
    }

    public void setPartidosXogados(double partidosXogados) {
        this.partidosXogados = partidosXogados;
    }

    @Override
    public String toString() {
        return super.toString()+
                " ,partidosXogados=" + partidosXogados;
    }

    @Override
    public void amosar() {
        System.out.println(super.toString()+ " ,partidosXogados=" + partidosXogados);
    }
}
