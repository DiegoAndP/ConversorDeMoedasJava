package br.com.alura.module;


public class ListaCotacao {
	private static double USDBRL = 5.00;
	private static double BRLUSD = 0.20;
	private static double EURBRL = 5.13;
	private static double BRLEUR = 0.19;
	private static double BRLGBP = 0.144260;
	private static double GBPBRL = 6.931950;
	
	public static double getBRLUSD() {
		return BRLUSD;
	}
	
	public static double getUSDBRL() {
		return USDBRL;
	}

	public static double getEURBRL() {
		return EURBRL;
	}

	public static double getBRLEUR() {
		return BRLEUR;
	}

	public static double getBRLGBP() {
		return BRLGBP;
	}

	public static double getGBPBRL() {
		return GBPBRL;
	}
	
}
