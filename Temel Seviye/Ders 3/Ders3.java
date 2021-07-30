import java.util.Scanner;

public class Ders3 {
	public static void main(String[] args) {
		int veritabanikayitsayisi=5;
		int toplam=0;
		for(int i = 1;i<veritabanikayitsayisi;i++) {
			
			if(i==3)
				continue;
			System.out.println("ContinueCount:"+i);
			toplam += i;
		}
		System.out.println("Toplam:"+toplam);
	}

	
	public static void main10(String[] args) {
		int veritabanikayitsayisi=35;
		for(int i = 1;i<veritabanikayitsayisi;i++) {
			System.out.println("BreakCount:"+i);
			if(i==15)
				break;
		}
		
		for(int i = 1;i<veritabanikayitsayisi;i++) {
			
			if(i==15)
				continue;
			System.out.println("ContinueCount:"+i);
		}
	}
	public static void main9(String[] args) {
		
		for( int i=1;i<11;i++) {
			System.out.println("++Count:"+i);
		}
		int i=13;
		for(;i>0;i--) {
			System.out.println("--Count:"+i);
		}
		 i=13;	
		for(;i>0;) {
			System.out.println("--++Count:"+i);
			i--;
		}
	}
		
	public static void main8(String[] args) {
		int count =11;
		while(count<11) {
			System.out.println("Count:"+count);
			count++;
		}
		int docount =11;
		do {
			System.out.println("doCount:"+docount);
			docount++;
		} while(docount<11);
	}

	public static void main7(String[] args) {
		int sayi = (int)(Math.random() * 101);
		Scanner input = new Scanner(System.in);
		int tahmin = -1;
		while(sayi != tahmin) {
			System.out.print("Tahmin ettiðiniz sayýyý giriniz:");
			tahmin = input.nextInt();
			if(sayi == tahmin) {
				System.out.println("Doðru Tahmin");
			}else if(tahmin > sayi) {
				System.out.println("Tahmininizi azaltýn");
			}else {
				System.out.println("Tahimininizi arttýrýn");
			}
		}
		
		
	}
	
	public static void main6(String[] args) {	
		while(true){
			int i=1,toplam=0;
			Scanner input = new Scanner(System.in);
			System.out.print("kaça kadar toplasýn");
			int sonsay= input.nextInt();
			while(i<=sonsay) {
				toplam += i;
				i++;
			}
			System.out.println("toplam:"+toplam);
		}
		
	}
	


	
	public static void main5(String[] args) {
		int i=0;
		while(i<10) {
			System.out.println("Merhaba Kerim Kýlýç ");
			i++;
		}
	}
	
	public static void main4(String[] args) {
		int menu=3;
		int deger = (menu==4)? 22:24;
		System.out.println("Deðer "+deger);
	}
	public static void main3(String[] args) {
		int deger1=10,deger2=10;
		if(deger1==deger2) {
			System.out.println("2 Deðer Birbirine eþit");
		}
		int deger3=10,deger4=11;
		if(deger3!=deger4) {
			System.out.println("2 Deðer Birbirine eþit Deðil ");
		}
		
		if(deger3<deger4) {
			System.out.println("Deðer3 küçüktür ");
		}
		
		int deger5=10,deger6=11;
		if(deger5<=deger6) {
			System.out.println("2 Deðer Birbirine eþit veya deðer 5 küçük ");
		}
		int deger7=12,deger8=11;
		if(deger7>deger8) {
			System.out.println("Deðer 7 Büyüktür ");
		}
		int deger9=12,deger10=11;
		if(deger9>=deger10) {
			System.out.println("2 Deðer Birbirine eþit veya deðer 0 Büyüktür ");
		}
	}
	public static void main2(String[] args) {
		int deger=10;
		deger= +15;
		System.out.println("Deðer +:"+deger);
		
		deger = -deger;
		System.out.println("Deðer -:"+deger);	

		
		deger++;
		System.out.println("Deðer ++:"+deger);	
	
		deger--;
		System.out.println("Deðer --:"+deger);	
	}
	
	
	public static void main1(String[] args) {
		int deger1=300,deger2=15;
		
		int toplama = deger1+deger2;
		int cikarma= deger1-deger2;
		int carpma = deger1*deger2;
		int bolme = deger1/deger2;
		int mod = deger1 %deger2;
		
		System.out.println("Toplama: "+toplama);
		System.out.println("Çýkarma: "+cikarma);
		System.out.println("Çarpma: "+carpma);
		System.out.println("Bölme: "+bolme);
		System.out.println("Mod: "+mod);
	}

}
