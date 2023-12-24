package abstractClasses;

public class Isci extends Muhasebe {
	

	@Override
	protected int saatUcreti() {
		return 10;
	}

	@Override
	protected int aylikCalismaSüresi() {
		return 200;
	}
	
	

	@Override
	public String toString() {
		return "Isci [saatUcreti=" + saatUcreti + ", aylikCalismaSüresş=" + aylikCalismaSüresş + ", maas=" + maas
				+ ", ad=" + ad + ", soyad=" + soyad + ", tcNo=" + tcNo + ", tel=" + tel + ", bTarih=" + bTarih
				+ ", sigoratNo=" + sigoratNo + ", persNo=" + persNo + "]";
	}

	public static void main(String[] args) {
		
		Isci i1 = new Isci();
		i1.ad = "Duygu";
		i1.soyad = "Eylül";
		System.out.println(i1);

	}

}
