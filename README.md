# Lista Encadeada em Java

Projeto em Java que implementa a estrutura de dados **Lista Simplesmente Encadeada** (*Singly Linked List*) e suas principais operações de manipulação de nós.

---

## Funcionalidades

- **Criação da Lista:** Leitura contínua e inserção de elementos até a digitação da condição de parada (`0`).
- **Inserção no Início (`inserePrimeiro`):** Adiciona um novo nó na primeira posição da lista.
- **Inserção por Posição (`insereDepois`):** Adiciona um novo nó após um índice específico.
- **Inserção Ordenada (`insereOrdenado`):** Posiciona o novo nó mantendo a ordem crescente dos elementos.
- **Remoção do Início (`removePrimeiro`):** Remove o primeiro elemento da lista.
- **Remoção do Fim (`removeUltimo`):** Remove o último elemento da lista.
- **Remoção por Índice (`remove`):** Remove o nó localizado na posição informada.
- **Exibição (`imprime`):** Imprime a estrutura atual da lista encadeada no terminal.

---

## Como Executar

### Via IDE (IntelliJ IDEA)
1. Navegue pelo painel de projetos até a pasta `src`.
2. Clique com o botão direito no arquivo `Main.java`.
3. Selecione **Run 'Main.main()'** (ou atalho `Shift + F10`).

### Demonstração de saída

```text
-----Cria a lista encadeada-----
Digite os itens da lista (digite '0' para parar):
1
2
3
0
1 -> 2 -> 3 -> Null
-----Insere o novo nó sempre na primeira posição-----
Digite o valor que vai ser inserido:
4
4 -> 1 -> 2 -> 3 -> Null
-----Insere novo nó depois de uma posição específica-----
Digite em que posicao voce quer inserir depois o nó:
1
Digite o valor que vai ser inserido:
5
4 -> 1 -> 5 -> 2 -> 3 -> Null
-----Insere o novo nó de forma ordenada-----
Digite o valor que vai ser inserido:
6
4 -> 1 -> 5 -> 2 -> 3 -> 6 -> Null
-----Remove o primeiro nó da lista-----
Valor removido: 4
1 -> 5 -> 2 -> 3 -> 6 -> Null
-----Remove o último nó da lista-----
Valor removido: 6
1 -> 5 -> 2 -> 3 -> Null
-----Remove o nó de acordo com o índice-----
Nó removido no indíce: 1
Nó removido: 5
1 -> 2 -> 3 -> Null
-----Exibe a lista final-----
Lista Encadeada:
1 -> 2 -> 3 -> Null
```
