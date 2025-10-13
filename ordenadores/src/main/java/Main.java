import utils.Sorters;
import java.util.Random;
import java.lang.System;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Erro! Falta de passagem de parâmetro ou parâmetro menor que 1!");
            return;
        }

        int tamanho = Integer.parseInt(args[0]);
        Integer[] array = gerarArrayAleatorio(tamanho);
        
        long inicio = System.nanoTime(); // marca tempo inicial
        //Sorters.bubbleSort(array, tamanho);
        Sorters.insertionSort(array, tamanho);
        long fim = System.nanoTime();    // marca tempo final
        double tempoMs = (fim - inicio)/1_000_000.0; // converte para milissegundos
        
        System.out.printf("\nTempo de execução: %.10f ms\n", tempoMs);
    }

    static Integer[] gerarArrayAleatorio(int tamanho) {
        Random random = new Random();
        Integer[] array = new Integer[tamanho];

        for (int i = 0; i < tamanho; i++) {
            array[i] = random.nextInt(tamanho); // gera número de 0 a n
        }

        return array;
    }
    
    public static void display(Integer[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
            System.out.print(", ");
        }
    }
}
