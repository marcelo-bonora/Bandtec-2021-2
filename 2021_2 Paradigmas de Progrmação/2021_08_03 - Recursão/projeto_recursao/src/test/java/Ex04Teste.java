import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Ex04Teste {

    @Test
    public void SeVetorLengthNegativo(){
        try{
            int[] v = {};
            Ex04.SomaNumerosParesVetorRecursivo(v, v.length - 1);
            assertTrue(false);
        }
        catch (IllegalArgumentException ex){
            assertEquals("Vetor vazio",
                    ex.getMessage());
        }
    }

    @Test
    public void SeVetorValoresImpares(){
        int[] v = {2, 4, 6};
        assertEquals(0,
                Ex04.SomaNumerosParesVetorRecursivo(v, v.length - 1));
    }

}
