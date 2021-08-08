public class ExemploRecursao {

    /* Método contagemRegressivaIterativa - recebe um número inteiro n
       e exibe a contagem regressiva de n a zero.
       Resolução iterativa (usa uma estrutura de loop)
     */
    public static void contagemRegressivaIterativa(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
    }

    /* Método contagemRegressivaRecursiva - recebe um número inteiro n
       e exibe a contagem regressiva de n a zero.
       Resolução recursiva (NÂO usa uma estrutura de loop)
       Usa chamadas sucessivas ao próprio método para implementar o loop
     */
    public static void contagemRegressivaRecursiva(int n) {
        if (n == 0) {               // Testa se chegou ao caso básico, qdo pára de chamar a si próprio
            System.out.println(n);
            System.out.println("n= " + n);
        }
        else {                      // Ainda não é o caso básico
            System.out.println(n);  // Printa o valor de n

            contagemRegressivaRecursiva(n-1);  // chamada recursiva para exibir a contagem regressiva
                                                  // de (n-1)
            System.out.println("n= " + n);
        }
    }


    // Definição de fatorial - a própria definição matemática é recursiva
    // 0! = 1
    // n! = n * (n-1)!   , qdo n > 0

    // 0! = 1
    // 1! = 1 * 0! = 1 * 1 = 1
    // 2! = 2 * 1! = 2 * 1 = 2
    // 3! = 3 * 2! = 3 * 2 * 1! = 3 * 2 * 1 * 0! = 3 * 2 * 1 * 1 = 6

    // fatorial(4)
    // n = 4
    // ret 4 * fatorial(3)
    //         n = 3
    //         ret 3 * fatorial(2)
    //                 n = 2
    //                 ret 2 * fatorial(1)
    //                         n = 1
    //                         ret 1 * fatorial(0)
    //                                 n = 0
    //                                 ret 1
    //                         ret 1 * 1 = 1
    //                 ret 2 * 1 = 2
    //         ret 3 * 2 = 6
    // ret 4 * 6 = 24
    public static int fatorialRecursivo(int n) {
        if (n == 0) {           // Se n é zero
            return 1;           // então fatorial de 0 = 1
        }
        else {                  // senão fatorial de n = n * (n-1)!
            return n * fatorialRecursivo(n-1);
        }
    }

    public static int fatorialRecursivoComPrint(int n) {
        if (n == 0) {
            System.out.println("0!= 1");
            return 1;
        }
        else {
            int resultado = n * fatorialRecursivoComPrint(n-1);
            System.out.println(n + "!= " + resultado);
            return resultado;
        }
    }

    // Método Fatorial iterativo
    public static int fatorialIterativo(int n) {
        int resultado = 1;
        for (int i = n; i > 0; i--) {
            resultado *= i;
        }
        return resultado;
    }


    /* Método potencia - recebe 2 inteiros: base e expoente
       Calcula e retorna base elevado a expoente
       Definição matemática de potência:
           base elevado a zero = 1   (expoente é zero)
           base elevado a expoente = base * base elevado a expoente-1
     */
    public static int potencia(int base, int expoente) {
        if (expoente == 0) {        // Se expoente é zero
            return 1;               // então base elevado a expoente é 1
        }
        else {                      // senão base elevado a expoente = base * base elevado a expoente - 1
            return base * potencia(base, expoente-1);
        }

    }

    /* Método exibeVetor recursivo - recebe um vetor e o índice inicial do vetor
       Exibe o vetor no sentido normal (do índice zero ao final do vetor)
     */
    public static void exibeVetor(int[] v, int indice) {
        if (indice < v.length) {                // Se índice é menor do que o tamanho do vetor
            System.out.print(v[indice] + "\t"); // então exibe elemento do vetor que está no índice
            exibeVetor(v, indice+1);      //    e chama recursivamente para exibir do índice seguinte em diante
        }
    }

    /* Método exibeVetorInvertio recursivo - recebe um vetor e o índice final do vetor
       Exibe o vetor no sentido inverso (do índice final ao início do vetor)
     */
    public static void exibeVetorInvertido(int[] v, int indice) {
        if (indice >= 0) {                          // Se índice é maior ou igual a zero (ainda não acabou o vetor)
            System.out.print(v[indice] + "\t");     // então exibe elemento do vetor que está no índice
            exibeVetorInvertido(v, indice-1);   //  e chama recursivamente para exibir do índice anterior em diante
        }
    }


    public static void main(String[] args) {

        int[] vetor = {10, 20, 30, 40, 50, 60, 70 };

//        for (int indice = 0; indice < vetor.length; indice++) {
//            System.out.println(vetor[indice]);
//        }

        System.out.println("Contagem regressiva iterativa:");
        contagemRegressivaIterativa(5);

        System.out.println("\nContagem regressiva recursiva:");
        contagemRegressivaRecursiva(5);

        System.out.println("\nFatorial de 4= " + fatorialRecursivo(4));
        System.out.println("\nFatorial de 5= " + fatorialRecursivo(5));

        System.out.println("\nFatorial de 4= " + fatorialIterativo(4));
        System.out.println("\nFatorial de 5= " + fatorialIterativo(5));

        System.out.println("\n3 elevado a 4= " + potencia(3,4));
        System.out.println("\n2 elevado a 10= " + potencia(2, 10));

        System.out.println("\nFatorial de 4= " + fatorialRecursivoComPrint(4));

        System.out.println("\nExibição do vetor:");
        exibeVetor(vetor, 0);
        System.out.println();

        System.out.println("\nExibição invertida do vetor:");
        exibeVetorInvertido(vetor, vetor.length-1);
        System.out.println();
    }




}
