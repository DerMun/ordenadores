package utils;
import java.util.Random;

public class Vectors{
	static Integer[] vector_asc = {0,1,2,3,4,5,6,7,8,9};
	static Integer[] vector_dec = {9,8,7,6,5,4,3,2,1,0};
	static Integer[] vector_ale = gerarArrayAleatorio(10);
	static Integer[] vector_rep = {0,5,7,3,9,2,9,3,1,0};
    
    public static Integer[] escolheVetor(int vetor) {
		switch(vetor) {
			case 1:
				return vector_asc;
			case 2:
				return vector_dec;
			case 3:
				return vector_ale;
			case 4:
				return vector_rep;
			default:
				return null;
			}
	}
	
	public static Integer[] gerarArrayAleatorio(int tamanho) {
        Random random = new Random();
        Integer[] array = new Integer[tamanho];

        for (int i = 0; i < tamanho; i++) {
            array[i] = random.nextInt(tamanho); // gera número de 0 a n
        }

        return array;
    }
	
	public static void display(Integer[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(", ");
        }
        System.out.print("\n");
    }
}
