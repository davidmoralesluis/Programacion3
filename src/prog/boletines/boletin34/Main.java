package prog.boletines.boletin34;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList <SeleccionFutbol> seleccion = new ArrayList<>();

        seleccion.add(new Masajista(999,"Mas", "Saje",37,"Masajista",5));
        seleccion.add(new Entrenador(1,"Luis","Enrique",44,001));
        seleccion.add(new Futbolista(101,"Andres","Iniesta",30,6,"CentroCampista"));

        for (SeleccionFutbol x:seleccion) {
            System.out.println(x.toString());
        }

    }
}
