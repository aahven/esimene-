package praktikum2;

import javax.swing.plaf.synth.SynthSeparatorUI;

import lib.TextIO;

public class Arvutus2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Sisesta üks arv");
		int esimeneArv = TextIO.getlnInt();
				
	    System.out.println("Sisesta teine arv ");
		int teineArv = TextIO.getlnInt();
		
		
		int arvudeSumma = esimeneArv * teineArv;
		System.out.println("Summa " + arvudeSumma );
	}

}
