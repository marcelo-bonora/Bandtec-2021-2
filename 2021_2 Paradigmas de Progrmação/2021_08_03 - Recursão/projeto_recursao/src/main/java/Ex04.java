public class Ex04 {

    public static int SomaNumerosParesVetorIterativo(int[] v){
        int result = 0;
        for (int i = 0; i <= v.length - 1; i++){
            if (v[i] % 2 != 0){
                result += v[i];
            }
        }
        return result;
    }

    public static int SomaNumerosParesVetorRecursivo(int[] v, int indice){
        if (indice < 0){
            throw new IllegalArgumentException("Vetor vazio");
        } else if (indice == 0){
            if (v[indice] % 2 != 0){
                return v[indice];
            } else {
                return 0;
            }
        }if (v[indice] % 2 != 0){
            return v[indice] + SomaNumerosParesVetorRecursivo(v, indice - 1);
        } else{
            return 0 + SomaNumerosParesVetorRecursivo(v, indice - 1);
        }
    }

    public static void main(String[] args) {
        int[] vetor = {1, 2 ,3, 4, 5, 6};
        System.out.println("Iterativo");
        System.out.println(String.format("%d", SomaNumerosParesVetorIterativo(vetor)));
        System.out.println("Recursivo");
        System.out.println(String.format("%d", SomaNumerosParesVetorRecursivo(vetor,vetor.length - 1)));
    }

}
