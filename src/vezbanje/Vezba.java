package vezbanje;

import linearnestrukture.*;
import linearnestrukture.dinamicke.dslista.CvorDSListe;


public class Vezba {
	
	public boolean proveriDaLiJePalindorm(CvorDSListe neki)throws Exception{
		if(neki==null)
			throw new Exception("Prazno");
		if(neki.prethodni==null && neki.sledeci==null)
			return true;
		int brojac=0;
		CvorDSListe kopija = neki;
		do {
			brojac++;
			System.out.println("broj "+kopija.podatak);
			kopija=kopija.sledeci;
		} while (!(kopija.equals(neki)));   //pitaj za atribute predhodni i sledeci //pitaj za ==
		CvorDSListe tmp1 = neki;
		CvorDSListe tmp2 = neki;
		int brojac2=0;
		for(int i=0;i<brojac;i++){
			if(brojac%2==1){
				if(tmp1.podatak==tmp2.podatak){	
					do {
						tmp2=tmp2.sledeci;
						brojac2++;
					} while (brojac2==brojac && (tmp1.podatak==tmp2.podatak));
				}
				tmp1=tmp1.sledeci;
			}
			if(brojac2==brojac)
				return true;
		}
		return false;
	}
}