import java.util.ArrayList;

public class Main {
    //TODO: optimizar
    public static void main(String[] args){
        //Si mi sistema pasa a ser de una sola escuela
        //TODO: refactor escuela singleton
        Escuela escuelaProgramacion = new Escuela();
        Curso java = new Curso("Programacion backend con Java", 20);
        ArrayList<Curso> misCursosProgramacion = new ArrayList<>(){{
            add(new Curso("Programación Frontend con React", 15));
            add(java);
            add(new Curso("Testing basico con Insomnia", 30));
        }};

        Curso peluqueria = new Curso("Colorimetría", 20);

        misCursosProgramacion.forEach(curso -> escuelaProgramacion.addCurso(curso));

        Profe pedro = new Profe("Pedrito", 22 );
        ArrayList<Profe> profeProgramacion = new ArrayList<>(){{
            add(pedro);
            add(new Profe("Marta", 23));
            add(new Profe("Carlos", 54));
        }};

        profeProgramacion.forEach(profe -> escuelaProgramacion.addProfe(profe));


        //Quiero asignar a pedrito al curso de java
        escuelaProgramacion.asignarA(pedro, java);

        Profe mirta = new Profe("Mirta", 45);
        escuelaProgramacion.asignarA(mirta, java);



    }
}