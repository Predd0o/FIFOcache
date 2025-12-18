Implemente a estratégia First In First Out (FIFO) de cache eviction. Nessa estratégia, quando o cache está cheio e um elemento precisa entrar, o elemento que entrou primeiro deve ser removido (o mais antigo). A ordem de entrada é mantida, independente de quantas vezes um elemento é acessado.
Funciona assim: Os elementos são organizados em ordem de chegada. Quando um novo elemento precisa entrar e o cache está cheio, o elemento que está há mais tempo no cache (o primeiro que entrou) deve ser removido. Importante: diferente do LFU, acessar um elemento que já está no cache NÃO altera sua posição - ele continua na mesma posição em que entrou.
Implementação
Implemente os métodos das classes FIFOEvictionStrategy, FIFOCache e LinkedList.
Importante: entenda os testes. Leia. Compreenda. Faça mais testes. Testes são uma excelente forma de especificação de como seu algoritmo deve funcionar.
Restrições

Você deve implementar com uma LinkedList e apenas essa estrutura. O código foi disponibilizado.
A busca por um elemento no cache é O(n) - não estamos usando outra estrutura além da LinkedList.
Adição de um elemento na linkedlist deve ser O(1).
Remoção de um elemento da linkedlist deve ser O(1).
Seu cache deve ter o tamanho fixo, mesmo sendo implementado com uma linked list.
Dica: No FIFO, novos elementos sempre entram no final da lista, e remoções sempre acontecem no início (primeiro que entrou).