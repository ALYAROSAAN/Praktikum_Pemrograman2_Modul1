package praktikumPemrogramanIImodul1;

import java.util.Scanner;

public class PRAK105_2310817320006_AlyaRosaan {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan Jari-jari: ");
		Double inputJari = input.nextDouble();
		
		System.out.print("Masukkan tinggi: ");
		Double inputTinggi = input.nextDouble();
		
		Double phi = 3.14;
		
		Double volumeTabung =  phi * inputJari * inputJari * inputTinggi;
		System.out.printf("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m³\n", inputJari, inputTinggi, volumeTabung);
		

	}

}
