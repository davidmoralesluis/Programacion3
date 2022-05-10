package prog.boletines.boletin34;

public class Futbolista extends SeleccionFutbol{

    private int dorsal;
    private String demarcacion;

    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public void entrevista(){
        System.out.println("Fubolista --> entrevistando");
    }

    @Override
    public void concentrarse() {
        System.out.println("Fubolista --> concentrando");
    }

    @Override
    public void viajar() {
        System.out.println("Fubolista --> viajando");
    }

    @Override
    public void entrenar() {
        System.out.println("Fubolista --> entrenar");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Fubolista --> jugando");
    }

    @Override
    public String toString() {
        return "Futbolista{" +
                "dorsal=" + dorsal +
                ", demarcacion='" + demarcacion + '\'' +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                '}';
    }
}
