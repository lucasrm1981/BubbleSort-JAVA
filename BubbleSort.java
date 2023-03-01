
package bubblesort;

/**
 *
 * @author lucas.monteiro
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int quantidade = 10000;
        int[] vetor = new int[quantidade];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * quantidade);
            /*
     * Impressão dos números gerados Aleatóriamente
     System.out.print(vetor[i]+"\n");
             */
        }

        long tempoInicial = System.currentTimeMillis();

        bubbleSort(vetor);

        long tempoFinal = System.currentTimeMillis();

        System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");

    }

    private static void bubbleSort(int vetor[]) {
        boolean troca = true;
        int aux;
        while (troca) {
            troca = false;
            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    troca = true;
                }
            }
        }

        /* Impressão da visualização
    * Caso deseje imprimir a ordeção irá implicar no desempenho de sua execução
    for(int x=0; x<vetor.length;x++){
        System.out.print(vetor[x]+"\n");
    }*/
    }
}
