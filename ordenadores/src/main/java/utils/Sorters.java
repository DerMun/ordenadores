package utils;

public class Sorters{
	static <T extends Comparable<T>> int partition(T[] a, int low, int high) {
        
        // escolhe o pivo
        T pivot = a[high];
        
        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            if (a[j].compareTo(pivot) < 0) {
                i++;
                swap(a, i, j);
            }
        }

        swap(a, i + 1, high);  
        return i + 1;
    }

    static <T extends Comparable<T>> void swap(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static <T extends Comparable<T>> void quickSort(T[] a, int low, int high) {
        if (low < high) {
            int pi = partition(a, low, high);

            quickSort(a, low, pi - 1);
            quickSort(a, pi + 1, high);
        }
    }

    public static <T extends Comparable<T>> void selectionSort(T[] A, int n){
        for (int i=0; i < (n-1); i++){
            int min = i; // marca a posição para a inserção do menor elemento
            for (int j = i+1; j < n; j++){
                if ( A[j].compareTo(A[min]) < 0 ) min = j; // encontra e marca a posição de um menor elemento
            }

            // troca os valores entre as duas posições
            T temp = A[i];
            A[i] = A[min];
            A[min] = temp;
        }

    }

    public static <T extends Comparable<T>> void insertionSort(T[] A, int n){
        for(int i = 1; i < n; i++){
            T key = A[i];
            //Inserir A[i] no subvetor ordenado A[1 .. i – 1].
            int j = i - 1;
            while (j >= 0 && A[j].compareTo(key) > 0){
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = key;
        }
    }


    public static <T extends Comparable<T>> void bubbleSort(T[] A, int n){
        boolean troca = true;
        
        while(troca){
            for( int i = 0; i < (n-1); i++){
                troca = false;
                for(int j = 0; j < (n-1); j++){
                    if(A[j].compareTo(A[j+1]) > 0){
                        troca = true;
                        T temp = A[j];
                        A[j] = A[j+1];
                        A[j+1] = temp;
                    }
                }
            }
        }
    }


}
