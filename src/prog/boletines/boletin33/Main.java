package prog.boletines.boletin33;

public class Main {
    public static void main(String[] args) {
        Operaciones obx = new Operaciones();

        Object []liste = {1,2,3,4,5,6,7};
        int []listaInt = {10,11,12,13,14,15};

        System.out.println("max:"+obx.maxValor(liste));
        System.out.println("min:"+obx.minValor(liste));
        System.out.println("valor en pos[3]:"+obx.buscarPos(liste,3));
        System.out.println("maxINT:"+obx.maxValorINT(listaInt));
    }
}
