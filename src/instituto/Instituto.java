package instituto;

public class Instituto {

    public static void main(String[] args) {

        Asignatura a1 = new Asignatura("PRO-DAW", "PROGRAMACIÓN", 8);
        Asignatura a2 = new Asignatura("BD-DAW", "BASE DE DATOS", 5);
        Asignatura a3 = new Asignatura("LENG-DAW", "LENGUAJE DE MARCAS", 3);

        Alumno al1 = new Alumno("Daniel Alba Diaz", "C/ La paz", 1996);
        Alumno al2 = new Alumno("Javier Perez Ruiz", "C/ El conquistador", 1994);
        al2.asignarGrupo("ASIR1");

        Profesor pro1 = new Profesor("Pepe Garcia Sanchez", "Av. albufera", 1970, "Informática", 2000);
        Profesor pro2 = new Profesor("Laure Rodrigez Martin", "C/ Cid el Campeador",
                1982, "Comercio", 1997);

        pro1.imparte(a2);
        pro1.imparte(a3);

        pro2.imparte(a1);
        
        al1.matricular(a1);
        al1.matricular(a2);
        al1.matricular(a3);
        
        al2.matricular(a1);
        al2.matricular(a2);

        System.out.println("DATOS ALUMNOS");
        System.out.println(al1.toString());
        System.out.println(al2.toString());
        
        System.out.println();
        System.out.println("DATOS PROFESOR");
        System.out.println(pro1.toString());
        System.out.println(pro2.toString());
        
    }

}
