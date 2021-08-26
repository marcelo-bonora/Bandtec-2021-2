public class Ex01 {

    public static void somaNumerosIterativa(int n){
            int result = 0;
            for (int i = 0 ; i <= n; i++){
                result = result + i;
            }
        System.out.println(result);
    }

    public static int somaNumerosRecursiva(int n){
        if (n < 0){
            throw new IllegalArgumentException("N não pode ser negativo");
        } else if (n == 0){
            return 0;
        }
        return  n + somaNumerosRecursiva(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Soma Interativa");
        somaNumerosIterativa(5);
        System.out.println("Soma Recursiva");
        System.out.println(String.format("%d",somaNumerosRecursiva(6)));
    }

}
