import java.util.Scanner;
public class HesapMakinasi {

	public static void main(String[] args) {
		int durum = 1;
		while(durum==1) {
			Scanner input = new Scanner(System.in);
			
			
			System.out.print("Ýþlem Seçiniz (+,*,-,/):");
			String operator = input.nextLine();
			
			
			
			System.out.print("Ýlk Sayýyý Giriniz:");
			int number1 = input.nextInt();
			
			System.out.print("Ýkinci Sayýyý Giriniz:");
			int number2 = input.nextInt();
			
			
			
			switch(operator) {
				case "+":
					System.out.println("Toplam: "+(number1+number2));
					break;
				case "*":
					System.out.println("Çarma: "+(number1*number2));
					break;
				case "-":
					System.out.println("Çýkarma: "+(number1-number2));
					break;
				case "/":
					System.out.println("Bölme: "+(number1/number2));
					break;
				default:
					System.out.println("Böyle Bir Ýþlem Bulunmamaktadýr.");
					
			}

			System.out.print("Devammý (1/0):");
			durum = input.nextInt();
			
		}
	
		
		System.out.print("Çýkýþ Yaptýnýz");
	}

}
