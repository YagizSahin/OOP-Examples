package poly;

public class Kedi extends Hayvan {

	public Kedi(String ad) {
		super(ad);
		
	}
	
	public void sesCikar() 
	{
		System.out.println(super.getAd() + " " + "miyavlıyor");
	}

}
