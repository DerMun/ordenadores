package utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class SortersStopwatch{

    public static <T extends Comparable<T>> double[] timeBubbleSort(String arrayType, T[] vetor, int repetitions, List<String> csvList) {
        final double CONVERTNS4MS = 1_000_000.0;
        double sum, start, end, duration;
        sum = 0;
        double[] times = new double[repetitions];

		System.out.print("\n");
        for (int i = 0; i < repetitions; i++) {
            start = System.nanoTime(); // marca tempo inicial
            Sorters.bubbleSort(vetor.clone(), vetor.length);
            end = System.nanoTime();    // marca tempo final
            duration = (end - start) / CONVERTNS4MS;

            times[i] = duration;//guardar dados que realmente serão utilizados para o relatório
            sum += duration;//apenas para mostrar dinâmicamente

            String csvLine = String.format(Locale.US, "BubbleSort,%s,%d,%.6f", arrayType, i + 1, duration);
            csvList.add(csvLine);

            System.out.printf(" Execução %d - %s: %.2f ms%n", i + 1, arrayType, duration);
        }
        double mean = sum / (double) repetitions;
        System.out.printf(" Tempo médio para BubbleSort (%s): %.2f ms%n", arrayType, mean);

        return times;
    }


    public static <T extends Comparable<T>> double[] timeInsertionSort(String arrayType, T[] vetor, int repetitions, List<String> csvList) {
        final double CONVERTNS4MS = 1_000_000.0;
        double sum, start, end, duration;
        sum = 0;
        double[] times = new double[repetitions];

        System.out.print("\n");
        for (int i = 0; i < repetitions; i++) {
            start = System.nanoTime(); // marca tempo inicial
            Sorters.insertionSort(vetor.clone(), vetor.length);
            end = System.nanoTime();    // marca tempo final
            duration = (end - start) / CONVERTNS4MS;

            times[i] = duration;//guardar dados que realmente serão utilizados para o relatório

            sum += duration;//apenas para mostrar dinâmicamente

            String csvLine = String.format(Locale.US, "InsertionSort,%s,%d,%.6f", arrayType, i + 1, duration);
            csvList.add(csvLine);

            System.out.printf(" Execução %d - %s: %.2f ms%n", i + 1, arrayType, duration);
        }
        double mean = sum / (double) repetitions;
        System.out.printf(" Tempo médio para InsertionSort (%s): %.2f ms%n", arrayType, mean);

        return times;
    }


    public static <T extends Comparable<T>> double[] timeSelectionSort(String arrayType, T[] vetor, int repetitions, List<String> csvList) {
        final double CONVERTNS4MS = 1_000_000.0;
        double sum, start, end, duration;
        sum = 0;
        double[] times = new double[repetitions];

        System.out.print("\n");
        for (int i = 0; i < repetitions; i++) {
            start = System.nanoTime(); // marca tempo inicial
            Sorters.selectionSort(vetor.clone(), vetor.length);
            end = System.nanoTime();    // marca tempo final
            duration = (end - start) / CONVERTNS4MS;

            times[i] = duration;//guardar dados que realmente serão utilizados para o relatório
            sum += duration;//apenas para mostrar dinâmicamente

            String csvLine = String.format(Locale.US, "SelectionSort,%s,%d,%.6f", arrayType, i + 1, duration);
            csvList.add(csvLine);

            System.out.printf(" Execução %d - %s: %.2f ms%n", i + 1, arrayType, duration);
        }
        double mean = sum / (double) repetitions;
        System.out.printf(" Tempo médio para SelectionSort (%s): %.2f ms%n", arrayType, mean);

        return times;
    }


    public static <T extends Comparable<T>> double[] timeMergeSort(String arrayType, T[] vetor, int repetitions, List<String> csvList) {
        final double CONVERTNS4MS = 1_000_000.0;
        double sum, start, end, duration;
        sum = 0;
        double[] times = new double[repetitions];

        System.out.print("\n");
        for (int i = 0; i < repetitions; i++) {
            start = System.nanoTime(); // marca tempo inicial
            Sorters.mergeSort(vetor.clone(), 0, vetor.length - 1);
            end = System.nanoTime();    // marca tempo final
            duration = (end - start) / CONVERTNS4MS;

            times[i] = duration;//guardar dados que realmente serão utilizados para o relatório

            sum += duration;//apenas para mostrar dinâmicamente

            String csvLine = String.format(Locale.US, "MergeSort,%s,%d,%.6f", arrayType, i + 1, duration);
            csvList.add(csvLine);

            System.out.printf(" Execução %d - %s: %.2f ms%n", i + 1, arrayType, duration);
        }
        double mean = sum / (double) repetitions;
        System.out.printf(" Tempo médio para MergeSort (%s): %.2f ms%n", arrayType, mean);

        return times;
    }


    public static <T extends Comparable<T>> double[] timeShellSort(String arrayType, T[] vetor, int repetitions, List<String> csvList) {
        final double CONVERTNS4MS = 1_000_000.0;
        double sum, start, end, duration;
        sum = 0;
        double[] times = new double[repetitions];

        System.out.print("\n");
        for (int i = 0; i < repetitions; i++) {
            start = System.nanoTime(); // marca tempo inicial
            Sorters.shellSort(vetor.clone(), vetor.length);
            end = System.nanoTime();    // marca tempo final
            duration = (end - start) / CONVERTNS4MS;

            times[i] = duration;//guardar dados que realmente serão utilizados para o relatório
            sum += duration;//apenas para mostrar dinâmicamente

            String csvLine = String.format(Locale.US, "ShellSort,%s,%d,%.6f", arrayType, i + 1, duration);
            csvList.add(csvLine);

            System.out.printf(" Execução %d - %s: %.2f ms%n", i + 1, arrayType, duration);
        }
        double mean = sum / (double) repetitions;
        System.out.printf(" Tempo médio para ShellSort (%s): %.2f ms%n", arrayType, mean);

        return times;
    }


    public static <T extends Comparable<T>> double[] timeHeapSort(String arrayType, T[] vetor, int repetitions, List<String> csvList) {
        final double CONVERTNS4MS = 1_000_000.0;
        double sum, start, end, duration;
        sum = 0;
        double[] times = new double[repetitions];

        System.out.print("\n");
        for (int i = 0; i < repetitions; i++) {
            start = System.nanoTime(); // marca tempo inicial
            Sorters.heapSort(vetor.clone(), vetor.length);
            end = System.nanoTime();    // marca tempo final
            duration = (end - start) / CONVERTNS4MS;

            times[i] = duration;//guardar dados que realmente serão utilizados para o relatório

            sum += duration;//apenas para mostrar dinâmicamente

            String csvLine = String.format(Locale.US, "HeapSort,%s,%d,%.6f", arrayType, i + 1, duration);
            csvList.add(csvLine);

            System.out.printf(" Execução %d - %s: %.2f ms%n", i + 1, arrayType, duration);
        }
        double mean = sum / (double) repetitions;
        System.out.printf(" Tempo médio para HeapSort (%s): %.2f ms%n", arrayType, mean);

        return times;
    }


    public static <T extends Comparable<T>> double[] timeQuickSort(String arrayType, T[] vetor, int repetitions, List<String> csvList) {
        final double CONVERTNS4MS = 1_000_000.0;
        double sum, start, end, duration;
        sum = 0;
        double[] times = new double[repetitions];

        System.out.print("\n");
        for (int i = 0; i < repetitions; i++) {
            start = System.nanoTime(); // marca tempo inicial
            Sorters.quickSort(vetor.clone(), 0, vetor.length - 1);
            end = System.nanoTime();    // marca tempo final
            duration = (end - start) / CONVERTNS4MS;

            times[i] = duration;//guardar dados que realmente serão utilizados para o relatório

            sum += duration;//apenas para mostrar dinâmicamente

            String csvLine = String.format(Locale.US, "QuickSort,%s,%d,%.6f", arrayType, i + 1, duration);
            csvList.add(csvLine);

            System.out.printf(" Execução %d - %s: %.2f ms%n", i + 1, arrayType, duration);
        }
        double mean = sum / (double) repetitions;
        System.out.printf(" Tempo médio para QuickSort (%s): %.2f ms%n", arrayType, mean);

        return times;
    }

    public static double[] timeCountingSort(String arrayType, Integer[] vetor, int repetitions, List<String> csvList) {
        final double CONVERTNS4MS = 1_000_000.0;
        double sum, start, end, duration;
        sum = 0;
        double[] times = new double[repetitions];

        System.out.print("\n");
        for (int i = 0; i < repetitions; i++) {
            start = System.nanoTime(); // marca tempo inicial
            Sorters.auxCounting(vetor.clone());
            end = System.nanoTime();    // marca tempo final
            duration = (end - start) / CONVERTNS4MS;

            times[i] = duration;//guardar dados que realmente serão utilizados para o relatório
            sum += duration;//apenas para mostrar dinâmicamente

            String csvLine = String.format(Locale.US, "CountingSort,%s,%d,%.6f", arrayType, i + 1, duration);
            csvList.add(csvLine);

            System.out.printf(" Execução %d - %s: %.2f ms%n", i + 1, arrayType, duration);
        }
        double mean = sum / (double) repetitions;
        System.out.printf(" Tempo médio para CountingSort (%s): %.2f ms%n", arrayType, mean);

        return times;
    }


    public static double[] timeRadixSort(String arrayType, Integer[] vetor, int repetitions, List<String> csvList) {
        final double CONVERTNS4MS = 1_000_000.0;
        double sum, start, end, duration;
        sum = 0;
        double[] times = new double[repetitions];

        System.out.print("\n");
        for (int i = 0; i < repetitions; i++) {
            start = System.nanoTime(); // marca tempo inicial
            Sorters.auxRadix(vetor.clone());
            end = System.nanoTime();    // marca tempo final
            duration = (end - start) / CONVERTNS4MS;

            times[i] = duration;//guardar dados que realmente serão utilizados para o relatório

            sum += duration;//apenas para mostrar dinâmicamente

            String csvLine = String.format(Locale.US, "RadixSort,%s,%d,%.6f", arrayType, i + 1, duration);
            csvList.add(csvLine);

            System.out.printf(" Execução %d - %s: %.2f ms%n", i + 1, arrayType, duration);
        }
        double mean = sum / (double) repetitions;
        System.out.printf(" Tempo médio para RadixSort (%s): %.2f ms%n", arrayType, mean);

        return times;
    }


    public static <T extends Comparable<T>> double[] timeBucketSort(String arrayType, T[] vetor, int repetitions, List<String> csvList) {
        final double CONVERTNS4MS = 1_000_000.0;
        double sum, start, end, duration;
        sum = 0;
        double[] times = new double[repetitions];

		System.out.print("\n");
        for (int i = 0; i < repetitions; i++) {
            start = System.nanoTime(); // marca tempo inicial
            Sorters.bucketSort(vetor.clone(), 10);//exemplo
            end = System.nanoTime();    // marca tempo final
            duration = (end - start) / CONVERTNS4MS;

            times[i] = duration;//guardar dados que realmente serão utilizados para o relatório
            sum += duration;//apenas para mostrar dinâmicamente

            String csvLine = String.format(Locale.US, "BucketSort,%s,%d,%.6f", arrayType, i + 1, duration);
            csvList.add(csvLine);

            System.out.printf(" Execução %d - %s: %.2f ms%n", i + 1, arrayType, duration);
        }
        double mean = sum / (double) repetitions;
        System.out.printf(" Tempo médio para BucketSort (%s): %.2f ms%n", arrayType, mean);

        return times;
    }

    
    public static <T extends Comparable<T>> void runTimersForAll(T[] ascending, T[] descending, T[] random, T[] repeated, int repetitions){
        double[] array = null;//não utilizado no momento
        List<String> csvList = new ArrayList<>();

        System.out.println("\n\nBubble:");
        array = timeBubbleSort("ascending", ascending, repetitions, csvList);
        array =  timeBubbleSort("descending", descending, repetitions, csvList);
        array =  timeBubbleSort("random", random, repetitions, csvList);
        array =  timeBubbleSort("repeated", repeated, repetitions, csvList);

        System.out.println("\n\nInsertion:");
        array =  timeInsertionSort("ascending", ascending, repetitions, csvList);
        array =  timeInsertionSort("descending", descending, repetitions, csvList);
        array =  timeInsertionSort("random", random, repetitions, csvList);
        array =  timeInsertionSort("repeated", repeated, repetitions, csvList);

        System.out.println("\n\nSelection:");
        array =  timeSelectionSort("ascending", ascending, repetitions, csvList);
        array =  timeSelectionSort("descending", descending, repetitions, csvList);
        array =  timeSelectionSort("random", random, repetitions, csvList);
        array =  timeSelectionSort("repeated", repeated, repetitions, csvList);

        System.out.println("\n\nShell:");
        array =  timeShellSort("ascending", ascending, repetitions, csvList);
        array =  timeShellSort("descending", descending, repetitions, csvList);
        array =  timeShellSort("random", random, repetitions, csvList);
        array =  timeShellSort("repeated", repeated, repetitions, csvList);

        System.out.println("\n\nMerge:");
        array =  timeMergeSort("ascending", ascending, repetitions, csvList);
        array =  timeMergeSort("descending", descending, repetitions, csvList);
        array =  timeMergeSort("random", random, repetitions, csvList);
        array =  timeMergeSort("repeated", repeated, repetitions, csvList);

        System.out.println("\n\nQuick:");
        array =  timeQuickSort("ascending", ascending, repetitions, csvList);
        array =  timeQuickSort("descending", descending, repetitions, csvList);
        array =  timeQuickSort("random", random, repetitions, csvList);
        array =  timeQuickSort("repeated", repeated, repetitions, csvList);

        System.out.println("\n\nHeap:");
        array = timeHeapSort("ascending", ascending, repetitions, csvList);
        array = timeHeapSort("descending", descending, repetitions, csvList);
        array = timeHeapSort("random", random, repetitions, csvList);
        array = timeHeapSort("repeated", repeated, repetitions, csvList);

        System.out.println("\n\nBucket:");
        array = timeBucketSort("ascending", ascending, repetitions, csvList);
        array = timeBucketSort("descending", descending, repetitions, csvList);
        array = timeBucketSort("random", random, repetitions, csvList);
        array = timeBucketSort("repeated", repeated, repetitions, csvList);

        if (ascending instanceof Integer[]) {
            Integer[] intCrescente = (Integer[]) ascending;
            Integer[] intDescending = (Integer[]) descending;
            Integer[] intRandom = (Integer[]) random;
            Integer[] intRepeated = (Integer[]) repeated;

            System.out.println("\n\nCounting:");
            timeCountingSort("ascending", intCrescente, repetitions, csvList);
            timeCountingSort("descending", intDescending, repetitions, csvList);
            timeCountingSort("random", intRandom, repetitions, csvList);
            timeCountingSort("repeated", intRepeated, repetitions, csvList);

            System.out.println("\n\nRadix:");
            timeRadixSort("ascending", intCrescente, repetitions, csvList);
            timeRadixSort("descending", intDescending, repetitions, csvList);
            timeRadixSort("random", intRandom, repetitions, csvList);
            timeRadixSort("repeated", intRepeated, repetitions, csvList);

        } else {
            System.out.println("\nRadix e Counting não serão executados (não são arrays de Inteiros).");
        }

        generateCsv(csvList);
    }

    private static void generateCsv(List<String> csvList){

        String header = "Algorithm,ArrayType,Repetition,Time(ms)";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("sorting_times.csv"))) {
            writer.write(header);
            writer.newLine();

            for (String line : csvList) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("\n\n[SUCESSO] Arquivo 'sorting_times.csv' gerado!");
        } catch (IOException e) {
            System.err.println("\n\n[ERRO] Falha ao escrever o arquivo CSV: " + e.getMessage());
            e.printStackTrace();
        }
    }


}
