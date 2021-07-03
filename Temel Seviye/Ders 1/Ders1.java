
public class Ders1 {

	public static void main (String[] args) {
	
		
		String stringDeger = "Merhaba ben Kerim";
		String stringDeger1=stringDeger.replace("Merhaba","Hi");
		stringDeger1=stringDeger1.replace("ben","I am");
		stringDeger1=stringDeger1.replace("Kerim","Yunus");
		System.out.println(stringDeger1);
		
		System.out.println("Replace()" + stringDeger.replace("Merhaba","Hi"));
		System.out.println("Replace()" + stringDeger.replace("ben","I am"));
		
		System.out.println("");
		boolean durum1=stringDeger.equals("Merhaba ben Kerim");
		System.out.println("Durum 1 : "+ durum1);
		
		boolean durum2=stringDeger.equals("merhaba ben Kerim");
		System.out.println("Durum 2 : "+ durum2);
		
		boolean durum3=stringDeger.equalsIgnoreCase("merhaba ben kerim");
		System.out.println("Durum 3 : "+ durum3);
		
		String[] stringDegerler= stringDeger.split(" ");
		System.out.println("1.Kelime "+ stringDegerler[0]);
		System.out.println("2.Kelime "+ stringDegerler[1]);
		System.out.println("3.Kelime "+ stringDegerler[2]);
		
		System.out.println("Kelime uzunluğu "+ stringDeger.length());
	}
	
	
	public static void mainString2 (String[] args) {
		String stringDeger = new String("Merhaba ben Kerim");
		char charDeger = stringDeger.charAt(9);
		
		System.out.println("charAt()"+charDeger);
		
		String substringDeger= stringDeger.substring(8);
		
		System.out.println("1) substring()"+substringDeger);
		
		String substringDeger1= stringDeger.substring(8,15);
		
		System.out.println("2) substring()  "+substringDeger1);
		
		System.out.println("toUpperCase() "+stringDeger.toUpperCase());
		System.out.println("toLowerCase() "+stringDeger.toLowerCase());
	}
	
	
	public static void mainString1(String[] args) {
		//char[] chars= {'M','e','r','h','a','b','a'};
		//String stringDeger = new String(chars);
		//bu bir konsola yazıdrma komutudur
		//System.out.println(stringDeger);
		
		String stringDeger="merhaba";
		System.out.println(stringDeger);
	}
	
	
	public static void mainVariablesType(String[] args) {
		byte byteDeger = 4;
		short shortDeger =7;
		int integerDeger =234;
		long longDeger = 12332;
		
		float floatDeger= 34.5f;
		double doubleDeger = 345.2;
		
		char charDeger1 = 65;
		char charDeger2 = 'A';
		
		boolean dogruDeger= true;
		boolean yanlisDeger= false;
		
		System.out.println("Byte Değer: "+ byteDeger);
		System.out.println("Short Değer: "+ shortDeger);
		System.out.println("Integer Değer: "+ integerDeger);
		System.out.println("Long Değer: "+ longDeger);
		
		System.out.println("Float Değer: "+ floatDeger);
		System.out.println("Double Değer: "+ doubleDeger);
		
		System.out.println("Char Değer 1: "+ charDeger1);
		System.out.println("Char Değer 2: "+ charDeger2);
		
		System.out.println("Boolean Doğru: "+ dogruDeger);
		System.out.println("Boolean Yanlış: "+ yanlisDeger);
	}

}
