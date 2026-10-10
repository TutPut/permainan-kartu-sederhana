import java.util.Scanner;
import java.util.Random;

public class kartu {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String statusMain = "lanjut";

		while (statusMain.equalsIgnoreCase("lanjut")) {

			int kartuku, lawan, a, b, x, y;
			String nambah;
			Random kartu = new Random();

			a = kartu.nextInt(10) + 1;
			b = kartu.nextInt(10) + 1;
			x = kartu.nextInt(10) + 1;
			y = kartu.nextInt(10) + 1;

			lawan = a + b;
			System.out.println("\n=== MULAI GAME BARU ===");
			System.out.println("kartu pertama: " + x +  "\nkartu kedua: " + y);
			kartuku = x + y;
			System.out.println("kartu kamu sekarang: " + kartuku);

			if (kartuku != 21) {
				System.out.println("mau nambah?");
				Random hit = new Random();
				System.out.println("YA/Tidak");
				nambah = input.next();

				if (nambah.equalsIgnoreCase("Ya")) {
					int angkahit = hit.nextInt(10) + 1;
					kartuku = kartuku + angkahit;
					System.out.println("kartuku sekarang: " + kartuku); 

					if (kartuku > 21) {
						System.out.println("Waduh kebanyakkan! Keburu Bust!");
					} else if (kartuku < 21) {
						System.out.println("masih kurang?");
						System.out.println("mau nambah lagi?");
						System.out.println("YA/Tidak");
						nambah = input.next();

						if (nambah.equalsIgnoreCase("Ya")) {
							int angkahit1 = hit.nextInt(10) + 1;
							kartuku = kartuku + angkahit1;
							System.out.println("kartuku sekarang: " + kartuku); 
							
							if (kartuku > 21) {
								System.out.println("Waduh kebanyakkan! Keburu Bust!");
							} else if (kartuku < 21) {
								System.out.println("masih kurang?");
								System.out.println("mau nambah lagi?");
								System.out.println("YA/Tidak");
								nambah = input.next();

								if (nambah.equalsIgnoreCase("Ya")) {
									int angkahit2 = hit.nextInt(10) + 1;
									kartuku = kartuku + angkahit2;
									System.out.println("kartuku sekarang: " + kartuku); 
									
									if (kartuku > 21) {
										System.out.println("Waduh kebanyakkan! Keburu Bust!");
									} else if (kartuku < 21) {
										System.out.println("masih kurang?");
										System.out.println("mau nambah lagi? yg bener aja?");
										System.out.println("Yakin/Tidak");
										nambah = input.next();

										if (nambah.equalsIgnoreCase("Yakin")) {
											int angkahit3 = hit.nextInt(10) + 1;
											kartuku = kartuku + angkahit3;
											System.out.println("kartuku sekarang: " + kartuku); 
										}
									}
								}
							}
						}
					}
				}
			}
			if (kartuku == 21) {
				System.out.println("Gokil");
			} else if (kartuku > 21) {
				System.out.println("Bust! Kebanyakan (" + kartuku + "), lu kalah telak wkwk.");
			} else if (kartuku >= lawan) {
				System.out.println("Anjay menang!");
			} else {
				System.out.println("Duh bangke, kalah");
			}

			System.out.println("Kartu lawan: " + lawan + " (dari " + a + " dan "+ b + ")");

			System.out.println("\nKetik 'lanjut' buat main lagi, atau ketik apa aja terserah buat udahan:");
			statusMain = input.next();
		}

		System.out.println("Game selesai");
	}
}
