package prog.boletines.boletin34;

public abstract class SeleccionFutbol implements IntegranteSeleccionFutbol{

    public int id;
    public String nombre;
    public String apellidos;
    public int edad;

    public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return
                "id=" + id + ", nombre='" + nombre + '\'' + ", apellidos='" + apellidos + '\'' + ", edad=" + edad;
    }
}
