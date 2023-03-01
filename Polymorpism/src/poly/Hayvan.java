package poly;

public abstract class Hayvan {
	private String ad;

	public Hayvan(String ad) 
	{
		super();
		this.ad = ad;
	}

	public String getAd() 
	{
		return ad;
	}

	public void setAd(String ad) 
	{
		this.ad = ad;
	}
	
	public abstract void sesCikar(); 
	
}
