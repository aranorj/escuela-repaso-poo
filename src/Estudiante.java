import java.util.UUID;

public class Estudiante extends Persona{
    private double promedio;
    private String matricula;

    public Estudiante(String nombre, int edad, double promedio){
        super(nombre, edad);
        this.promedio = promedio;
        this.matricula = UUID.randomUUID().toString();
    }

    @Override
    public void imprimirSaludo(String saludo){
        System.out.println(String.format("%s Soy un estudiante!", saludo));
    }

    public double getPromedio(){
        return promedio;
    }

    public void setPromedio(double promedio){
        this.promedio = promedio;
    }

    public String getMatricula(){
        return matricula;
    }

}
