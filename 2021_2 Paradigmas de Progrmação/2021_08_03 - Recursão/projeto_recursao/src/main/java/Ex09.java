import com.sun.org.apache.xpath.internal.objects.XString;
import sun.invoke.empty.Empty;

public class Ex09 {

    public static String binarioIterativo(int n){
        String binario = "";
        String binarioContrario = "";
        while(n != 0){
            binario += "" + n%2;
            n = n/2;
        }
        for(int i = binario.length(); i != 0; i--){
            binarioContrario += "" + binario.charAt(i-1);
        }
        return binarioContrario;
    }

    public static void main(String[] args) {
        System.out.println("Iterativo");
        System.out.println(binarioIterativo(12));
    }

}
