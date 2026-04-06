public class Paciente implements Comparable<Paciente> {
    private String nombre;
    private String diagnostico;
    private String prioridad;

    public Paciente(String nombre, String diagnostico, String prioridad){
        this.nombre = nombre;
        this.diagnostico = diagnostico;
        this.prioridad = prioridad;
    }

    public String getPrioridad() {
        return prioridad;
    }

    @Override
    public int compareTo(Paciente otro) {
        return this.prioridad.compareTo(otro.prioridad);
    }

    @Override
    public String toString() {
        return nombre + ", " + diagnostico + ", " + prioridad;
    }
}