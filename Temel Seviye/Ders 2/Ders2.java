import java.util.Scanner;

public class Ders2 {
	
	public static void main6(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen Ýlk Sayýyý Giriniz:");
		int sayi1 = input.nextInt();
		System.out.print("Lütfen Ýkinci Sayýyý Giriniz:");
		int sayi2 = input.nextInt();
		System.out.println("Toplam: "+(sayi1+sayi2));
	}
	
	
	
	public static void main5(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen Mesaj Giriniz: ");
		String mesaj = input.nextLine();
		System.out.println("Mesajýnýz: "+mesaj);
		
		System.out.println("Lütfen Mesaj Girinz");
		mesaj = input.nextLine();
		System.out.println("Mesajýnýz: "+mesaj);
	}
	
	
	public static void main4(String[] args) {
		String ayDegeriStr= "Þubat";
		int ayDeger=-1;
		switch(ayDegeriStr.toLowerCase()) {
			case "ocak":
				ayDeger=1;
				break;
			case "þubat":
				ayDeger=2;
				break;
			case "mart":
				ayDeger=3;
				break;
			case "nisan":
				ayDeger=4;
				break;
			case "mayýs":
				ayDeger=5;
				break;
			case "haziran":
				ayDeger=6;
				break;
			case "temmuz":
				ayDeger=7;
				break;
			case "aðustos":
				ayDeger=8;
				break;
			case "eylül":
				ayDeger=9;
				break;
			case "ekim":
				ayDeger=10;
				break;
			case "kasým":
				ayDeger=11;
				break;
			case "aralýk":
				ayDeger=12;
				break;
			default:
				ayDeger=-1;
				break;
		
		}
		System.out.println(ayDegeriStr + " ayý yýlýn "+ ayDeger+ ". ayýdýr");
	}
	
	
	public static void main3(String[] args) {
		/*int aydegeri=7;
		switch(aydegeri) {
			case 1:
			case 2:
				System.out.println("ay deðeri 1 veya 2 eþit");
				break;
				
			case 3:
				System.out.println("ay deðeri 3 eþit");
			case 4:
				System.out.println("ay deðeri 4 eþit");
				break;
			case 5:
				System.out.println("ay deðeri 5 eþit");
				break;
			default:
				System.out.println("Default");
				break;
			case 6:
				System.out.println("ay deðeri 6 eþit");
				break;
		}*/
		
		
	}
	public static void main2(String[] args) {
		/*int x = -1;
		if(x>0) {
			int z = x*5;
			System.out.println("z Deðeri: "+z);
		}else {
			System.out.println("x 0 dan küçük veya eþit");
		}*/
		
		/*String x ="Baþakþehir";
		String y ="Kerim Kýlýç";
		System.out.println(x.equals(y));
		if(x.equals(y)) {
			System.out.println("Eþit");
		}else {
			System.out.println("Eþit Deðil");
		}*/
		
		/*int x = -50;
		
		if(x>90) {
			System.out.println(" x 90'dan Büyük");
		}else if(x>=80) {
			System.out.println(" x 90 ile 80 Arasýnda");
		}else if(x>=70) {
			System.out.println(" x 80 ile 70 Arasýnda");
		}else if(x>=60) {
			System.out.println(" x 70 ile 60 Arasýnda");
		}else if(x>=50) {
			System.out.println(" x 60 ile 50 Arasýnda");
		}else if(x>=40) {
			System.out.println(" x 50 ile 40 Arasýnda");
		}else if(x>=30) {
			System.out.println(" x 40 ile 30 Arasýnda");
		}else if(x>=20) {
			System.out.println(" x 30 ile 20 Arasýnda");
		}else if(x>=10) {
			System.out.println(" x 20 ile 10 Arasýnda");
		}else if(x>=0) {
			System.out.println(" x 10 ile 0 Arasýnda");
		}else {
			System.out.println(" 0 'dan küçüktür");
		}*/
		
		/*int x=6;
		if(x>5 && x<10) {
			System.out.println("x 10 ile 5 arasýnda");
		}else {
			System.out.println("x 10 dan büyük veya 5 den küçük");
		}*/
		
		int x=11;
		if(x>10 || x<10) {
			System.out.println("x 10 dan küçük veya 5 den büyük");
		}else {
			System.out.println("x 10 eþit");
		}
	
		
	}
	
	public static void main1(String[] args) {
		//If Else
		
		int A=5,B=7;
		System.out.println(A);
		System.out.println(B);
		
		if(A*B==35) {
			System.out.println("Eþit");
		}else {
			System.out.println("Eþit Deðil");
		}
		
		A=30;B=6;

		if(A+B>35) {
			System.out.println(" 35 ten Büyük");
		}else if(A+B==35) {
		
			System.out.println("Toplam 35");
		
		}else if(A+B==34) {
		
			System.out.println("Toplam 34");
		
		}else if(A+B==33) {
		
			System.out.println("Toplam 33");
		
		}else{
			System.out.println(" 33 ten Küçük");
		}
	
		System.out.println("Ýþlem Bitti");
	}

}
