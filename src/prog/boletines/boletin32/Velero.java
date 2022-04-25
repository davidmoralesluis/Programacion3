package prog.boletines.boletin32;

public class Velero extends Barco{

     int nMastiles=0;


    public Velero(String matricula, float eslora, int nMastiles) {
        super(matricula, eslora);
        this.nMastiles = nMastiles;
    }

    public float calcularPrecio(int dias){
        return (((8*this.nMastiles)+(10*this.eslora))*dias);
    }
}
