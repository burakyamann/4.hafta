import javax.swing.plaf.synth.SynthSeparatorUI;

public class sinif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ogr = "";
		String[] ad = { "ali", "veli", "mehmet" };
		String[] soyad = { "aktar", "tek", "ekici" };
		int[] kilo = { 70, 40, 80 };
		boolean[] ogrenci = { true, false, false };

		for (int i = 0; i < ad.length; i++) {
			if (ogrenci[i] == true) {
				ogr = "öðrenci";
			} else {

				ogr = "öðrenci deðil";
			}

			System.out.println(ad[i] + " | " + soyad[i] + "|" + kilo[i] + "|" + ogr);

		}

	}

}
