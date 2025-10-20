package utils;

public class SortersStopwatch{

    public static <T extends Comparable<T>> double[] timeBlubbleSort(String arrayType, T[] vetor, int repetitions) {
        final double CONVERTNS4MS = 1_000_000.0;
        double sum, start, end, duration;
        sum = 0;
        double[] times = new double[repetitions];

		System.out.print("\n");
        for (int i = 0; i < repetitions; i++) {
            start = System.nanoTime(); // marca tempo inicial
            Sorters.bubbleSort(vetor.clone(), vetor.length);
            end = System.nanoTime();    // marca tempo final
            duration = end - start;

            times[i] = duration;//guardar dados que realmente serão utilizados para o relatório

            sum += duration;//apenas para mostrar dinâmicamente
            System.out.printf(" Execução %d - %s: %.2f ms%n", i + 1, arrayType, duration / CONVERTNS4MS);
        }
        double mean = (sum / (double) repetitions) / CONVERTNS4MS;
        System.out.printf(" Tempo médio para BubbleSort (%s): %.2f ms%n", arrayType, mean);

        return times;
    }


    public static <T extends Comparable<T>> double[] timeInsertionSort(String arrayType, T[] vetor, int repetitions) {
        final double CONVERTNS4MS = 1_000_000.0;
        double sum, start, end, duration;
        sum = 0;
        double[] times = new double[repetitions];

		System.out.print("\n");
        for (int i = 0; i < repetitions; i++) {
            start = System.nanoTime(); // marca tempo inicial
            Sorters.insertionSort(vetor.clone(), vetor.length);
            end = System.nanoTime();    // marca tempo final
            duration = end - start;

            times[i] = duration;//guardar dados que realmente serão utilizados para o relatório

            sum += duration;//apenas para mostrar dinâmicamente
            System.out.printf(" Execução %d - %s: %.2f ms%n", i + 1, arrayType, duration / CONVERTNS4MS);
        }
        double mean = (sum / (double) repetitions) / CONVERTNS4MS;
        System.out.printf(" Tempo médio para InsertionSort (%s): %.2f ms%n", arrayType, mean);

        return times;
    }


    public static <T extends Comparable<T>> double[] timeSelectionSort(String arrayType, T[] vetor, int repetitions) {
        final double CONVERTNS4MS = 1_000_000.0;
        double sum, start, end, duration;
        sum = 0;
        double[] times = new double[repetitions];

		System.out.print("\n");
        for (int i = 0; i < repetitions; i++) {
            start = System.nanoTime(); // marca tempo inicial
            Sorters.selectionSort(vetor.clone(), vetor.length);
            end = System.nanoTime();    // marca tempo final
            duration = end - start;

            times[i] = duration;//guardar dados que realmente serão utilizados para o relatório

            sum += duration;//apenas para mostrar dinâmicamente
            System.out.printf(" Execução %d - %s: %.2f ms%n", i + 1, arrayType, duration / CONVERTNS4MS);
        }
        double mean = (sum / (double) repetitions) / CONVERTNS4MS;
        System.out.printf(" Tempo médio para SelectionSort (%s): %.2f ms%n", arrayType, mean);

        return times;
    }


    public static <T extends Comparable<T>> double[] timeMergeSort(String arrayType, T[] vetor, int repetitions) {
        final double CONVERTNS4MS = 1_000_000.0;
        double sum, start, end, duration;
        sum = 0;
        double[] times = new double[repetitions];

		System.out.print("\n");
        for (int i = 0; i < repetitions; i++) {
            start = System.nanoTime(); // marca tempo inicial
            Sorters.mergeSort(vetor.clone(), 0, vetor.length - 1);
            end = System.nanoTime();    // marca tempo final
            duration = end - start;

            times[i] = duration;//guardar dados que realmente serão utilizados para o relatório

            sum += duration;//apenas para mostrar dinâmicamente
            System.out.printf(" Execução %d - %s: %.2f ms%n", i + 1, arrayType, duration / CONVERTNS4MS);
        }
        double mean = (sum / (double) repetitions) / CONVERTNS4MS;
        System.out.printf(" Tempo médio para MergeSort (%s): %.2f ms%n", arrayType, mean);

        return times;
    }


    public static <T extends Comparable<T>> double[] timeShellSort(String arrayType, T[] vetor, int repetitions) {
        final double CONVERTNS4MS = 1_000_000.0;
        double sum, start, end, duration;
        sum = 0;
        double[] times = new double[repetitions];

		System.out.print("\n");
        for (int i = 0; i < repetitions; i++) {
            start = System.nanoTime(); // marca tempo inicial
            Sorters.shellSort(vetor.clone(), vetor.length);
            end = System.nanoTime();    // marca tempo final
            duration = end - start;

            times[i] = duration;//guardar dados que realmente serão utilizados para o relatório

            sum += duration;//apenas para mostrar dinâmicamente
            System.out.printf(" Execução %d - %s: %.2f ms%n", i + 1, arrayType, duration / CONVERTNS4MS);
        }
        double mean = (sum / (double) repetitions) / CONVERTNS4MS;
        System.out.printf(" Tempo médio para ShellSort (%s): %.2f ms%n", arrayType, mean);

        return times;
    }


    public static <T extends Comparable<T>> double[] timeHeapSort(String arrayType, T[] vetor, int repetitions) {
        final double CONVERTNS4MS = 1_000_000.0;
        double sum, start, end, duration;
        sum = 0;
        double[] times = new double[repetitions];

		System.out.print("\n");
        for (int i = 0; i < repetitions; i++) {
            start = System.nanoTime(); // marca tempo inicial
            Sorters.heapSort(vetor.clone(), vetor.length);
            end = System.nanoTime();    // marca tempo final
            duration = end - start;

            times[i] = duration;//guardar dados que realmente serão utilizados para o relatório

            sum += duration;//apenas para mostrar dinâmicamente
            System.out.printf(" Execução %d - %s: %.2f ms%n", i + 1, arrayType, duration / CONVERTNS4MS);
        }
        double mean = (sum / (double) repetitions) / CONVERTNS4MS;
        System.out.printf(" Tempo médio para HeapSort (%s): %.2f ms%n", arrayType, mean);

        return times;
    }


    public static <T extends Comparable<T>> double[] timeQuickSort(String arrayType, T[] vetor, int repetitions) {
        final double CONVERTNS4MS = 1_000_000.0;
        double sum, start, end, duration;
        sum = 0;
        double[] times = new double[repetitions];

		System.out.print("\n");
        for (int i = 0; i < repetitions; i++) {
            start = System.nanoTime(); // marca tempo inicial
            Sorters.quickSort(vetor.clone(), 0, vetor.length - 1);
            end = System.nanoTime();    // marca tempo final
            duration = end - start;

            times[i] = duration;//guardar dados que realmente serão utilizados para o relatório

            sum += duration;//apenas para mostrar dinâmicamente
            System.out.printf(" Execução %d - %s: %.2f ms%n", i + 1, arrayType, duration / CONVERTNS4MS);
        }
        double mean = (sum / (double) repetitions) / CONVERTNS4MS;
        System.out.printf(" Tempo médio para QuickSort (%s): %.2f ms%n", arrayType, mean);

        return times;
    }


    /*public static <T extends Comparable<T>> double[] timeBucketSort(String arrayType, T[] vetor, int repetitions) {
        final double CONVERTNS4MS = 1_000_000.0;
        double sum, start, end, duration;
        sum = 0;
        double[] times = new double[repetitions];

		System.out.print("\n");
        for (int i = 0; i < repetitions; i++) {
            start = System.nanoTime(); // marca tempo inicial
            Sorters.bucketSort(vetor.clone(), 10);//exemplo
            end = System.nanoTime();    // marca tempo final
            duration = end - start;

            times[i] = duration;//guardar dados que realmente serão utilizados para o relatório

            sum += duration;//apenas para mostrar dinâmicamente
            System.out.printf(" Execução %d - %s: %.2f ms%n", i + 1, arrayType, duration / CONVERTNS4MS);
        }
        double mean = (sum / (double) repetitions) / CONVERTNS4MS;
        System.out.printf(" Tempo médio para BucketSort (%s): %.2f ms%n", arrayType, mean);

        return times;
    }*/


    public static <T extends Comparable<T>> double[] timeCountingSort(String arrayType, Integer[] vetor, int repetitions) {
        final double CONVERTNS4MS = 1_000_000.0;
        double sum, start, end, duration;
        sum = 0;
        double[] times = new double[repetitions];

		System.out.print("\n");
        for (int i = 0; i < repetitions; i++) {
            start = System.nanoTime(); // marca tempo inicial
            Sorters.auxCounting(vetor.clone());
            end = System.nanoTime();    // marca tempo final
            duration = end - start;

            times[i] = duration;//guardar dados que realmente serão utilizados para o relatório

            sum += duration;//apenas para mostrar dinâmicamente
            System.out.printf(" Execução %d - %s: %.2f ms%n", i + 1, arrayType, duration / CONVERTNS4MS);
        }
        double mean = (sum / (double) repetitions) / CONVERTNS4MS;
        System.out.printf(" Tempo médio para CountingSort (%s): %.2f ms%n", arrayType, mean);

        return times;
    }


    public static <T extends Comparable<T>> double[] timeRadixSort(String arrayType, Integer[] vetor, int repetitions) {
        final double CONVERTNS4MS = 1_000_000.0;
        double sum, start, end, duration;
        sum = 0;
        double[] times = new double[repetitions];

		System.out.print("\n");
        for (int i = 0; i < repetitions; i++) {
            start = System.nanoTime(); // marca tempo inicial
            Sorters.auxRadix(vetor.clone());
            end = System.nanoTime();    // marca tempo final
            duration = end - start;

            times[i] = duration;//guardar dados que realmente serão utilizados para o relatório

            sum += duration;//apenas para mostrar dinâmicamente
            System.out.printf(" Execução %d - %s: %.2f ms%n", i + 1, arrayType, duration / CONVERTNS4MS);
        }
        double mean = (sum / (double) repetitions) / CONVERTNS4MS;
        System.out.printf(" Tempo médio para RadixSort (%s): %.2f ms%n", arrayType, mean);

        return times;
    }
}
