import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Escuela {
    private List<Curso> cursos = new ArrayList<>();
    private List<Profe> profes = new ArrayList<>();
    private HashMap<Curso, String> cronograma = new HashMap<>();

    public List<Curso> getCursos() {
        return cursos;
    }

    public void addCurso(Curso curso){
        cursos.add(curso);
    }

    public List<Profe> getProfes() {
        return profes;
    }

    public void addProfe(Profe profe){
        profes.add(profe);
    }

    public void asignarA(Profe profe, Curso curso){
        //TODO: refactorizar con excepciones
        if (!profes.contains(profe)){
            System.out.println("Este profe no existe en la escuela");
            return;
        }
        if (!cursos.contains(curso)){
            System.out.println("Este curso no existe en la escuela");
            return;
        }
        if(curso.getProfeTitular() != null){
            System.out.println(String.format("Advertencia, reemplazando al profe %s , por el/la profe %s",
                    curso.getProfeTitular().getNombre(), profe.getNombre()));
        }
        curso.setProfeTitular(profe);
        System.out.println("Profe asignad@ con exito!!!!");
    }

    public void inscribirA(Estudiante estudiante, Curso curso){
        if (!cursos.contains(curso)){
            System.out.println("Este curso no existe en la escuela");
            return;
        }
        curso.addEstudiante(estudiante);
    }

    public void asignarHorario(Curso curso, String horario){
        //n validaciones
        // curso existe ?
        // horario disponible ?
        if (!cursos.contains(curso)){
            System.out.println("Este curso no existe en la escuela");
            return;
        }
        cronograma.put(curso, horario);
    }


}
