package instituto;

import java.util.HashSet;
import java.util.Set;

public class Profesor extends Persona {

    private String departamento;
    private int añoIncorporacion;
    Set<Asignatura> listaAsignaturas = new HashSet<>();

    public Profesor(String nombre, String direccion, int añoNacimiento, String depart, int año) {
        super(nombre, direccion, añoNacimiento);
        this.departamento = depart;
        this.añoIncorporacion = año;
    }

    public boolean imparte(Asignatura asig) {
        boolean operacion = false;

        if (!this.listaAsignaturas.contains(asig)) {
            this.listaAsignaturas.add(asig);
            operacion = true;
        }

        return operacion;
    }

    @Override
    public String toString() {
        return super.toString() + " - DEPARTAMENTO: "
                + this.departamento;
    }

}
