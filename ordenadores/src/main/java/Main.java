import utils.Sorters;
import java.util.Random;
import java.lang.System;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Erro! Falta de passagem de parâmetro ou parâmetro menor que 1!");
            return;
        }
        
        long inicio, fim;
        inicio = fim = 0; 

        int tamanho = Integer.parseInt(args[0]);
        String algoritmo = args[1];
        
        Integer[] array = gerarArrayAleatorio(tamanho);
        
        switch(algoritmo) {
				case "bubble" :
					inicio = System.nanoTime(); // marca tempo inicial
					Sorters.bubbleSort(array, tamanho);
					fim = System.nanoTime();    // marca tempo final
					break;
				case "insertion" :
					inicio = System.nanoTime();
					Sorters.insertionSort(array, tamanho);
					fim = System.nanoTime();
					break;
				case "selection" :
					inicio = System.nanoTime();
					Sorters.selectionSort(array, tamanho);
					fim = System.nanoTime();
					break;
				case "quick" :
					display
					inicio = System.nanoTime();
					Sorters.quickSort(array, array[1], array[tamanho - 1]);
					fim = System.nanoTime();
					break;
		}

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
