import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ExemploRecursaoTeste {

    @Test
    public void SeNZeroEntaoRetornaUm(){
        assertEquals(
                1,
                ExemploRecursao.fatorial(0)
        );
    }

    @Test
    public void SeNNegativoEntaoExecao(){
        try{
            ExemploRecursao.fatorial(-1);
            assertTrue(false);
        }
        catch (IllegalArgumentException ex){
            assertEquals("N não pode ser negativo",
                    ex.getMessage());
        }
    }

    @Test
    public void SeNPositivoDoisEntaoDois(){
        assertEquals(2,
                ExemploRecursao.fatorial(2));
    }

    @Test
    public void SeNPositivoCincoEntoRetornaCentoVinte(){
        assertEquals(120,
                ExemploRecursao.fatorial(5));
    }
}
