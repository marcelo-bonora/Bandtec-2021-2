public class Ex02 {

    public static int SomaNumerosVetorIterativa(int[] v){
        int result = 0;
        for (int i = 0; i <= v.length - 1; i++){
            result += v[i];
        }
        return result;
    }

    public static int SomaNumerosVetorRecursiva(int[] v, int indice){
        if (indice < 0){
            throw new IllegalArgumentException("Vetor vazio");
        } else if (indice == 0){
            return v[indice];
        }
        return v[indice] + SomaNumerosVetorRecursiva(v, indice - 1);
    }

    public static void main(String[] args) {
        int[] vetor = {10, 20 , 30, 40, 50};

        System.out.println("Soma de valore de vetor de formar iterativa");
        System.out.println(String.format("%d",  SomaNumerosVetorIterativa(vetor)));

        System.out.println("Soma de valore de vetor de formar recursiva");
        System.out.println(String.format("%d", SomaNumerosVetorRecursiva(vetor, vetor.length-1)));
    }
}
