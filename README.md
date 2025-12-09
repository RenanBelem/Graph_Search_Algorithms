# Algoritmos de Busca em Grafos (Java)

Este projeto contém implementações em Java de algoritmos clássicos de Inteligência Artificial para busca em grafos. O código é dividido em duas abordagens principais: **Busca Cega** (não informada) e **Busca Heurística** (informada), aplicadas a problemas de rota entre localizações geográficas (Estados do Brasil e Países da América).

## 📂 Estrutura do Projeto

O projeto está organizado nos seguintes módulos:

```text
/
├── Busca Cega/
│   ├── Main.java           # Ponto de entrada para os testes de busca cega
│   ├── BLargura.java       # Implementação da Busca em Largura (BFS)
│   ├── BProfundidade.java  # Implementação de DFS e Aprofundamento Iterativo
│   ├── Estado.java         # Objeto que representa um nó (Estado brasileiro)
│   └── Grafo.java          # Estrutura de dados do grafo de estados
│
└── Busca Heurística/
    ├── MainH.java          # Ponto de entrada para os testes de busca heurística
    ├── BHeuristica.java    # Implementação de Busca Gulosa e A* (A-Star)
    ├── Pais.java           # Objeto nó com coordenadas (Latitude/Longitude)
    └── GrafoH.java         # Estrutura de dados do grafo de países
```

-----

## 📍 Módulo 1: Busca Cega

Este módulo utiliza um mapa de **Estados do Brasil** e suas fronteiras. O objetivo configurado no `Main.java` é encontrar um caminho entre **São Paulo** e **Amazonas**.

### Algoritmos Implementados

1.  **Busca em Largura (Breadth-First Search - BFS):**
      * Arquivo: `BLargura.java`
      * Explora o grafo nível por nível. Garante encontrar o caminho com o menor número de passos (arestas) em grafos não ponderados.
2.  **Busca em Profundidade (Depth-First Search - DFS):**
      * Arquivo: `BProfundidade.java`
      * Explora um ramo do grafo até o fim antes de retroceder (backtracking).
3.  **Busca de Aprofundamento Iterativo (Iterative Deepening Search):**
      * Arquivo: `BProfundidade.java`
      * Combina a eficiência de memória da DFS com a garantia de completude da BFS, aumentando o limite de profundidade gradualmente.

### Classes Auxiliares

  * **`Estado`**: Representa um vértice do grafo. Contém o nome do estado e uma lista de adjacência (`fazFronteira`).
  * **`Grafo`**: Gerencia a coleção de estados e permite recuperar nós pelo nome.

-----

## 🌎 Módulo 2: Busca Heurística

Este módulo utiliza um mapa de **Países das Américas** (Sul, Central e Norte). O objetivo configurado no `MainH.java` é encontrar uma rota do **Brasil** até o **Canadá**.

Diferente da busca cega, estes algoritmos utilizam informações geográficas (**Latitude e Longitude**) para calcular distâncias e estimar o custo até o objetivo.

### Algoritmos Implementados (`BHeuristica.java`)

1.  **Busca Gulosa (Greedy Best-First Search):**
      * Seleciona o nó que parece estar mais próximo do objetivo com base apenas na função heurística $h(n)$ (distância euclidiana até o destino).
2.  **Busca A\* (A-Star):**
      * Combina o custo real do caminho percorrido $g(n)$ com a estimativa heurística $h(n)$.
      * *Nota de implementação:* O código utiliza a distância euclidiana para o cálculo da heurística.

### Classes Auxiliares

  * **`Pais`**: Representa um vértice do grafo contendo Nome, Latitude e Longitude.
  * **`GrafoH`**: Versão do grafo adaptada para manipular objetos do tipo `Pais`.

-----

## 🚀 Como Executar

Certifique-se de ter o [JDK (Java Development Kit)](https://www.oracle.com/java/technologies/downloads/) instalado.

### Executando a Busca Cega

1.  Navegue até a pasta `Busca Cega`.
2.  Compile os arquivos:
    ```bash
    javac *.java
    ```
3.  Execute a classe Main:
    ```bash
    java Main
    ```

### Executando a Busca Heurística

1.  Navegue até a pasta `Busca Heurística`.
2.  Compile os arquivos:
    ```bash
    javac *.java
    ```
3.  Execute a classe MainH:
    ```bash
    java MainH
    ```

-----

## 📋 Exemplos de Saída

O programa exibirá no console o caminho percorrido (trace) de um ponto ao outro. Exemplo:

```text
======= EXERCÍCIO 5 [BUSCA LARGURA] =======
5)  SAO PAULO -> MINAS GERAIS -> BAHIA -> TOCANTINS -> PARA -> AMAZONAS
```

Para a busca heurística, o tempo de execução (em milissegundos) também é exibido para comparação de performance entre a Busca Gulosa e o A\*.

-----
