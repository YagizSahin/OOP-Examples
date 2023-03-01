package test;

public class BenzinliOtomobil extends Otomobil {
	//private variable
	private int yakitDurumu;
	// one argument constructor
	public BenzinliOtomobil(int yakitDurumu) 
	{
		super("Siyah","Normal");
		this.yakitDurumu=yakitDurumu;
		
	}
	//getter method of YakitDurumu
	public int getYakitDurumu() 
	{
		return yakitDurumu;
	}// end of the method
	//setter method of YakitDurumu
	public void setYakitDurumu(int yakitDurumu) 
	{
		this.yakitDurumu=yakitDurumu;
	}// end of the method
	// a function that fulls the tank
	public void depoyuFullDoldur() 
	{
		yakitDurumu=100;
	}// end of the function
	
	// overriden toString method
	public String toString() {
		return "yakit durumu:" + yakitDurumu;
	}//end of the method
	
}
