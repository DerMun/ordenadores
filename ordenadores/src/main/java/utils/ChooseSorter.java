package utils;

public class ChooseSorter {
	public static void sorter(Integer[] array, int algoritmo, int n) {
		long inicio, fim;
		inicio = fim = 0;
		
		switch(algoritmo) {
		case 1:
			Vectors.display(array);
			inicio = System.nanoTime(); // marca tempo inicial
			Sorters.bubbleSort(array, n);
			fim = System.nanoTime();    // marca tempo final
			Vectors.display(array);
			break;
		case 2:
			Vectors.display(array);
			inicio = System.nanoTime();
			Sorters.insertionSort(array, n);
			fim = System.nanoTime();
			Vectors.display(array);
			break;
		case 3:
			Vectors.display(array);
			inicio = System.nanoTime();
			Sorters.selectionSort(array, n);
			fim = System.nanoTime();
			Vectors.display(array);
			break;
		case 4:
			Vectors.display(array);
			inicio = System.nanoTime();
			Sorters.shellSort(array, n);
			fim = System.nanoTime();
			Vectors.display(array);
		case 5:
			Vectors.display(array);
			inicio = System.nanoTime();
			Sorters.shellSort(array, n);
			fim = System.nanoTime();
			Vectors.display(array);
			break;
		case 6:
			Vectors.display(array);
			inicio = System.nanoTime();
			Sorters.mergeSort(array, 0, (n - 1));
			fim = System.nanoTime();
			Vectors.display(array);
			break;
		case 7:
			Vectors.display(array);
			inicio = System.nanoTime();
			Sorters.quickSort(array, 0, (n - 1));
			fim = System.nanoTime();
			Vectors.display(array);
			break;
		case 8:
			Vectors.display(array);
			int k = 0;
			for (int x = 0; x < n; x++) { //calcula o valor mC!ximo
				if (array[x].compareTo(k) > 0) {
					k = array[x];
				}
			}
			inicio = System.nanoTime();
			Integer[] arrayOrd = Sorters.countingSort(array, n, k);
			fim = System.nanoTime();
			Vectors.display(arrayOrd);
			break;
		case 9:
			Vectors.display(array);
			int max = array[0];//numero maximo de digitos
			for(int i = 1; i < n; i++) {
				if(array[i].compareTo(max) > 0) {
					max = array[i];
				}
			}
			//numero de dugitos do maior valor
			int d = 0;
			int temp = max;
			while (temp > 0) {
				d++;
				temp = temp / 10;
			}
			inicio = System.nanoTime();
			Sorters.radixSort(array, n, d);
			fim = System.nanoTime();
			Vectors.display(array);
			break;
		}

		double tempoMs = (fim - inicio)/1_000_000.0; // converte para milissegundos

		System.out.printf("\nTempo de execuC'C#o: %.10f ms\n", tempoMs);
	}
}
