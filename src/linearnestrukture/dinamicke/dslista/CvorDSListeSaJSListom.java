package linearnestrukture.dinamicke.dslista;

public class CvorDSListeSaJSListom {
	
	public  int podatak;

	// "pokazivac" na prethodni cvor u listi
	public  CvorDSListe prethodni;

	// "pokazivac" na sledeci cvor u listi
	 public  CvorDSListe sledeci;

	/**
	 * Konstruktor. Prihvata i postavlja sve elemente cvora.
	 * 
	 * @param p Podatak koji se cuva u cvoru.
	 * @param pret Pokazivac na prethodni element liste
	 * @param sled Pokazivac na sledeći element za cvor koji se kreira
	 * 
	 */
	public CvorDSListeSaJSListom(int p, CvorDSListe pret, CvorDSListe sled) {
		podatak = p;
		prethodni = pret;
		sledeci = sled;
	}

}
