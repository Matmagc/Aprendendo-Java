package Encadeadas;

public class Main {

    public static void main(String[] args) {

        ListaEncadeada<String> minhListaEncadeada = new ListaEncadeada<>();

        minhListaEncadeada.add("teste 1");
        minhListaEncadeada.add("teste 2");
        minhListaEncadeada.add("teste 3");
        minhListaEncadeada.add("teste 4");  
        
        System.out.println(minhListaEncadeada.get(0));
        System.out.println(minhListaEncadeada.get(1));
        System.out.println(minhListaEncadeada.get(2));
        System.out.println(minhListaEncadeada.get(3));

        System.out.println(minhListaEncadeada);

        System.out.println(minhListaEncadeada.remove(3));

        System.out.println(minhListaEncadeada);


    }
    
}
