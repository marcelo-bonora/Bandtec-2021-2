import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Ex05Teste {

    @Test
    public void SeVetorLengthNegativo(){
        try{
            int[] v = {};
            Ex05.ContarQtsOcorrenciaDeXRecursiva(v, 5,v.length - 1);
            assertTrue(false);
        }
        catch (IllegalArgumentException ex){
            assertEquals("Vetor vazio",
                    ex.getMessage());
        }
    }
}


