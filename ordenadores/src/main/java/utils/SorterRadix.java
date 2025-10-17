package utils; 

public class Sorters{
	static <T extends Comparable<T>> int partition(T[] A, int low, int high) {
        
        // escolhe o pivo
        T pivot = A[high];
        
        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            if (A[j].compareTo(pivot) < 0) {
                i++;
                swap(A, i, j);
            }
        }

        swap(A, i + 1, high);  
        return i + 1;
    }

    static <T extends Comparable<T>> void swap(T[] A, int i, int j) {
        T temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static <T extends Comparable<T>> void quickSort(T[] A, int low, int high) {
        if (low < high) {
            int pi = partition(A, low, high);

            quickSort(A, low, pi - 1);
            quickSort(A, pi + 1, high);
        }
    }

	static <T extends Comparable<T>> void merge(T A[], int l, int m, int r){
        
        // Find sizes of two subAays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
        
        @SuppressWarnings("unchecked") // remove o warning ao compilar
        T[] L = (T[]) new Comparable[n1]; // causa warning pois não está especificado o tipo de dados
        @SuppressWarnings("unchecked")
        T[] R = (T[]) new Comparable[n2];

        // Copy data to temp Aays
        for (int i = 0; i < n1; ++i)
            L[i] = A[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = A[m + 1 + j];

        // Merge the temp Aays

        // Initial indices of first and second subAays
        int i = 0, j = 0;

        // Initial index of merged subAay Aay
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i].compareTo(R[j]) <= 0) {
                A[k] = L[i];
                i++;
            }
            else {
                A[k] = R[j];
                j++;
            }
            k++;
        }

        // copia elementos restantes de L
        while (i < n1) {
            A[k] = L[i];
            i++;
            k++;
        }

        // copia elementos restantes de R
        while (j < n2) {
            A[k] = R[j];
            j++;
            k++;
        }
    }

    public static <T extends Comparable<T>> void mergeSort(T A[], int l, int r){
        
        if (l < r) {

            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            mergeSort(A, l, m);
            mergeSort(A, m + 1, r);

            // Merge the sorted halves
            merge(A, l, m, r);
        }
    }

	static <T extends Comparable<T>> void heapify(T A[], int n, int i) {

        // Initialize largest as root
        int largest = i; 

        // left index = 2*i + 1
        int l = 2 * i + 1; 

        // right index = 2*i + 2
        int r = 2 * i + 2;

        // If left child is larger than root
        if (l < n && A[l].compareTo(A[largest]) > 0) {
            largest = l;
        }

        // If right child is larger than largest so far
        if (r < n && A[r].compareTo(A[largest]) > 0) {
            largest = r;
        }

        // If largest is not root
        if (largest != i) {
            T temp = A[i];
            A[i] = A[largest];
            A[largest] = temp;

            // Recursively heapify the affected sub-tree
            heapify(A, n, largest);
        }
    }

    // Main function to do heap sort
    public static <T extends Comparable<T>> void heapSort(T A[], int n) {
        // Build heap (reAange Aay)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(A, n, i);
        }
        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {

            // Move current root to end
            T temp = A[0]; 
            A[0] = A[i];
            A[i] = temp;

            // Call max heapify on the reduced heap
            heapify(A, i, 0);
        }
    }

	public static <T extends Comparable<T>> void shellSort(T A[], int n) {
        // Start with a big gap, then reduce the gap
        for (int gap = n/2; gap > 0; gap /= 2)
        {
            // Do a gapped insertion sort for this gap size.
            // The first gap elements a[0..gap-1] are already
            // in gapped order keep adding one more element
            // until the entire Aay is gap sorted
            for (int i = gap; i < n; i += 1)
            {
                // add a[i] to the elements that have been gap
                // sorted save a[i] in temp and make a hole at
                // position i
                T temp = A[i];

                // shift earlier gap-sorted elements up until
                // the correct location for a[i] is found
                int j;
                for (j = i; j >= gap && A[j - gap].compareTo(temp) > 0; j -= gap)
                    A[j] = A[j - gap];

                // put temp (the original a[i]) in its correct
                // location
                A[j] = temp;
            }
        }
    }

    public static <T extends Comparable<T>> void selectionSort(T[] A, int n){
        for (int i=0; i < (n-1); i++){
            int min = i; // marca a posição para a inserção do menor elemento
            for (int j = i+1; j < n; j++){
                if ( A[j].compareTo(A[min]) > 0 ) min = j; // encontra e marca a posição de um menor elemento
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

    public static <T extends Comparable<T>> T[] countingSort(T[] A, int n, int k){
        //cria B[1 : n] e o C[0 : k]
        @SuppressWarnings("unchecked")
        T[] B = (T[]) new Comparable[n];
        int[] C = new int[k + 1];
        
        for (int i = 0; i <= k; i++){
            C[i] = 0;
        }
    
        for (int j = 0; j < n; j++){//conta frequencia dos numeros
            C[(Integer) A[j]] = C[(Integer) A[j]] + 1;
        }

        for (int i = 1; i <= k; i++){//acumula as contagens dos numeros
            C[i] = C[i] + C[i - 1];
        }
    
        for (int j = n - 1; j >= 0; j--){
            B[C[(Integer) A[j]] - 1] = A[j];
            C[(Integer) A[j]] = C[(Integer) A[j]] - 1;
        }

        return B;
    }

    public static <T extends Comparable<T>> void radixSort(T[] A, int n, int d){
        @SuppressWarnings("unchecked")
        T[] B = (T[]) new Comparable[n];
        for (int digito = 1; digito <= d; digito++){
            int[] C = new int[10];
            for (int i = 0; i < 10; i++){
                C[i] = 0;
            }
            for (int i = 0; i < n; i++){//conta frequência dos dígitos
                int digitoAtual = ((Integer)A[i] / (int) Math.pow(10, digito - 1)) % 10;
                C[digitoAtual]++;
            }
            for (int i = 1; i < 10; i++){//acumula contagens
                C[i] = C[i] + C[i - 1];
            }
            for (int i = n - 1; i >= 0; i--){
                int digitoAtual = ((Integer)A[i] / (int) Math.pow(10, digito - 1)) % 10;
                B[C[digitoAtual] - 1] = A[i];
                C[digitoAtual]--;
            }
            System.arraycopy(B, 0, A, 0, n);
        }
    }
}
