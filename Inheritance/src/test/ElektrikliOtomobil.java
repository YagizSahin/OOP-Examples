package test;

public class ElektrikliOtomobil extends Otomobil {

	private int sarjDurumu;
	
	public ElektrikliOtomobil(int sarjDurumu) 
	{
		super("Füme","Çelik");
		this.sarjDurumu=sarjDurumu;
	}
	
	public int getSarjDurumu() 
	{
		return sarjDurumu;
	}
	public void setSarjDurumu(int sarjDurumu) 
	{
		this.sarjDurumu=sarjDurumu;
	}
	public void sarjiFullDoldur() 
	{
		sarjDurumu=100;
	}
}
