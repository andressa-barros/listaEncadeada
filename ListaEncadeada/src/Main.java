import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaEncadeada lista = new ListaEncadeada();

        System.out.println("-----Cria a lista encadeada-----");
        System.out.println("Digite os itens da lista (digite '0' para parar):");
        while (true) {
            int item = scanner.nextInt();
            if (item == 0) {
                lista.imprime();
                break;
            }
            lista.inserir(item);
        }


        System.out.println("-----Insere o novo nó sempre na primeira posição-----");
        System.out.println("Digite o valor que vai ser inserido:");
        int info = scanner.nextInt();
        lista.inserePrimeiro(info);
        lista.imprime();

        System.out.println("-----Insere novo nó depois de uma posição específica-----");
        System.out.println("Digite em que posicao voce quer inserir depois o nó:");
        int posicao = scanner.nextInt();
        System.out.println("Digite o valor que vai ser inserido:");
        int newItem = scanner.nextInt();
        lista.insereDepois(posicao, newItem);
        lista.imprime();

        System.out.println("-----Insere o novo nó de forma ordenada-----");
        System.out.println("Digite o valor que vai ser inserido:");
        int i = scanner.nextInt();
        lista.insereOrdenado(i);
        lista.imprime();

        System.out.println("-----Remove o primeiro nó da lista-----");
        lista.removePrimeiro();
        lista.imprime();

        System.out.println("-----Remove o último nó da lista-----");
        lista.removeUltimo();
        lista.imprime();

        System.out.println("-----Remove o nó de acordo com o índice-----");
        lista.remove(1);
        lista.imprime();

        System.out.println("-----Exibe a lista final-----");
        System.out.println("Lista Encadeada:");
        lista.imprime();
    }
}
