import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;



public class CirculoTest {



    @Test
    public void CalcularPerimetro() {
        Circulo circulo = new Circulo(8);
        assertEquals(25.12, circulo.calcularPerimetro(), 0.01);
    }
    @Test
    public void CalcularPerimetroErrado() {
        Circulo circulo = new Circulo(8);
        assertNotEquals(25.22, circulo.calcularPerimetro(), 0.01);
    }

}
