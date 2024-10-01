package praktikumPemrogramanIImodul1;

import java.util.Scanner;

	public class PRAK104_2310817320006_AlyaRosaan{
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        // Membaca input pilihan tangan Abu dan Bagas
	        System.out.print("Masukkan pilihan Abu(Batu(B), gunting(G), kertas(K): ");
	        String[] pilihanAbu = input.nextLine().split(" "); 
	        
	        System.out.print("Masukkan pilihan Bagas (Batu(B), gunting(G), kertas(K): ");
	        String[] pilihanBagus = input.nextLine().split(" ");

	        int poinAbu = 0;
	        int poinBagus = 0;
	        
	        for (int ronde = 0; ronde < 3; ronde++) {
	            String abu = pilihanAbu[ronde].toUpperCase();    // Mengambil pilihan Abu pada ronde ke-n
	            String bagus = pilihanBagus[ronde].toUpperCase();  // Mengambil pilihan Bagas pada ronde ke-n
	            
	            if (abu.equals(bagus)) {
	                // Jika pilihan Abu dan Bagus sama, hasilnya seri, maka tidak ada poin yang dimunculkan
	            	continue;
	            } else if (menang(abu, bagus)) {
	                poinAbu++; // Jika Abu menang, tambah poin Abu
	            } else {
	                poinBagus++; // Jika Bagus menang, tambah poin Bagus
	            }
	        }
	        
	        if (poinAbu > poinBagus) {
	            System.out.println("Abu");
	        } else if (poinBagus > poinAbu) {
	            System.out.println("Bagus");
	        } else {
	            System.out.println("Seri");
	        }

	        input.close();
	    }
	    
	    public static boolean menang(String abu, String bagus) {
	        // Logika kemenangan Abu: 
	    	//Batu (B) menang dari Gunting (G)
	    	//Gunting (G) menang dari Kertas (K) 
	    	//Kertas (K) menang dari Batu (B)
	        return (abu.equals("B") && bagus.equals("G")) || 
	               (abu.equals("G") && bagus.equals("K")) || 
	               (abu.equals("K") && bagus.equals("B"));
	    }
	}

