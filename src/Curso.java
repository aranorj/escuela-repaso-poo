import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String asignatura;
    private List<Estudiante> estudiantesInscriptos = new ArrayList<>();
    private Profe profeTitular;
    private int cupo;

    public Curso(String asignatura, int cupo) {
        this.asignatura = asignatura;
        this.cupo = cupo;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void addEstudiante(Estudiante estudiante) {
        //TODO: refactorizar cuando incorporemos excepciones
        if(estudiantesInscriptos.size() >= cupo ) {
            System.out.println("El cupo esta completo no podemos recibir mas estudiantes");
            return;
        }
        this.estudiantesInscriptos.add(estudiante);
        estudiante.addCursoAsiste(this);
    }

    public List<Estudiante> getEstudiantesInscriptos() {
        return this.estudiantesInscriptos;
    }

    public Profe getProfeTitular(){
        return this.profeTitular;
    }

    public void setProfeTitular(Profe profeTitular) {
        this.profeTitular = profeTitular;
    }
}
