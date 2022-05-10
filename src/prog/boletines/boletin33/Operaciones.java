package prog.boletines.boletin33;

import java.util.*;
import java.lang.reflect.Array;

public class Operaciones <T>{

    public T maxValor(T [] lista){
        int max=(int)lista[0];
        int pos=0;
        for (int i = 0; i < lista.length; i++) {
            if ((int)lista[i]>max){
                pos=i;
                max=(int)lista[i];
            }
        }
        return lista[pos];
    }

    public T minValor(T [] lista){
        int min=(int)lista[0];
        int pos=0;
        for (int i = 0; i < lista.length; i++) {
            if ((int)lista[i]<min){
                pos=i;
                min=(int)lista[i];
            }
        }
        return lista[pos];
    }

    public int buscarPos(T [] lista,int buscar){

        for (int i = 0; i <lista.length; i++) {
            if ((int)lista[i]==buscar){
                return i;
            }
        }
        return -1;
    }

    public int maxValorINT(int [] lista){
        int max=(int)lista[0];
        int pos=0;
        for (int i = 0; i < lista.length; i++) {
            if ((int)lista[i]>max){
                pos=i;
            }
        }
        return lista[pos];
    }


    public Object borrarDelArray(ArrayList<T> lista, Object obx){
        Object obj;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i)==obx){
                obj=lista.get(i);
                lista.remove(i);
                return obj;
            }
        }
        return null;
    }
}
