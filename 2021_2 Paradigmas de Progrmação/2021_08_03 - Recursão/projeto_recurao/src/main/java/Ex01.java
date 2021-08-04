public class Ex01 {

    public static void somaNumerosIterativa(int n){
            int result = 0;
            for (int i = 0 ; i <= n; i++){
                result = result + i;
            }
        System.out.println(result);
    }

    public static void main(String[] args) {
        somaNumerosIterativa(5);
    }

}
