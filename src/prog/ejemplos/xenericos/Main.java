package prog.ejemplos.xenericos;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /*
        ClaseXenerica <Integer> intObx = new ClaseXenerica<>(5);

        System.out.println(intObx.toString());

        ClaseXenerica <String> Obx = new ClaseXenerica<String>("5");

        System.out.println(Obx.toString());

        Alumno alu = new Alumno("Brais",25);

        ClaseXenerica <Alumno> ob = new ClaseXenerica<>(alu);
        System.out.println(ob);

        ClaseXenerica <Integer> obInteger = new ClaseXenerica<>();
        obInteger.setDato(8);
        System.out.println(obInteger.toString());

        System.out.println("--------------------------------------");
        */

        Metodos obM = new Metodos();
        ArrayList<Publicacion> lista = new ArrayList<>();

        lista.add(new Revista("aaa",5,"tema"));
        lista.add(new Revista("bbb",3,"cocina"));
        lista.add(new Revista("ccc",6,"coches"));
        lista.add(new Periodico("aaa2",5,22));
        lista.add(new Periodico("bbb2",3,55));
        Publicacion re = new Revista("programacion",9.99f,"Java");
        lista.add(re);
        obM.amosar2(lista);


        System.out.println("\n ------------------------------------------------\n");
        ArrayList<Integer> listaINT = new ArrayList<>();
        listaINT.add(1);
        listaINT.add(2);
        listaINT.add(3);
        obM.amosar(listaINT);


    }
}
