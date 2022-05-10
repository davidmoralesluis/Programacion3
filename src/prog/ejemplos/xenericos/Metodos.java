package prog.ejemplos.xenericos;

import java.util.ArrayList;

public class Metodos <T> {

    public void amosar(ArrayList <T> lista){
        for (T elemento:lista) {
            System.out.println(elemento);
        }
    }

    public void amosar2(ArrayList <? extends Publicacion> lista){
        for (Publicacion elemento:lista) {
            System.out.println(elemento);
        }
    }
}
