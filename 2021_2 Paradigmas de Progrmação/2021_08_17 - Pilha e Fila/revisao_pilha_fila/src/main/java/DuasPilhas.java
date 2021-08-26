public class DuasPilhas {

    public int[] v;
    public int topo1;
    public int topo2;

    public DuasPilhas(int capacidade) {
        topo1 = -1;
        topo2 = capacidade - 1;
        v = new int[capacidade];
    }

    public boolean isFull(){
        return topo1 + topo2 == v.length;
    }

    public boolean isEmpty(int pilha){
        if (pilha == 1){
            return topo1 == -1;
        } else {
            return topo2 == v.length - 1;
        }
    }

    public void push(int pilha, int info){
        if (isFull()){
            System.out.println("A pilha esta cheia");
        } else  {
            if (pilha == 1){
                v[topo1++] = info;
            } else {
                v[topo2--] = info;
            }
        }
    }

    public int pop(int pilha){
        if (isEmpty(pilha)){
            System.out.println("A pilha está vazia");
        } else {
            if (pilha == 1){
                return v[topo1--];
            } else {
                return v[topo2--];
            }
        }
        return 0;
    }

}
