public class Teste {

    public static void main(String[] args) {
        DuasPilhas duasPilhas = new DuasPilhas(5);

        System.out.println("isFull: "+duasPilhas.isFull());
        System.out.println("isEmpty pilha 01: "+duasPilhas.isEmpty(1));
        System.out.println("isEmpty pilha 02: "+duasPilhas.isEmpty(2));


    }
}
