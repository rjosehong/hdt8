import org.junit.Test;
import java.util.PriorityQueue;
import static org.junit.Assert.*;

public class PriorityQueueTest {

    @Test
    public void testOrdenPrioridad() {

        PriorityQueue<Paciente> cola = new PriorityQueue<>();

        cola.add(new Paciente("Juan", "fractura", "C"));
        cola.add(new Paciente("Maria", "apendicitis", "A"));
        cola.add(new Paciente("Carmen", "parto", "B"));

        assertEquals("Maria, apendicitis, A", cola.poll().toString());

        assertEquals("Carmen, parto, B", cola.poll().toString());

        assertEquals("Juan, fractura, C", cola.poll().toString());
    }
}