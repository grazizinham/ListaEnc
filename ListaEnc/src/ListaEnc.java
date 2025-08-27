public class ListaEnc {

    Pacote cabeca;

    public ListaEnc() {
        this.cabeca = null;
    }

    public void adicionarPorPosicao(String dado, int posicao) {
        if (posicao < 0) {
            System.out.println("Erro: Posição inválida.");
            return;
        }

        Pacote novoNo = new Pacote(dado);
        if (posicao == 0) {
            novoNo.proximo = cabeca;
            cabeca = novoNo;
            return;
        }

        Pacote atual = cabeca;
        int contador = 0;
        while (atual != null && contador < posicao - 1) {
            atual = atual.proximo;
            contador++;
        }

        if (atual == null) {
            System.out.println("Erro: Posição fora dos limites da lista.");
            return;
        }

        novoNo.proximo = atual.proximo;
        atual.proximo = novoNo;
    }

    public void removerPorPosicao(int posicao) {
        if (cabeca == null) {
            System.out.println("A lista está vazia.");
            return;
        }

        if (posicao == 0) {
            cabeca = cabeca.proximo;
            return;
        }

        Pacote atual = cabeca;
        int contador = 0;
        while (atual != null && contador < posicao - 1) {
            atual = atual.proximo;
            contador++;
        }

        if (atual == null || atual.proximo == null) {
            System.out.println("Erro: Posição fora dos limites da lista.");
            return;
        }

        atual.proximo = atual.proximo.proximo;
    }

    public void imprimirLista() {
        Pacote temp = cabeca;
        while (temp != null) {
            System.out.print(temp.dado + " -> ");
            temp = temp.proximo;
        }
        System.out.println("null");
    }
}