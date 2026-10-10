import java.util.Scanner;
import java.util.Random;

public class kartu {
	
	public static void main(String[] args){
		int kartuku, lawan, a, b, x, y;
		String nambah;
		Scanner input =new Scanner(System.in);
		Random kartu =new Random();

		a = kartu.nextInt(10) + 1;
		b = kartu.nextInt(10) + 1;
		x = kartu.nextInt(10) + 1;
		y = kartu.nextInt(10) + 1;

		lawan = a + b;
		System.out.println("kartu pertama: " + x +  "\nkartu kedua: " + y);
		kartuku = x + y;
		System.out.println("mau nambah?");
		Random hit = new Random();
		System.out.println("YA/Tidak");
		nambah = input.next();

		if (nambah.equalsIgnoreCase("Ya")) {
			int angkahit = hit.nextInt(10) + 1;
			kartuku = kartuku + angkahit;
			System.out.println("kartuku sekarang: " + kartuku); 
			System.out.println("masih kurang?");
			System.out.println("mau nambah lagi?");
			System.out.println("YA/Tidak");
			nambah = input.next();

			if (nambah.equalsIgnoreCase("Ya")) {
				int angkahit1 = hit.nextInt(10) + 1;
				kartuku = kartuku + angkahit;
				System.out.println("kartuku sekarang: " + kartuku); 
				System.out.println("masih kurang?");
				System.out.println("mau nambah lagi?");
				System.out.println("YA/Tidak");
				nambah = input.next();

				if (nambah.equalsIgnoreCase("Ya")) {
					int angkahit2 = hit.nextInt(10) + 1;
					kartuku = kartuku + angkahit;
					System.out.println("kartuku sekarang: " + kartuku); 
					System.out.println("masih kurang?");
					System.out.println("mau nambah lagi? yg bener aja?");
					System.out.println("Yakin/Tidak");
					nambah = input.next();

					if (nambah.equalsIgnoreCase("Yakin")) {
						int angkahit3 = hit.nextInt(10) + 1;
						kartuku = kartuku + angkahit;
						System.out.println("kartuku sekarang: " + kartuku); 

					}
				}
			}

		}


		if (kartuku>=lawan) {
				System.out.println("anjay");
				if (kartuku>20) {
						System.out.println("gokil");
				}
		}else{
				System.out.println("siniin");
			}
		if (lawan<=kartuku) {
				System.out.println("duh bangke, kalah");
		}else{
				System.out.println("kalah? sini setor");
		}

			System.out.println("kartu lawan " + lawan + " dari " + a + " dan "+ b);
	}

}