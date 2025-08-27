 public class Main {

    public static void main(String[] args) {
        ListaEnc minhaLista = new ListaEnc();


        System.out.println("-> Adicionando Elemento B na posição 0...");
        minhaLista.adicionarPorPosicao("Elemento B", 0);
        minhaLista.adicionarPorPosicao("Elemento C", 1);
        minhaLista.adicionarPorPosicao("Elemento A", 0);
        minhaLista.adicionarPorPosicao("Elemento D", 3);
       
        System.out.println("\nEstado atual da lista:");
        minhaLista.imprimirLista();
       
        System.out.println("\n--- Removendo o elemento na posição 1 ---");
        minhaLista.removerPorPosicao(1);
       
        System.out.println("Lista após a remoção:");
        minhaLista.imprimirLista();
       
        System.out.println("\n--- Tentando remover uma posição inválida (10) ---");
        minhaLista.removerPorPosicao(10);
    }
}




