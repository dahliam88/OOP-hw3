package BattleoftheIronThrone;

public class Casualties {


	public int menWomenChildren1(int a, int b, int c) {
		int total = a + b + c;
		return total;
	}
	
	public int menWomenChildren2(int a, int b, int c, int d) {
		int total = a + b + c + d;
		return total;
	}
	
	public static void lossesLannister() {
		System.out.println("\nHouse Lannister men, women, and children killed: ");
	}
	
	public static void lossesStark() {
		System.out.println("\nHouse Stark men, women, and children killed: ");
	}
	
}
