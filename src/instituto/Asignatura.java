package instituto;

public class Asignatura {

    protected String codigo;
    protected String nombre;
    protected Integer horas;

    public Asignatura(String codigo, String nombre, int horas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.horas = horas;
    }

    @Override
    public String toString() {
        
        return this.codigo.toUpperCase();

    }

}
