package prog.boletines.boletin34;

public class Entrenador extends SeleccionFutbol{

    private int idFederacion;

    public Entrenador(int id, String nombre, String apellidos, int edad, int idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public void planificarEntrenamiento(){
        System.out.println("Entrenador --> planificando");
    }

    @Override
    public void concentrarse() {
        System.out.println("Entrenador --> concentrando");
    }

    @Override
    public void viajar() {
        System.out.println("Entrenador --> viajando");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrenador --> entrenando");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Entrenador --> no juega");
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "idFederacion=" + idFederacion +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                '}';
    }
}
