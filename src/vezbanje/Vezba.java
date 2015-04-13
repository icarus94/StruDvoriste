package vezbanje;

import linearnestrukture.*;
import linearnestrukture.dinamicke.dslista.CvorDSListe;
import linearnestrukture.dinamicke.jslista.CvorJSListe;


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
	public CvorJSListe forimarjTrecu(CvorJSListe prviI,CvorJSListe prviII){
		if(prviI==null && prviII==null)
			return null;
		CvorJSListe prviIII = null;
		CvorJSListe tmp1 = prviI;
		CvorJSListe tmp2 = prviII;
		
		return prviIII;
	}
	/**
	 * 1.	Recite da li postoji slučaj kada je binarno pretraživanje brže od interpolacionog pretraživanja. Objasnite ga. (10 poena)
	 * 3.	Napisati funkciju transformisi(STAK s1, STAK* s2) koja će od staka koji je implementiran kao jednostruko spregnuta lista 
	 * formirati novi stak koji je implementiran preko niza. (20 poena)
	 * 3.	Dat je red celih brojeva r1. Napisati funkciju Inv(Red r1, Red r2) koja će  napraviti novi red r2 koji je inverzan datom redu.
	 *  Po završetku algoritma početni red treba da ostane nepromenjen. Nije dozvoljeno korišćenje nikakvih pomoćnih struktura! Moguće je 
	 *  korišćenje samo sledećih operacija nad redom: Ubaci(int), int Izbaci() i boolean Prazan().
	 * 
	 * 3.	Dat je stack celih brojeva. Napisati funkciju koja će ispisati sadržaj staka u obrnutom redosledu. Nije dozvoljeno korišćenje nikakvih
	 *  pomoćnih struktura! Moguće je korišćenje samo operacija nad stakom: Ubaci(int), int Izbaci() i boolean Prazan(). Po završetku operacije početni 
	 *  stak treba da ostane nepromenjen.
	 * 2.	Napisati iterativni algoritam za binarno pretraživanje niza celih brojeva sortiranog u rastućem redosledu.
	 * 
	 * 1.	Dat je pokazivač na neki čvor jednostruko spregnute ciklične liste. Napisati funkciju int Count(CvorDListe cvor) koja prebrojava koliko ima elemenata 
	 * liste koji su veći od elementa u datom čvoru (cvor.podatak). Ne koristiti pokazivače Head i Tail već samo dati pokazivač cvor.
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
		while(tmp.sledeci==null){
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
	
	
}