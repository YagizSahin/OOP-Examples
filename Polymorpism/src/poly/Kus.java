package poly;

public class Kus extends Hayvan {

	public Kus(String ad) {
		super(ad);
	
	}
	public void sesCikar() 
	{
		System.out.println(super.getAd()+" "+"cikliyor");
	}

}
