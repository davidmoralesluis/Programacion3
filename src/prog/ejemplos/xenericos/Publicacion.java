package prog.ejemplos.xenericos;

public class Publicacion{

    private String nome;
    private float precio;

    public Publicacion() {
    }

    public Publicacion(String nome, float precio) {
        this.nome = nome;
        this.precio = precio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Publicacion{" + "nome='" + nome + '\'' + ", precio=" + precio + '}';
    }
}
