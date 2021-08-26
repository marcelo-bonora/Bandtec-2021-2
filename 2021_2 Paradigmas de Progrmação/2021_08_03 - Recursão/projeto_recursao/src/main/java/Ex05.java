public class Ex05 {

    public static int ContarQtsOcorrenciaDeXIterativo(int[] v, int n){
        int result = 0;
        for (int i = 0; i <= v.length - 1; i++){
            if (v[i] == n){
                result++;
            }
        }
        return result;
    }

    public static int ContarQtsOcorrenciaDeXRecursiva(int[] v, int n, int indice){
        int result = 0;
        if (indice < 0){
            throw new IllegalArgumentException("Vetor vazio");
        } else if (indice == 0){
            if (v[indice] == n){
                result++;
                return result;
            } else {
                return result;
            }
        } else if (v[indice] == n){
            result++;
            return result + ContarQtsOcorrenciaDeXRecursiva(v, n, indice - 1);
        }
        else {
            return result + ContarQtsOcorrenciaDeXRecursiva(v, n, indice - 1);
        }
    }


    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 3};
        System.out.println("Iterativa");
        System.out.println(String.format("%d", ContarQtsOcorrenciaDeXIterativo(vetor, 3)));
        System.out.println("Recursivo");
        System.out.println(String.format("%d", ContarQtsOcorrenciaDeXRecursiva(vetor, 3, vetor.length - 1)));
    }
}
