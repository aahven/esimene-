package praktikum2;

import javax.swing.plaf.synth.SynthSeparatorUI;

import lib.TextIO;

public class GrupiSuurus {

	public static void main(String[] args) {
		System.out.println("Palju inimesi on grupis ?");
		int inimesteArv = TextIO.getlnInt();

		System.out.println("Kui suured on grupid ");
		int grupiSuurus = TextIO.getlnInt();

	
		int gruppideArv = inimesteArv / grupiSuurus;
		System.out.println("Saame moodustada  " + gruppideArv + " gruppi");
		
		int j22k = inimesteArv % grupiSuurus;
		System.out.println("Üle jääb " + j22k );
	}

}
