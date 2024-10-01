package praktikumPemrogramanIImodul1;

import java.util.Scanner;

public class PRAK_2310817320006_Alyarosaan {

	public static void main(String[] args) {
		Scanner inputObj = new Scanner(System.in); 
			System.out.println("Input");
			
			System.out.print("Masukkan Nama Lengkap: ");
			String nama = inputObj.nextLine();
			
			System.out.print("Masukkan Tempat Lahir: ");
			String tempatLahir = inputObj.nextLine();
			
			System.out.print("Masukkan Tanggal Lahir: ");
			int tanggalLahir = inputObj.nextInt();
			
			System.out.print("Masukkan Bulan Lahir: ");
			int bulanLahir = inputObj.nextInt();
			String[] bulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
			
			inputObj.nextLine();    
			
			
			System.out.print("Masukkan Tahun Lahir: ");
			int tahunLahir = inputObj.nextInt();
			
			System.out.print("Masukkan Tinggi Badan: ");
			int tinggiBadan = inputObj.nextInt();
			
			System.out.print("Masukkan Berat Badan: ");
			double beratBadan = inputObj.nextDouble();	
			
			System.out.println("Output");
			
			System.out.print("Nama Lengkap " + nama);
			System.out.print(", Lahir di " + tempatLahir);
			System.out.print(" pada Tanggal " + tanggalLahir + " " + bulan[bulanLahir - 1] + " " + tahunLahir );;
			System.out.print(" Tinggi Badan " + tinggiBadan);
			System.out.print(" dan Berat Badan " + beratBadan + " kilogram" );
			
		}

	}




