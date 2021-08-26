import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Ex02Teste {

    @Test
    public void SeVetorLengthNegativo(){
        try{
            int[] v = {};
            Ex02.SomaNumerosVetorRecursiva(v, v.length - 1);
            assertTrue(false);
        }
        catch (IllegalArgumentException ex){
            assertEquals("Vetor vazio",
                    ex.getMessage());
        }
    }

    @Test
    public void SeVetorLengthUmValor(){
        int[] v = {10};
        assertEquals(v[v.length - 1],
                Ex02.SomaNumerosVetorRecursiva(v, v.length - 1));
    }

}
