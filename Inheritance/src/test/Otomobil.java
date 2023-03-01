package test;

public class Otomobil {
	private String renk;
	private String jant;
	private String marka="Audi";
	public Otomobil(String renk, String jant) 
	{
		this.renk=renk;
		this.jant=jant;
	}
	public Otomobil() 
	{
		this("Beyaz","Normal");
	}
	public void setRenk(String rnk) 
	{
		this.renk=rnk;
	}
	public String getRenk() 
	{
		return this.renk;
	}
	public void setJant(String jnt) 
	{
		this.jant=jnt;
	}
	public String getJant() 
	{
		return this.jant;
	}
	public String getMarka() 
	{
		return this.marka;
	}
}
