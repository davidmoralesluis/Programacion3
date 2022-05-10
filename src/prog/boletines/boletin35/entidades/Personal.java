package prog.boletines.boletin35.entidades;

import java.util.GregorianCalendar;

public abstract class Personal {

    private String dni;
    private String nome;
    private String apellidos;
    private GregorianCalendar data;

    public Personal(String dni, String nome, String apellidos, GregorianCalendar data) {
        this.dni = dni;
        this.nome = nome;
        this.apellidos = apellidos;
        this.data = data;
    }
}
