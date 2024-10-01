package praktikumPemrogramanIImodul1;

import java.util.Scanner;

public class PRAK102_2310817320006_AlyaRosaan {

	public static void main(String[] args) {
		Scanner inputObj = new Scanner(System.in); 
			System.out.println("Input");
			System.out.println("Masukkan angka: ");
			int angka1 = inputObj.nextInt();
			int maxDeret = 10;
			int a = 0;
			
			if (angka1 == 46) {
				System.out.println("?");
			}else {
				while (a <= maxDeret) {
					int angka2;
					if (angka1 % 5 == 0) {
						angka2 = angka1/5 - 1; 
						System.out.print(angka2 + " ");
					} else {
						System.out.print(angka1 + " ");
					}angka1++;
					 a++;
				}

			}
	}
}
	
			
		
		

	


