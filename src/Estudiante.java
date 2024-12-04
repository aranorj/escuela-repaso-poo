import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Estudiante extends Persona{

    List<Curso> cursosALosQueAsiste = new ArrayList<>();
    String matricula;

    public Estudiante(String nombre, int edad){
        super(nombre, edad);
        this.matricula = UUID.randomUUID().toString();
    }

    @Override
    public void imprimirSaludo(String saludo){
        System.out.println(String.format("%s Soy un estudiante!", saludo));
    }

    public List<Curso> getCursosALosQueAsiste() {
        return cursosALosQueAsiste;
    }

    public void addCursoAsiste(Curso curso){
        cursosALosQueAsiste.add(curso);
    }
}
