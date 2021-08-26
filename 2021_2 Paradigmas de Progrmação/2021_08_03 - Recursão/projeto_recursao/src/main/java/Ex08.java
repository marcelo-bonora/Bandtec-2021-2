public class Ex08 {

    public static int somaDigitosIterativo(int n){
        int soma = 0;
        while (n != 0){
            soma += n % 10;
            n = n /10;
        }
        return soma;
    }

    public static int somaDigitosRecursivo(int n){
        return n == 0 ? n : (n % 10) + somaDigitosRecursivo(n/10);
    }

    public static void main(String[] args) {
        System.out.println("Iterativo");
        System.out.println(String.format("%d", somaDigitosIterativo(60)));
        System.out.println("Recursivo");
        System.out.println(String.format("%d", somaDigitosRecursivo(60)));
    }
}