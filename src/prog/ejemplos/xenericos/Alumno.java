package prog.ejemplos.xenericos;

public class Alumno {

    String nome;
    int edade;

    public Alumno(String nome, int edade) {
        this.nome = nome;
        this.edade = edade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEdade() {
        return edade;
    }

    public void setEdade(int edade) {
        this.edade = edade;
    }

    @Override
    public String toString() {
        return "Alumno{" +"nome='" + nome + '\'' + ", edade=" + edade + '}';
    }
}
