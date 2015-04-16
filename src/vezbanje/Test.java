package vezbanje;

import linearnestrukture.dinamicke.dslista.CvorDSListe;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
			Vezba vb = new Vezba();
			CvorDSListe cvor1=null;
			CvorDSListe cvor2=null;
			CvorDSListe cvor3=null;
			CvorDSListe cvor4=null;
			CvorDSListe cvor5=null;
			CvorDSListe cvor6=null;
			
			
			cvor1 = new CvorDSListe(1, null, cvor2);
		
			cvor2 = new CvorDSListe(2, cvor1, cvor3);
			cvor3 = new CvorDSListe(3, cvor2, cvor4);
			cvor4 = new CvorDSListe(4, cvor3, cvor5);
			cvor5 = new CvorDSListe(5, cvor4, null);
		//	CvorDSListe cvor1 = new CvorDSListe(p, pret, sled);
			
			cvor1.sledeci=cvor2;
			//cvor1.prethodni=cvor5;
			cvor4.sledeci=cvor5;
			cvor4.prethodni=cvor3;
			//cvor5.sledeci=cvor1;
			cvor5.prethodni=cvor4;
			cvor3.sledeci=cvor4;
			cvor3.prethodni=cvor2;
			cvor2.prethodni=cvor1;
			cvor2.sledeci=cvor3;
			CvorDSListe neki = cvor4;
	/**		try {
				if(vb.proveriDaLiJePalindorm(neki)){
					System.out.println("Da");
				}else{System.out.println("ne");}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			
			vb.invertujDSListu(cvor1);
			System.out.println(""+cvor1.toString());
			System.out.println(""+cvor1.prethodni.toString());
			System.out.println(""+cvor1.prethodni.prethodni.toString());
			System.out.println(""+cvor1.prethodni.prethodni.prethodni.toString());
			System.out.println(""+cvor1.prethodni.prethodni.prethodni.prethodni. toString());
		//	System.out.println(""+vb.zbirDuplih(cvor1));
	}

}
