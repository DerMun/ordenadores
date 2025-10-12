import utils.Sorters;

public class Main {
    public static void main(String[] args) {
        Integer[] vetor = {1, 22, 13, 44, 5, 0};
        display(vetor);

        Sorters.bubbleSort(vetor, 6); //forma de usar um utility
        System.out.print("\n");

        display(vetor);
    }

    public static void display(Integer[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
            System.out.print(", ");
        }
    }
}