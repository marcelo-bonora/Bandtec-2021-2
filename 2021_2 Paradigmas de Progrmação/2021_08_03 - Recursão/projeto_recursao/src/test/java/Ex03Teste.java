import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Ex03Teste {

    @Test
    public void SeVetorLengthNegativo(){
        try{
            int[] v = {};
            Ex03.SomaNumerosParesVetorRecursivo(v, v.length - 1);
            assertTrue(false);
        }
        catch (IllegalArgumentException ex){
            assertEquals("Vetor vazio",
                    ex.getMessage());
        }
    }

    @Test
    public void SeVetorValoresImpares(){
        int[] v = {1, 3, 5};
        assertEquals(0,
                Ex03.SomaNumerosParesVetorRecursivo(v, v.length - 1));
    }

}
