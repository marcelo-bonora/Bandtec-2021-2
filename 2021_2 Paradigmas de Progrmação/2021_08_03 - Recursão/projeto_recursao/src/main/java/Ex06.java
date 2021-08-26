public class Ex06 {

    public static int AlgoritmoEuclidesIterativa(int num1, int num2){
        while(num2 != 0){
            int divisorComum = num1 % num2;
            num1 = num2;
            num2 = divisorComum;
        }
        return num1;
    }

    public static int AlgoritmoEuclidesRecursivo(int num1, int num2){
        return num2 == 0 ? num1 : AlgoritmoEuclidesRecursivo(num2, num1 % num2);
    }

    public static void main(String[] args) {
        System.out.println("Iterativo");
        System.out.println(String.format("%d", AlgoritmoEuclidesIterativa(10, 2)));
        System.out.println("Recursivo");
        System.out.println(String.format("%d", AlgoritmoEuclidesRecursivo(10, 1)));
    }
}
