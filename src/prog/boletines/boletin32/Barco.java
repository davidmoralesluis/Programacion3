package prog.boletines.boletin32;

public abstract class Barco {

     String matricula="";
     float eslora=0f;

     public Barco(String matricula, float eslora) {
          this.matricula = matricula;
          this.eslora = eslora;
     }

     public float calcularPrecio(int dias){
          return 0;
     }
}
