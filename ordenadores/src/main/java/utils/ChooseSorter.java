package utils;

public class ChooseSorter {
	public static void sorter(Integer[] array, int algoritmo, int r) {
		double[] times = null;
		
		switch(algoritmo) {
		case 1:
			times = SortersStopwatch.timeBlubbleSort("BubbleSort", array, r);
			break;
		case 2:
			times = SortersStopwatch.timeInsertionSort("InsertionSort", array, r);
			break;
		case 3:
			times = SortersStopwatch.timeSelectionSort("SelectionSort", array, r);
			break;
		case 4:
			times = SortersStopwatch.timeMergeSort("MergeSort", array, r);
		case 5:
			times = SortersStopwatch.timeShellSort("ShellSort", array, r);
			break;
		case 6:
			times = SortersStopwatch.timeHeapSort("HeapSort", array, r);
			break;
		case 7:
			times = SortersStopwatch.timeQuickSort("QuickSort", array, r);
			break;
		case 8:
			times = SortersStopwatch.timeCountingSort("CountingSort", array, r);
			break;
		case 9:
			times = SortersStopwatch.timeRadixSort("RadixSort", array, r);
			break;
		}
	}
}
