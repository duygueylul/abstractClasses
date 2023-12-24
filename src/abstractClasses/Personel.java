package abstractClasses;

public abstract class Personel {
	
	static final String sİsmi = "Yıldız Çelik";
	static final String sAdres = "İstanbul/Türkiye";
	
	
	
	protected String ad = "Değer Girilmemiş";
	protected String soyad = "Değer Girilmemiş";
	protected String tcNo = "Değer Girilmemiş";
	protected String tel = "Değer Girilmemiş";
	protected String bTarih = "Değer Girilmemiş";
	protected String sigoratNo = "Değer Girilmemiş";
	static int persSayac = 1000;
	
	
	
	protected String persNo;
	
	protected String persNo() {
		persSayac++;
		String no = persSayac + " ";
		return no;
	}

}
