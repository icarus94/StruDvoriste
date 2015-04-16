package vezbanje;

import linearnestrukture.*;
import linearnestrukture.dinamicke.dslista.CvorDSListe;
import linearnestrukture.dinamicke.jslista.CvorJSListe;
import linearnestrukture.staticke.StatickiStek;


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
			System.out.println("broj "+kopija.getPodatak());
			kopija=kopija.sledeci;
		} while (!(kopija==neki));   //pitaj za atribute predhodni i sledeci //pitaj za ==
		CvorDSListe tmp1 = neki;
		CvorDSListe tmp2 = neki;
		int brojac2=0;
		for(int i=0;i<brojac;i++){
				if(tmp1.podatak==tmp2.podatak){	
					do {
						tmp2=tmp2.prethodni;
						tmp1=tmp1.sledeci;
						brojac2++;
					} while ((tmp1.podatak==tmp2.podatak) && (brojac!=brojac2));
				}
				if(brojac2==brojac)
					return true;
				tmp1=tmp1.sledeci;
				brojac2=0;
		}
		return false;
	}
	
	/**
	 * 5.	Data je dvostruko spregnuta lista celih brojeva sortirana u rastućem redosledu i pokazivač p 
	 * koji pokazuje na prvi element u listi. Napisati metodu koja prebrojava koliko ima elemenata koji su veći
	 *  od proseka cele liste. (15 poena)
	 */
	public int prebrojiVeciOdProseka(CvorDSListe neki) throws Exception{
		if(neki==null)
			throw new Exception("Empty");
		if(neki.sledeci==null)
			return 0;
		int zbir=0;
		int brojac=0;
		CvorDSListe tmp1=neki;
		while(!(tmp1==null)){
			zbir=zbir+tmp1.podatak;
			brojac++;
			tmp1=tmp1.sledeci;
		}
		double zbirD = (double) zbir;
		double prosek = zbirD/brojac;
		int brojac2=0;
		tmp1=neki;
		while(!(tmp1==null)){
			double a = (double) tmp1.podatak; 
			if(a>prosek){
				brojac2++;
			}
			tmp1=tmp1.sledeci;
		}
		
		return brojac2;
	}
	
	
	/**
	 * 6.	Dati su pokazivač Glava, koji pokazuje na prvi element jednostruko spregnute liste celih brojeva, 
	 * i pokazivač Tekuci koji pokazuje na neki element liste. 
	 * Napisati metodu koja će izbaciti iz liste element koji je prethodnik elementa
	 *  na koga pokazuje pokazivač Tekuci, ako takav element postoji
	 */
	public CvorJSListe vratiPredhodnika(CvorJSListe prvi, CvorJSListe neki){
		if(prvi==null || neki==null)
			return null;
		if(prvi==neki)
			return null;  //null ili exception
		if(prvi.sledeci==neki){
			CvorJSListe tmp = prvi;
			prvi=neki;
			return tmp;
		}
		CvorJSListe tmp1=prvi;
		
		while(!(tmp1.sledeci.sledeci==neki)){
			tmp1=tmp1.sledeci;
		}
		CvorJSListe tmp2 =tmp1.sledeci;
		tmp1.sledeci=neki;
		return tmp2;
	}
	
	
	/**
	 *   2.	Od dve jednostruko spregnute liste celih brojeva koje su sortirane u rastućem redosledu 
	 *   (sa datim početnim pokazivačima) formirajte treću sortiranu u opadajućem redosledu. Date dve liste 
	 *   treba da ostanu kakve su bile (tj. ne menjaju se). 
	 */
	public CvorJSListe forimarjTrecu(CvorJSListe prvi1,CvorJSListe prvi2){
		if(prvi1==null && prvi2==null)
			return null;
		CvorJSListe prvi3 = null;
		CvorJSListe tmp = prvi1;
		CvorJSListe tmp1 = prvi1;
		CvorJSListe tmp2 = prvi2;
		int brojac1=0;
		int brojac2=0;
		while(tmp!=null){
			brojac1++;
			tmp=tmp.sledeci;
		}
		tmp=prvi2;
		while(tmp!=null){
			brojac2++;
			tmp=tmp.sledeci;
		}
		for(int i=0;i<brojac1+brojac2;i++){
			if(tmp1.podatak<tmp2.podatak && tmp1!=null){
				prvi3 = new CvorJSListe(tmp1.podatak, prvi3);
				tmp1=tmp1.sledeci;
			}
			if(tmp2.podatak<=tmp1.podatak && tmp2!=null){
				prvi3 = new CvorJSListe(tmp2.podatak, prvi3);
				tmp2=tmp2.sledeci;
			}
		}
		
		return prvi3;
	}
	/**
	 * 1.	Recite da li postoji slučaj kada je binarno pretraživanje brže od interpolacionog pretraživanja. Objasnite ga. (10 poena)
	 * 3.	Napisati funkciju transformisi(STAK s1, STAK* s2) koja će od staka koji je implementiran kao jednostruko spregnuta lista 
	 * formirati novi stak koji je implementiran preko niza. (20 poena)
	 * 3.	Dat je red celih brojeva r1. Napisati funkciju Inv(Red r1, Red r2) koja će  napraviti novi red r2 koji je inverzan datom redu.
	 *  Po završetku algoritma početni red treba da ostane nepromenjen. Nije dozvoljeno korišćenje nikakvih pomoćnih struktura! Moguće je 
	 *  korišćenje samo sledećih operacija nad redom: Ubaci(int), int Izbaci() i boolean Prazan().
	 * 
	 * 
	 * 2.	Napisati iterativni algoritam za binarno pretraživanje niza celih brojeva sortiranog u rastućem redosledu.
	 * 
	 * 
	 * 
	 * 1.	Dat je pokazivač na neki čvor dvostruko spregnute liste. Napisati funkciju za ubacivanje novog elementa pre datog pokazivača. Zanemariti pokazivače Head i Tail.
(12 poena)

2.	Dat je pokazivač na vrh staka celih brojeva, koji je implementiran kao jednostruko spregnuta lista. Napisati funkciju int Prebroj(CvorListe Vrh) koja će vratiti koliko elemenata staka ima vrednost veću od elementa na vrhu staka.
(12 poena)

3.	Data je dvostruko spregnuta (DS) lista čiji su elementi čvorova pokazivači na početak jednostruko spregnute (JS) liste. Napisati klasu koja opisuje čvor ovakve DS liste, a zatim napisati algoritam za ubacivanje novog elementa u ovako definisanu strukturu, koji funkcioniše po sledećem principu: kreće se od početka DS liste. Ako je element koji se ubacuje manji od prvog elementa JS liste trenutnog čvora DS liste, onda se taj element ubacuje na kraj te JS liste. U suprotnom, prelazi se na sledeći čvor DS liste i algoritam se ponavlja. Ako se stigne do kraja DS liste, onda se kreira novi čvor i u njegovu JS listu se ubacuje novi element. Početna metoda prihvata pokazivač na početak DS liste i ceo broj koji se ubacuje.
(16 poena)
	 * @throws Exception 


	 *
	 *
	 */
	/**
	 * Sa casa INVERTUJ METODA
	 * @param prvi
	 * @throws Exception
	 */
	public void invertujDSListu(CvorDSListe prvi) throws Exception{
		if(prvi==null)
			throw new Exception("Prazan");
		if(prvi.sledeci==null)
			return;
		int brojac=0;
		CvorDSListe tmp=prvi;
		while(tmp.sledeci!=null){
			brojac++;           //nece biti sracunat poslenji cvor
			tmp=tmp.sledeci;
		}
		for(int i=0;i<=brojac;i++){
			CvorDSListe a = tmp.sledeci;
			CvorDSListe b = tmp.prethodni;
			tmp.sledeci=b;
			tmp.prethodni=a;
			tmp=tmp.sledeci;
		}
	}
	
	public void invertuj2(CvorDSListe prvi)throws Exception{
		if(prvi==null)
			throw new Exception("Prazan");
		if(prvi.sledeci==null)
			return;
		while(prvi.sledeci!=null)
			prvi=prvi.sledeci;
		do{
			prvi=prvi.prethodni;
			prvi.sledeci.prethodni=prvi.sledeci.sledeci;
			prvi.sledeci.sledeci=prvi;
			
		}while(prvi.prethodni!=null);
		prvi.prethodni=prvi.sledeci;
		prvi.sledeci=null;
	}
	
	/**1.	Dat je pokazivač na neki čvor jednostruko spregnute ciklične liste. Napisati funkciju int Count(CvorDListe cvor) koja prebrojava koliko ima elemenata 
	 * liste koji su veći od elementa u datom čvoru (cvor.podatak). Ne koristiti pokazivače Head i Tail već samo dati pokazivač cvor.
	 */
	public int Count(CvorJSListe cvor)throws Exception{
		if(cvor==null)
			throw new Exception();
		CvorJSListe tmp =  cvor;
		int brojac=0;
		do{
			if(cvor.podatak<tmp.podatak)
				brojac++;
			tmp=tmp.sledeci;
		}while(cvor!=tmp);
		return brojac;
	}
	
	/**
	 * 3.	Dat je stack celih brojeva. Napisati funkciju koja će ispisati sadržaj staka u obrnutom redosledu. Nije dozvoljeno korišćenje nikakvih
	 *  pomoćnih struktura! Moguće je korišćenje samo operacija nad stakom: Ubaci(int), int Izbaci() i boolean Prazan(). Po završetku operacije početni 
	 *  stak treba da ostane nepromenjen.
	 */
	public void ispisi(StatickiStek a)throws Exception{
		if(a==null)
			throw new Exception("Prazan");
		int tmp = a.pop();
		ispisi(a);
		System.out.println(""+a);
		a.push(tmp);
	}
	
	public int zbirDuplih(CvorDSListe prvi)throws Exception{
		if(prvi==null)
			throw new Exception("Empty");
		if(prvi.sledeci==null)
			return 0;
		CvorDSListe zaBr =prvi;
		CvorDSListe tmp1 =prvi;
		CvorDSListe tmp2 =prvi;
		CvorDSListe tmp3 =prvi;
		int zbir=0;
		int brojac=0;
		while(zaBr!=null){
			brojac++;
			zaBr=zaBr.sledeci;
		}
		for(int i=0;i<brojac;i++){
			tmp2=tmp1.sledeci;
			tmp3=tmp1.prethodni;
			int brojac2=0;
			boolean dal=true;
			for(int z=i;z>0;z--){
				if(tmp1.podatak==tmp3.podatak)
					dal=false;
				tmp3=tmp3.prethodni;
			}
			if(dal==true){
				for(int j=i;j<brojac-1;j++){
					if(tmp2.podatak==tmp1.podatak){
						brojac2++;
					}
					tmp2=tmp2.sledeci;
				}
			}
			if(brojac2==1)
				zbir=zbir+tmp1.podatak;
			tmp1=tmp1.sledeci;
		}
		return zbir;
		
	}
}