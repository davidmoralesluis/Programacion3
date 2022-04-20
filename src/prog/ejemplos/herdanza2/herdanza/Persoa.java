package prog.ejemplos.herdanza2.herdanza;

public abstract class Persoa {

    private String nome;
    private int edade;

    public Persoa(){}

    public Persoa(String nome, int edade) {
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
        return "nome='" + nome + '\'' + ", edade=" + edade;
    }

    public abstract void amosar();
}
