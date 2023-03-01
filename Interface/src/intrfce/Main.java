package intrfce;


	
public class Main {
	public static void hesapBilgileriGoster(IHgs arac) 
	{
		System.out.println(arac.plakaSorgula()+" "+arac.bakiyeSorgula());
	}

	public static void main(String[] args) {
		Otomobil myOto= new Otomobil("60 NH 888", 100);
		Kamyon myKamyon= new Kamyon("60 NN 626", 200);
		//System.out.println(myOto.plakaSorgula()+" "+myOto.bakiyeSorgula());
		//System.out.println(myKamyon.plakaSorgula()+" "+myKamyon.bakiyeSorgula());
		hesapBilgileriGoster(myKamyon);

	}

}
