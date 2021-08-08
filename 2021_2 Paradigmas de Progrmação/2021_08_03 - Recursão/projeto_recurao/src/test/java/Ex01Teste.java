import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Ex01Teste {
    
    @Test
    public void SeNNegativoEntaoExecao(){
        try{
            Ex01.somaNumerosRecursiva(-1);
            assertTrue(false);
        }
        catch (IllegalArgumentException ex){
            assertEquals("N não pode ser negativo",
                    ex.getMessage());
        }
    }

    @Test
    public void SeNZeroEntaoZer(){
        assertEquals(0,
                Ex01.somaNumerosRecursiva(0));
    }

    @Test
    public void SeNDoisEntaoTres(){
        assertEquals(3,
                Ex01.somaNumerosRecursiva(2));
    }
    
}
