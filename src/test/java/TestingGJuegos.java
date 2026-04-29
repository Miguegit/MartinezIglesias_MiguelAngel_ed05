import org.example.GestorJuegos;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestingGJuegos {


 public void caso01todoValido;{


        @BeforeEach
        void setUp() {
            GestorJuegos  gestor = new GestorJuegos();
        }


        @Test
         void arraysDistintaLongitud() GestorJuegos gestor = null;
        {
            int res = gestor.registrarLoteJuegos(
                    new String[]{"ABC123"},
                    new int[]{1, 2}
            );
            assertEquals(-1, res);
        }


        @Test
        void arrayVacio() {
            int res = gestor.registrarLoteJuegos(
                    new String[]{},
                    new int[]{}
            );
            assertEquals(-1, res);
        }


        @Test
        void cantidadNegativa() {
            int res = gestor.registrarLoteJuegos(
                    new String[]{"ABC123"},
                    new int[]{-5}
            );
            assertEquals(-2, res);
        }


        @Test
        void superaStockMaximo() {
            gestor.registrarLoteJuegos(
                    new String[]{"ABC123"},
                    new int[]{190}
            );
            int res = gestor.registrarLoteJuegos(
                    new String[]{"ABC124"},
                    new int[]{20}
            );
            assertEquals(-3, res);
        }


        @Test
        void insercionNueva() {
            int res = gestor.registrarLoteJuegos(
                    new String[]{"ABC123", "ABC124"},
                    new int[]{2, 3}
            );
            assertEquals(5, res);
        }


        @Test
        void actualizaExistente() {
            gestor.registrarLoteJuegos(
                    new String[]{"ABC123"},
                    new int[]{5}
            );
            assertEquals(3, res);
        }
    }
}


