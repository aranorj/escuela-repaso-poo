import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Estudiante estudiante1 = new Estudiante("Juanita", 34, 8.93);
        Persona persona1 = new Persona("Marta", 23);

        estudiante1.imprimirSaludo("Buenas noches!!!");
        persona1.imprimirSaludo("Buenos dias!");

        Escuela escuela1 = new Escuela(2, 15);

        Estudiante[][] misGrupos = escuela1.getGrupos();

    }
}