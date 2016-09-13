package praktikum2;

import lib.TextIO;

public class nimePikkus {

	public static void main(String[] args) {
		
		System.out.println("Mis on sinu nimi");
		String nimi = TextIO.getlnString();
		
		String nimi = "Kalle";
		int nimePikkus = nimi.length();
		System.out.println(nimePikkus);
		System.out.println("neli".length());
	}

}
