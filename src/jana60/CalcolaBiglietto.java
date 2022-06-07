package jana60;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		DecimalFormat f = new DecimalFormat("#.##");
		Scanner scan = new Scanner(System.in);
		double km;
		int age;
		double scontoPrezzo;
		double prezzoFinale;
		double prezzokm;
		System.out.print("Salve, inserisci i kilometri che desideri effettuare nella prossima corsa: ");
		km = scan.nextInt();
		System.out.print("Inserisci la tua etá: ");
		age = scan.nextInt();
		prezzokm = km * (0.21);
		
		
		
		if (age<18 ){
			scontoPrezzo = prezzokm * 0.20;
			prezzoFinale = prezzokm - scontoPrezzo;
			String prezzoArrotondato = f.format(prezzoFinale);
			System.out.println("Congratulazioni, lo sconto é del " + scontoPrezzo + "€" + " mentre il prezzo finale da pagare é " + prezzoArrotondato + "€" );
		}
		else if(age>65) {
			scontoPrezzo = prezzokm * 0.40;
			prezzoFinale = prezzokm - scontoPrezzo;
			String prezzoArrotondato = f.format(prezzoFinale);
			System.out.println("Congratulazioni, lo sconto é del " + scontoPrezzo + "€" + " mentre il prezzo finale da pagare é " + prezzoArrotondato + "€" );
			
		}
		else {
			prezzoFinale = prezzokm;
			String prezzoArrotondato = f.format(prezzoFinale);
			System.out.println("Mi dispiace, non ha diritto a nessun sconto, deve pagare " + prezzoArrotondato  + "€");
		}
		
		scan.close();
	}

}
