package prog.boletines.boletin34;

public class Masajista extends SeleccionFutbol{

    private String titulacion;
    private int aniosExperencia;

    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperencia) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperencia = aniosExperencia;
    }

    public void darMasaje(){
        System.out.println("Masajista --> dando massaje");
    }

    @Override
    public void concentrarse() {
        System.out.println("masajista --> concentrando");
    }

    @Override
    public void viajar() {
        System.out.println("masajista --> viajando");
    }

    @Override
    public void entrenar() {
        System.out.println("masajista --> entrenado");
    }

    @Override
    public void jugarPartido() {
        System.out.println("masajista --> no juega partidos");
    }

    @Override
    public String toString() {
        return "Masajista{" +
                "titulacion='" + titulacion + '\'' +
                ", aniosExperencia=" + aniosExperencia +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                '}';
    }
}
