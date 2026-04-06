import org.junit.Test;
import java.util.PriorityQueue;
import static org.junit.Assert.*;

public class ColaTest {

    @Test
    public void testAgregarPaciente() {
        PriorityQueue<Paciente> cola = new PriorityQueue<>();

        cola.add(new Paciente("Juan", "fractura", "C"));

        assertFalse(cola.isEmpty());
    }

    @Test
    public void testEliminarPaciente() {
        PriorityQueue<Paciente> cola = new PriorityQueue<>();

        cola.add(new Paciente("Maria", "apendicitis", "A"));

        Paciente atendido = cola.poll();

        assertEquals("Maria, apendicitis, A", atendido.toString());
        assertTrue(cola.isEmpty());
    }
}