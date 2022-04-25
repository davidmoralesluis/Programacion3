package prog.ejemplos.xenericos;

public class Main {

    public static void main(String[] args) {

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




    }
}
