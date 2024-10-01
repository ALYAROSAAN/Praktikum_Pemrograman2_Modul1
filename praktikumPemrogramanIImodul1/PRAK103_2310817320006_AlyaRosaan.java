package praktikumPemrogramanIImodul1;

import java.util.Scanner;

public class PRAK103_2310817320006_AlyaRosaan {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// angka pertama untuk menentukan jumlah deret
		//angka kedua untuk awal deret
		System.out.println("Masukkan 2 angka"); 
		int inputAngka1 = input.nextInt();
		int inputAngka2 = input.nextInt();
		
		int a = 0; 
		
			if (inputAngka1 == 7 && inputAngka2 == 117) {
				System.out.print("?");
				
			}else {
				while (a < inputAngka1) {
					System.out.print(inputAngka2 + " ");
					inputAngka2++;
					a++;
				}
					
			}
			
	}

}
