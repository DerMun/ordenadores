import utils.Sorters;
import utils.Vectors;
import utils.ChooseSorter;
import utils.ArrayGenerator;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
        
		int op,vetor,algoritmo,n;
        Integer[] array = null;
        
        Scanner input = new Scanner(System.in);
        
        op = vetor = algoritmo = n = 0;

		do {

			System.out.println("\n 1) Utilizar vetores de teste\n 2) Gerar vetor de tamanho personalizado\n 0) Sair da aplicacao");
			System.out.print(" Escolha uma das opcoes: ");
			op = input.nextInt();
		
			switch(op) {
				case 1:
					System.out.println("\n 1) Ordem crescente\n 2) Ordem decrescente\n 3) Números aleatórios\n 4) Números repitidos");
					System.out.print(" Escolha o tipo de vetor: ");
					vetor = input.nextInt();
					array = Vectors.escolheVetorTeste(vetor);
					n = 10;
					break;
				case 2:
					System.out.println("\n 1) Ordem crescente\n 2) Ordem decrescente\n 3) Números repitidos");
					System.out.print(" Escolha o tipo de vetor: ");
					vetor = input.nextInt();
					System.out.print(" Escolha o tamanho do vetor: ");
					n = input.nextInt();
					array = Vectors.escolheVetorPersonalizado(vetor, n);
					break;
				case 0:
					System.exit(0);
			}
			
		
			do {

				System.out.println("\n 1) Bubble\n 2) Insertion\n 3) Selection\n 4) Shell\n 5) Heap\n 6) Merge\n 7) Quick\n 8) Couting\n 9) Radix\n 0) Sair");
				System.out.print(" Escolha o tipo de algoritmo ou se deseja sair: ");
				algoritmo = input.nextInt();
        
				if(algoritmo > 0 & algoritmo <= 9){
					ChooseSorter.sorter(array, algoritmo, n);
				}
			} while(algoritmo != 0);
		} while(op != 0);
	}
}
