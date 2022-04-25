package prog.boletines.boletin32;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Barco> RentBoat=new ArrayList<>();

        Barco Laura = new Velero("lauraEs",15,5);
        Barco Luis = new Deportivo("deporNO",5,1000);
        Barco Nina = new Yate("Yatevale",7,500,3);

        RentBoat.add(Laura);
        RentBoat.add(Luis);
        RentBoat.add(Nina);

        for (Barco boat:RentBoat) {
            System.out.println(boat.getClass()+ " " + boat.calcularPrecio(5)+ " €");
        }
    }
}
