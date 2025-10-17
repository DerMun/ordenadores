package utils;

public class SortersStopwatch{

    public static <T extends Comparable<T>> double[] timeBlubbleSort(String arrayType, T[] vetor, int repetitions) {
        final double CONVERTNS4MS = 1_000_000.0;
        double sum, start, end, duration;
        sum = 0;
        double[] times;

        for (int i = 0; i < repetitions; i++) {
            start = System.nanoTime(); // marca tempo inicial
            Sorters.bubbleSort(array.clone(), array.length);
            end = System.nanoTime();    // marca tempo final
            duration = end - start;

            times[i] = duration;//guardar dados que realmente serão utilizados para o relatório

            sum += duration;//apenas para mostrar dinâmicamente
            System.out.printf("Execução %d - %s: %.2f ms%n", i + 1, arrayType, duration / CONVERT4MS);
        }
        double mean = (sum / (double) repetitions) / CONVERT4MS;
        System.out.printf("Tempo médio para BubbleSort (%s): %.2f ms%n", arrayType, mean);

        return times;
    }


    public static <T extends Comparable<T>> double[] timeInsertionSort(String arrayType, T[] vetor, int repetitions) {
        final double CONVERTNS4MS = 1_000_000.0;
        double sum, start, end, duration;
        sum = 0;
        double[] times;

        for (int i = 0; i < repetitions; i++) {
            start = System.nanoTime(); // marca tempo inicial
            Sorters.insertionSort(array.clone(), array.length);
            end = System.nanoTime();    // marca tempo final
            duration = end - start;

            times[i] = duration;//guardar dados que realmente serão utilizados para o relatório

            sum += duration;//apenas para mostrar dinâmicamente
            System.out.printf("Execução %d - %s: %.2f ms%n", i + 1, arrayType, duration / CONVERT4MS);
        }
        double mean = (sum / (double) repetitions) / CONVERT4MS;
        System.out.printf("Tempo médio para InsertionSort (%s): %.2f ms%n", arrayType, mean);

        return times;
    }


    public static <T extends Comparable<T>> double[] timeSelectionSort(String arrayType, T[] vetor, int repetitions) {
        final double CONVERTNS4MS = 1_000_000.0;
        double sum, start, end, duration;
        sum = 0;
        double[] times;

        for (int i = 0; i < repetitions; i++) {
            start = System.nanoTime(); // marca tempo inicial
            Sorters.selectionSort(array.clone(), array.length);
            end = System.nanoTime();    // marca tempo final
            duration = end - start;

            times[i] = duration;//guardar dados que realmente serão utilizados para o relatório

            sum += duration;//apenas para mostrar dinâmicamente
            System.out.printf("Execução %d - %s: %.2f ms%n", i + 1, arrayType, duration / CONVERT4MS);
        }
        double mean = (sum / (double) repetitions) / CONVERT4MS;
        System.out.printf("Tempo médio para SelectionSort (%s): %.2f ms%n", arrayType, mean);

        return times;
    }


    public static <T extends Comparable<T>> double[] timeMergeSort(String arrayType, T[] vetor, int repetitions) {
        final double CONVERTNS4MS = 1_000_000.0;
        double sum, start, end, duration;
        sum = 0;
        double[] times;

        for (int i = 0; i < repetitions; i++) {
            start = System.nanoTime(); // marca tempo inicial
            Sorters.mergeSort(array.clone(), 0, array.length - 1);
            end = System.nanoTime();    // marca tempo final
            duration = end - start;

            times[i] = duration;//guardar dados que realmente serão utilizados para o relatório

            sum += duration;//apenas para mostrar dinâmicamente
            System.out.printf("Execução %d - %s: %.2f ms%n", i + 1, arrayType, duration / CONVERT4MS);
        }
        double mean = (sum / (double) repetitions) / CONVERT4MS;
        System.out.printf("Tempo médio para MergeSort (%s): %.2f ms%n", arrayType, mean);

        return times;
    }


    public static <T extends Comparable<T>> double[] timeShellSort(String arrayType, T[] vetor, int repetitions) {
        final double CONVERTNS4MS = 1_000_000.0;
        double sum, start, end, duration;
        sum = 0;
        double[] times;

        for (int i = 0; i < repetitions; i++) {
            start = System.nanoTime(); // marca tempo inicial
            Sorters.shellSort(array.clone(), array.length);
            end = System.nanoTime();    // marca tempo final
            duration = end - start;

            times[i] = duration;//guardar dados que realmente serão utilizados para o relatório

            sum += duration;//apenas para mostrar dinâmicamente
            System.out.printf("Execução %d - %s: %.2f ms%n", i + 1, arrayType, duration / CONVERT4MS);
        }
        double mean = (sum / (double) repetitions) / CONVERT4MS;
        System.out.printf("Tempo médio para ShellSort (%s): %.2f ms%n", arrayType, mean);

        return times;
    }


    public static <T extends Comparable<T>> double[] timeHeapSort(String arrayType, T[] vetor, int repetitions) {
        final double CONVERTNS4MS = 1_000_000.0;
        double sum, start, end, duration;
        sum = 0;
        double[] times;

        for (int i = 0; i < repetitions; i++) {
            start = System.nanoTime(); // marca tempo inicial
            Sorters.heapSort(array.clone(), array.length);
            end = System.nanoTime();    // marca tempo final
            duration = end - start;

            times[i] = duration;//guardar dados que realmente serão utilizados para o relatório

            sum += duration;//apenas para mostrar dinâmicamente
            System.out.printf("Execução %d - %s: %.2f ms%n", i + 1, arrayType, duration / CONVERT4MS);
        }
        double mean = (sum / (double) repetitions) / CONVERT4MS;
        System.out.printf("Tempo médio para HeapSort (%s): %.2f ms%n", arrayType, mean);

        return times;
    }


    public static <T extends Comparable<T>> double[] timeQuickSort(String arrayType, T[] vetor, int repetitions) {
        final double CONVERTNS4MS = 1_000_000.0;
        double sum, start, end, duration;
        sum = 0;
        double[] times;

        for (int i = 0; i < repetitions; i++) {
            start = System.nanoTime(); // marca tempo inicial
            Sorters.quickSort(array.clone(), 0, array.length - 1);
            end = System.nanoTime();    // marca tempo final
            duration = end - start;

            times[i] = duration;//guardar dados que realmente serão utilizados para o relatório

            sum += duration;//apenas para mostrar dinâmicamente
            System.out.printf("Execução %d - %s: %.2f ms%n", i + 1, arrayType, duration / CONVERT4MS);
        }
        double mean = (sum / (double) repetitions) / CONVERT4MS;
        System.out.printf("Tempo médio para QuickSort (%s): %.2f ms%n", arrayType, mean);

        return times;
    }


    public static <T extends Comparable<T>> double[] timeBucketSort(String arrayType, T[] vetor, int repetitions) {
        final double CONVERTNS4MS = 1_000_000.0;
        double sum, start, end, duration;
        sum = 0;
        double[] times;

        for (int i = 0; i < repetitions; i++) {
            start = System.nanoTime(); // marca tempo inicial
            Sorters.bucketSort(array.clone(), 10);//exemplo
            end = System.nanoTime();    // marca tempo final
            duration = end - start;

            times[i] = duration;//guardar dados que realmente serão utilizados para o relatório

            sum += duration;//apenas para mostrar dinâmicamente
            System.out.printf("Execução %d - %s: %.2f ms%n", i + 1, arrayType, duration / CONVERT4MS);
        }
        double mean = (sum / (double) repetitions) / CONVERT4MS;
        System.out.printf("Tempo médio para BucketSort (%s): %.2f ms%n", arrayType, mean);

        return times;
    }


    public static <T extends Comparable<T>> double[] timeCountingSort(String arrayType, T[] vetor, int repetitions) {
        final double CONVERTNS4MS = 1_000_000.0;
        double sum, start, end, duration;
        sum = 0;
        double[] times;

        for (int i = 0; i < repetitions; i++) {
            start = System.nanoTime(); // marca tempo inicial
            Sorters.countingSort(array.clone(), array.length);
            end = System.nanoTime();    // marca tempo final
            duration = end - start;

            times[i] = duration;//guardar dados que realmente serão utilizados para o relatório

            sum += duration;//apenas para mostrar dinâmicamente
            System.out.printf("Execução %d - %s: %.2f ms%n", i + 1, arrayType, duration / CONVERT4MS);
        }
        double mean = (sum / (double) repetitions) / CONVERT4MS;
        System.out.printf("Tempo médio para CountingSort (%s): %.2f ms%n", arrayType, mean);

        return times;
    }


    public static <T extends Comparable<T>> double[] timeRadixSort(String arrayType, T[] vetor, int repetitions) {
        final double CONVERTNS4MS = 1_000_000.0;
        double sum, start, end, duration;
        sum = 0;
        double[] times;

        for (int i = 0; i < repetitions; i++) {
            start = System.nanoTime(); // marca tempo inicial
            Sorters.radixSort(array.clone());
            end = System.nanoTime();    // marca tempo final
            duration = end - start;

            times[i] = duration;//guardar dados que realmente serão utilizados para o relatório

            sum += duration;//apenas para mostrar dinâmicamente
            System.out.printf("Execução %d - %s: %.2f ms%n", i + 1, arrayType, duration / CONVERT4MS);
        }
        double mean = (sum / (double) repetitions) / CONVERT4MS;
        System.out.printf("Tempo médio para RadixSort (%s): %.2f ms%n", arrayType, mean);

        return times;
    }

}