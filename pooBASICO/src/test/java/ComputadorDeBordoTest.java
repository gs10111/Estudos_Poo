import junit.framework.TestCase;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;


//4.1. Principais Anotações do JUnit 5
//@Test: Marca um método como um método de teste.
//@BeforeEach: Método que será executado antes de cada teste.
//@AfterEach: Método que será executado após cada teste.
//@BeforeAll: Método executado antes de todos os testes (precisa ser static).
//@AfterAll: Método executado depois de todos os testes (precisa ser static).
//@Disabled: Para desativar temporariamente um teste.
///////////////////////
//assertEquals(expected, actual): Verifica se os valores são iguais.
//assertNotEquals(unexpected, actual): Verifica se os valores são diferentes.
//assertTrue(condition): Verifica se a condição é verdadeira.
//assertFalse(condition): Verifica se a condição é falsa.
//assertNull(object): Verifica se o objeto é null.
//assertNotNull(object): Verifica se o objeto não é null.
//assertThrows(exceptionClass, executable): Verifica se uma exceção específica é lançada.

public class ComputadorDeBordoTest extends TestCase {
    static ComputadorDeBordo computadorDeBordo = new ComputadorDeBordo();

    @Disabled
    public void testRegistarViagem() {

    }
    public void testEstimarGastos() {
        ComputadorDeBordo computadorDeBordo = new ComputadorDeBordo();
        computadorDeBordo.RegistarViagem(60);
        computadorDeBordo.RegistarViagem(60);
        computadorDeBordo.RegistarViagem(60);
        computadorDeBordo.RegistarViagem(60);
        computadorDeBordo.EstimarGastos(6);
        assertEquals(1440,computadorDeBordo.getGastoTotal(),0.01);
    }
    //consumo medio = 11.4
    public void testCalcularCombustivelConsumido() {

        ComputadorDeBordo computadorDeBordo = new ComputadorDeBordo();
        computadorDeBordo.RegistarViagem(60);
        computadorDeBordo.RegistarViagem(60);
        computadorDeBordo.RegistarViagem(60);
        computadorDeBordo.RegistarViagem(60.5);
        computadorDeBordo.EstimarGastos(6);
        computadorDeBordo.CalcularCombustivelConsumido();
        assertEquals(2741.7,computadorDeBordo.getLitrosCombustivelConsumido(),0.01);

    }
    @Disabled
    public void testTestToString() {
        // public double CalcularCombustivelConsumido(){
        //     return this.LitrosCombustivelConsumido = TotalQuilometrosRodados* ConsumoMedio;
        //    }

    }
}