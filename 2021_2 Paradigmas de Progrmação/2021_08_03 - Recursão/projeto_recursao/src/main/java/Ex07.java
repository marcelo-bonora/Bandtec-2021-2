public class Ex07 {

    public static int RetorneMaiorValorVetorIterativo(int[] v){
        int maiorValor = 0;
        for(int i = 0; i < v.length; i++){
            if (v[i] > maiorValor){
                maiorValor = v[i];
            }
        }
        return maiorValor;
    }

    public static int RetorneMaiorValorVetorRecursivo(int[] v, int i){
        if(i == 1){
            return v[0];
        } else {
            int x;
            x = RetorneMaiorValorVetorRecursivo(v, i-1);
            if(x > v[i-1]){
                return x;
            } else {
                return v[i-1];
            }
        }
    }

    public static void main(String[] args) {
        int[] vetor = {1, 2872, 1009, 4956, 838};
        System.out.println("Iterativo");
        System.out.println(String.format("%d", RetorneMaiorValorVetorIterativo(vetor)));
        System.out.println("Recursivo");
        System.out.println(String.format("%d", RetorneMaiorValorVetorRecursivo(vetor, vetor.length)));
    }
}
