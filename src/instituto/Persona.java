package instituto;

import java.util.Set;

public class Persona {

    private String nombre;
    private String direccion;
    private int añoNacimiento;

    public Persona(String nombre, String direccion, int añoNacimiento) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.añoNacimiento = añoNacimiento;
    }
    
    @Override
    public String toString(){
        return "NOMBRE: " + this.nombre + " - DIRECCIÓN: " + this.direccion
                + " - AÑO NACIMIENTO: " + this.añoNacimiento;
    }

    
}
