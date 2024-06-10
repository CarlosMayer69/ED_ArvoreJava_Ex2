package view;

import br.edu.fateczl.arvore.inteiro.ArvoreInt.Arvore;

public class Principal {

    public static void main(String[] args) {
        // a) Criação de um vetor fixo com os valores {33, 15, 41, 38, 47, 34, 49, 43}
        int[] valores = {33, 15, 41, 38, 47, 34, 49, 43};

        // b) Inicialização de uma Árvore de Busca Binária
        Arvore arvore = new Arvore();

        // c) Inserção dos dados do vetor na árvore
        for (int valor : valores) {
            arvore.insertLeaf(valor);
        }

        try {
            // d) Atravessamento pre, in, e posfixo dos valores
            System.out.print("Prefixo: ");
            arvore.prefixSearch();
            System.out.println();

            System.out.print("Infixo: ");
            arvore.infixSearch();
            System.out.println();

            System.out.print("Posfixo: ");
            arvore.postfixSearch();
            System.out.println();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}

