package view;

import br.edu.fateczl.arvore.inteiro.ArvoreInt.Arvore;

public class Principal {

    public static void main(String[] args) {
        // a) Cria��o de um vetor fixo com os valores {33, 15, 41, 38, 47, 34, 49, 43}
        int[] valores = {33, 15, 41, 38, 47, 34, 49, 43};

        // b) Inicializa��o de uma �rvore de Busca Bin�ria
        Arvore arvore = new Arvore();

        // c) Inser��o dos dados do vetor na �rvore
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

