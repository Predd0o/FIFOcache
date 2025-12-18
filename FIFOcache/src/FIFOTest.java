import static org.junit.Assert.*;
import org.junit.Test;

public class FIFOTest {

    @Test
    public void testFIFOBasico() {
        FIFOEvictionStrategy fifo = new FIFOEvictionStrategy(3);
        assertNull(fifo.getNextEviction());
        assertEquals(0, fifo.size());

        assertEquals("miss", fifo.get("x"));
        // cache: [x]
        assertEquals("x", fifo.getNextEviction());
        assertEquals(1, fifo.size());

        assertEquals("hit", fifo.get("x"));
        assertEquals("hit", fifo.get("x"));
        // cache: [x] - acessar não muda posição no FIFO!
        assertEquals("x", fifo.getNextEviction());

        assertEquals("miss", fifo.get("y"));
        assertEquals("miss", fifo.get("z"));
        // cache: [x, y, z]
        assertEquals("x", fifo.getNextEviction()); // x é o mais antigo
        assertEquals(3, fifo.size());

        assertEquals("hit", fifo.get("y"));
        // cache: [x, y, z] - continua na mesma ordem
        assertEquals("x", fifo.getNextEviction());

        assertEquals("miss", fifo.get("w"));
        // cache: [y, z, w] - removeu x (mais antigo)
        assertEquals("y", fifo.getNextEviction());

        assertEquals("miss", fifo.get("a"));
        // cache: [z, w, a] - removeu y
        assertEquals("z", fifo.getNextEviction());

        assertEquals("hit", fifo.get("z"));
        assertEquals("hit", fifo.get("w"));
        assertEquals("hit", fifo.get("a"));
        // cache: [z, w, a] - ordem não muda com hits!
        assertEquals("z", fifo.getNextEviction());

        assertEquals("miss", fifo.get("b"));
        // cache: [w, a, b] - removeu z
        assertEquals("w", fifo.getNextEviction());
        assertEquals(3, fifo.size());
    }
}