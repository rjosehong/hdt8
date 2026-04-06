import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class ProcesoJCF {

    public static void main(String[] args) {

        List<Paciente> listaOriginal = new ArrayList<>();

        Queue<Paciente> cola = new PriorityQueue<>();

        try {
            List<String> lineas = Files.readAllLines(Paths.get("pacientes.txt"));

            for (String linea : lineas) {
                String[] partes = linea.split(",");

                String nombre = partes[0].trim();
                String diagnostico = partes[1].trim();
                String prioridad = partes[2].trim();

                Paciente p = new Paciente(nombre, diagnostico, prioridad);

                listaOriginal.add(p);
                cola.offer(p);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Lista sin ordenar:");
        for (Paciente p : listaOriginal) {
            System.out.println(p);
        }

        System.out.println("\nOrden de atención:");
        while (!cola.isEmpty()) {
            System.out.println(cola.poll());
        }
    }
}