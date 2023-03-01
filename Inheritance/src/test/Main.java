package test;

public class Main {

	public static void main(String[] args) {
		Otomobil otomobil1 = new Otomobil("kırmızı", "çelik");
		Otomobil otomobil2 = new Otomobil();
		
		System.out.println(otomobil1.getRenk() + " " + otomobil1.getJant() + " " + otomobil1.getMarka());
		System.out.println(otomobil2.getRenk() + " " + otomobil2.getJant() + " " + otomobil2.getMarka());
		
		ElektrikliOtomobil elektrikliOtomobil = new ElektrikliOtomobil(59);
		elektrikliOtomobil.sarjiFullDoldur();		
		System.out.println(elektrikliOtomobil.getRenk() + " " + elektrikliOtomobil.getJant() + " "
				+ elektrikliOtomobil.getSarjDurumu());
		
		BenzinliOtomobil benzinliOtomobil = new BenzinliOtomobil(60);
		benzinliOtomobil.depoyuFullDoldur();
		System.out.println(benzinliOtomobil.getRenk() + " " + benzinliOtomobil.getJant() + " "
				+ benzinliOtomobil.getYakitDurumu());
		
		System.out.println(benzinliOtomobil.toString());
		
	}

}
