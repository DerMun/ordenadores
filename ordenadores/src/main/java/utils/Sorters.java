package utils;

public class Sorters{

    public static <T extends Comparable<T>> void selectionSort(T[] A, int n){
        T temp;
        int j, min;

        for (int i=0; i < (n-1); i++){
            min = i; // marca a posição para a inserção do menor elemento
            for (j = i+1; j < n; j++){
                if ( A[j].compareTo(A[min]) < 0 ) min = j; // encontra e marca a posição de um menor elemento
            }

            // troca os valores entre as duas posições
            temp = A[i];
            A[i] = A[min];
            A[min] = temp;
        }

    }


    public static <T extends Comparable<T>> void insertionSort(T[] A, int n){
        T key;
        int j;
        for(int i = 1; i < n; i++){
            key = A[i];
            //Inserir A[i] no subvetor ordenado A[1 .. i – 1].
            j = i - 1;
            while (j >= 0 && A[j].compareTo(key) > 0){
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = key;
        }
    }


    public static <T extends Comparable<T>> void bubbleSort(T[] A, int n){
        boolean troca = true;
        T temp;
        while(troca){
            for( int i = 0; i < (n-1); i++){
                troca = false;
                for(int j = 0; j < (n-1); j++){
                    if(A[j].compareTo(A[j+1]) > 0){
                        troca = true;
                        temp = A[j];
                        A[j] = A[j+1];
                        A[j+1] = temp;
                    }
                }
            }
        }
    }

}