package prog.ejemplos.xenericos;

public class Periodico extends Publicacion{

    private int numPaxinas;

    public Periodico(int numPaxinas) {
        this.numPaxinas = numPaxinas;
    }

    public Periodico(String nome, float precio, int numPaxinas) {
        super(nome, precio);
        this.numPaxinas = numPaxinas;
    }

    public int getNumPaxinas() {
        return numPaxinas;
    }

    public void setNumPaxinas(int numPaxinas) {
        this.numPaxinas = numPaxinas;
    }

    @Override
    public String toString() {
        return "Periodico{" + "numPaxinas=" + numPaxinas + '}';
    }
}
