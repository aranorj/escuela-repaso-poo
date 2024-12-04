public class Profe extends Persona{
    private String materia;

    public Profe(String nombre, int edad) {
        super(nombre, edad);
    }
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
