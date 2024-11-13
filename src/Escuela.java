public class Escuela {
    /*grupo 0 {"Marta, edad, promedio, matricula", "Juan", "Roberto"},
     grupo 1 {"Elias", "Pedro", "Julieta"},
     grupo 2 {"Debora", "Carla", "Matias"}
     */
    private Estudiante[][] grupos;
    private Profe[] profes;

    public Escuela(int cantidadDeGrupos, int cupoPorGrupo){
        this.grupos = new Estudiante[cantidadDeGrupos][cupoPorGrupo];
        this.profes = new Profe[cantidadDeGrupos];
    }

    public Estudiante[][] getGrupos() {
        return grupos;
    }

    public void setGrupos(Estudiante[][] grupos) {
        this.grupos = grupos;
    }

    public Profe[] getProfes() {
        return profes;
    }

    public void setProfes(Profe[] profes) {
        this.profes = profes;
    }

    public void asignarA(Profe profe, int grupo){
        if(grupo >= 0 && grupo < profes.length){
            profes[grupo] = profe;
        }
    }

     //TODO: Como agrego un estudiante a un grupo ?


}
