package prog.ejemplos.xenericos;

public class Revista extends Publicacion{

    private String tematica;

    public Revista(String tematica) {
        this.tematica = tematica;
    }

    public Revista(String nome, float precio, String tematica) {
        super(nome, precio);
        this.tematica = tematica;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    @Override
    public String toString() {
        return "Revista{" + "tematica='" + tematica + '\'' + '}';
    }
}
