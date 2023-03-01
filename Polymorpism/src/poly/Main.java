package poly;

public class Main {

	public static void hayvaniKonustur(Hayvan hayvan) 
	{
		hayvan.sesCikar();
	}
	public static void main(String[] args) {
		
		Kedi kedi1 = new Kedi("pamuk");
		Kopek kopek1 = new Kopek("findik");
		Kus kus1 = new Kus("kanarya");
		hayvaniKonustur(kus1);
		hayvaniKonustur(kopek1);
		hayvaniKonustur(kedi1);
		
		/*
		hayvan1.sesCikar();
		kedi1.sesCikar();
		kopek1.sesCikar();
		kus1.sesCikar();
	*/
	}

}
