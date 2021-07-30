package Hesap;

public class Hesap {
	
	public static int toplama(int sayi1,int sayi2) {
		
		int sonuc=sayi1+sayi2;
		
		return sonuc;
	}
	public static int toplama2(int[] sayiListesi) {
			
			int sonuc=0;
			for(int sayi:sayiListesi) {
				sonuc += sayi;
			}
			
			return sonuc;
		}
	public static int carpma2(int[] sayiListesi) {
		
		int sonuc=1;
		for(int sayi:sayiListesi) {
			sonuc *= sayi;
		}
		
		return sonuc;
	}
	public static int cikarma(int sayi1,int sayi2) {
		
		int sonuc=sayi1-sayi2;
		
		return sonuc;
	}
	
	public static int cikarma2(int sayi1,int sayi2) {
		
		if(sayi1>sayi2) {
			return cikarma(sayi1,sayi2);
		}else {
			System.out.println(sayi1 + " küçüktür "+ sayi2 + "'den");
			return cikarma(sayi2,sayi1);
		}
	
	}
	public static int carpma(int sayi1,int sayi2) {
		
		int sonuc=sayi1*sayi2;
		return sonuc;
	}
	public static int bolme(int sayi1,int sayi2) {
		
		if(sayi2==0) {
			System.out.println("Bölen Sýfýra Eþit Olamaz");
			return -1;
		}else {
			int sonuc=sayi1/sayi2;
			return sonuc;
		}
		
	}
	
	
	
	
	
	//float
	public static float toplama(float sayi1,float sayi2) {
		
		float sonuc=sayi1+sayi2;
		
		return sonuc;
	}
	public static float toplama2(float[] sayiListesi) {
		
		float sonuc=0;
		for(float sayi:sayiListesi) {
			sonuc += sayi;
		}
		
		return sonuc;
	}
	public static float carpma2(float[] sayiListesi) {
		
		float sonuc=1;
		for(float sayi:sayiListesi) {
			sonuc *= sayi;
		}
		
		return sonuc;
	}
	public static float cikarma(float sayi1,float sayi2) {
		
		float sonuc=sayi1-sayi2;
		
		return sonuc;
	}
	
	public static float cikarma2(float sayi1,float sayi2) {
		
		if(sayi1>sayi2) {
			return cikarma(sayi1,sayi2);
		}else {
			System.out.println(sayi1 + " küçüktür "+ sayi2 + "'den");
			return cikarma(sayi2,sayi1);
		}
	
	}
	public static float carpma(float sayi1,float sayi2) {
		
		float sonuc=sayi1*sayi2;
		return sonuc;
	}
	public static float bolme(float sayi1,float sayi2) {
		
		if(sayi2==0) {
			System.out.println("Bölen Sýfýra Eþit Olamaz");
			return -1;
		}else {
			float sonuc=sayi1/sayi2;
			return sonuc;
		}
		
	}
	public static void kdvHesapla(float fiyat,float kdvOran,boolean kdvDahil) {
		if(kdvDahil) {
			
			float kdv=carpma(bolme(fiyat,toplama(100.0f,kdvOran)),kdvOran);
			System.out.println("Kdv Hariç Fiyat ="+(fiyat-kdv));
			System.out.println("Kdv Fiyatý ="+kdv);
		}else {
			float kdv=carpma(bolme(fiyat,100.0f),kdvOran);
			System.out.println("Kdv Dahil Fiyat ="+(fiyat+kdv));
			System.out.println("Kdv Fiyatý ="+kdv);

		}
		
	}
	

}
