package instituto;

import java.util.HashSet;
import java.util.Set;

public class Alumno extends Persona {

    private String grupo = "sin grupo";
    Set<Asignatura> listaAsignaturas = new HashSet<>();

    public Alumno(String nombre, String direccion, int añoNacimiento) {
        super(nombre, direccion, añoNacimiento);
    }

    public boolean asignarGrupo(String grupo) {
        boolean operacion = false;

        if (grupo != null) {
            this.grupo = grupo;
            operacion = true;
        } else if (!grupo.isEmpty()) {
            this.grupo = grupo;
            operacion = true;
        }
        return operacion;
    }

    public boolean matricular(Asignatura asig) {
        boolean operacion = false;
        
        if (!this.listaAsignaturas.contains(asig)) {
            this.listaAsignaturas.add(asig);
            operacion = true;
        }

        return operacion;
    }

    @Override
    public String toString() {
        return super.toString() + " - GRUPO: "
                + this.grupo;
    }

}
