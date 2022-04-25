package prog.boletines.boletin32;

public class Deportivo extends Barco{

    float potencia;

    public Deportivo(String matricula, float eslora, float potencia) {
        super(matricula, eslora);
        this.potencia = potencia;
    }


    public float calcularPrecio(int dias){
        return ((2*this.potencia+(10*eslora))*dias);
    }
}
