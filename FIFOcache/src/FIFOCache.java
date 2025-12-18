public class FIFOCache {

    private int capacidade;
    private LinkedList cache;

    // o tamanho da sua linkedlist não pode passar de `capacidade`.
    public FIFOCache(int capacidade) {
        // TODO: implementar
    }

    public boolean isEmpty() {
        // TODO: implementar
        return false;
    }

    public boolean isFull() {
        // TODO: implementar
        return false;
    }

    // deve ser O(n)
    // retorna o próprio valor se encontrar ou null.
    // Caso não encontre, adicione o elemento no FINAL da fila
    // IMPORTANTE: no FIFO, acessar um elemento NÃO muda sua posição!
    public String get(String value) {
        // TODO: implementar
        return null;
    }

    // O(1)
    // Retorna o primeiro elemento (o mais antigo - próximo a ser removido)
    public String getFirst() {
        // TODO: implementar
        return null;
    }

    // O(1)
    public String getLast() {
        // TODO: implementar
        return null;
    }

    // deve retornar uma string representando a fila.
    public String toString() {
        return cache.toString();
    }

    public int size() {
        // TODO: implementar
        return 0;
    }
}
