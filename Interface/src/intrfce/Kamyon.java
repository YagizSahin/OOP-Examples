package intrfce;

public class Kamyon implements IHgs {
	String plaka;
	int bakiye;
	public Kamyon(String plaka, int bakiye) 
	{
		this.plaka=plaka;
		this.bakiye=bakiye;
	}
	@Override
	public int bakiyeSorgula() {
		return this.bakiye;
	}

	@Override
	public String plakaSorgula() {
		return this.plaka;
	}

}
