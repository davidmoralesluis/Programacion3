package prog.ejemplos.xenericos;

public class FaroDeVigo extends Periodico{

    private String seccion;

    public FaroDeVigo(int numPaxinas, String seccion) {
        super(numPaxinas);
        this.seccion = seccion;
    }

    public FaroDeVigo(String nome, float precio, int numPaxinas, String seccion) {
        super(nome, precio, numPaxinas);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }


}
