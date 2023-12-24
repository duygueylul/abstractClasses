package abstractClasses;

public abstract class Muhasebe extends Personel {
	
	protected int saatUcreti;
	protected int aylikCalismaSüresş;
	protected int maas;
	
	
	protected abstract int saatUcreti();
	protected abstract int aylikCalismaSüresi();
	
	
	
	protected int maas(int saaatUcreti, int aylikCalismaSuresi) {
		int maas = saatUcreti * aylikCalismaSuresi;
		return maas;
	}

}
