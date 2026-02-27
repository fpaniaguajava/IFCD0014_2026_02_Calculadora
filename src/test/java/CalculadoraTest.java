import static org.junit.jupiter.api.Assertions.*;

import com.cursogetafe.FernandoCalculadora;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

    @Test
    @DisplayName("Suma correcta de dos números positivos")
    void testSumar() {
        assertEquals(15, FernandoCalculadora.sumar(10, 5));
    }

    @Test
    @DisplayName("Resta correcta")
    void testRestar() {
        assertEquals(5, FernandoCalculadora.restar(10, 5));
    }

    @Test
    @DisplayName("Multiplicación correcta")
    void testMultiplicar() {
        assertEquals(50, FernandoCalculadora.multiplicar(10, 5));
    }

    @Test
    @DisplayName("División correcta")
    void testDividir() {
        assertEquals(2.0, FernandoCalculadora.dividir(10, 5));
    }

    @Test
    @DisplayName("División entre cero lanza excepción")
    void testDividirPorCero() {
        assertThrows(ArithmeticException.class, () -> {
            FernandoCalculadora.dividir(10, 0);
        });
    }
}