public class Profe extends Persona{
    private String materia;

    public Profe(String nombre, int edad, String materia) {
        super(nombre, edad);
        this.materia = materia;
    }
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
