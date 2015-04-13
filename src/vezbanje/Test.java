package vezbanje;

import linearnestrukture.dinamicke.dslista.CvorDSListe;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Vezba vb = new Vezba();
			CvorDSListe cvor1=null;
			CvorDSListe cvor2=null;
			CvorDSListe cvor3=null;
			CvorDSListe cvor4=null;
			CvorDSListe cvor5=null;
			CvorDSListe cvor6=null;
			
			
			cvor1 = new CvorDSListe(0, cvor5, cvor2);
			System.out.println(""+cvor1.toString());
			cvor2 = new CvorDSListe(6, cvor1, cvor3);
			System.out.println(""+cvor2.toString());
			cvor3 = new CvorDSListe(5, cvor2, cvor4);
			cvor4 = new CvorDSListe(6, cvor3, cvor5);
			cvor5 = new CvorDSListe(0, cvor4, cvor1);
		//	CvorDSListe cvor1 = new CvorDSListe(p, pret, sled);
			CvorDSListe neki = cvor4;
			
			try {
				if(vb.proveriDaLiJePalindorm(neki)){
					System.out.println("Da");
				}else{System.out.println("ne");}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
