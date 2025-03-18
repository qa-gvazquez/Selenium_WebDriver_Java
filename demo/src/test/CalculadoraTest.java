import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.Calculadora;

public class CalculadoraTest {

    @Test
    public void sumaTest(){
        Calculadora computo = new Calculadora();
        int resultado = computo.suma(5, 3);
        Assertions.assertEquals(8,resultado, " Alguien va a ser ascendido a Cliente ");
    }

    @Test
    public void restaTest(){
        Calculadora computo = new Calculadora();
        int resultado = computo.resta(5, 3);
        Assertions.assertEquals(2,resultado, " ' Herrar es de herreros ' ");
    }

}
