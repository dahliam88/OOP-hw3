package BattleoftheIronThrone;

public class TestBattle extends Casualties {

	public static void main(String[] args) {
		
		CompetitorDescriptions competitorDescriptions = new CompetitorDescriptions();
		competitorDescriptions.startBattle();
		competitorDescriptions.Daenerys();
		BattleofThrone.dragons();
		
		competitorDescriptions.Jon();
		BattleofThrone.courage();
		
		competitorDescriptions.Cersei();
		BattleofThrone.vengeance();
		
		competitorDescriptions.stopBattle();
		
		//encapsulation
			competitorDescriptions.setKilled("70 Killed,");
			competitorDescriptions.setWounded("34 Wounded,");
			competitorDescriptions.setCaptured("3 Captured,");
			competitorDescriptions.setMissing("6 Missing");
			
			System.out.println(competitorDescriptions.getKilled()+" "+competitorDescriptions.getWounded()+" "+competitorDescriptions.getCaptured()+" "+competitorDescriptions.getMissing());			
		
			
			
		//polymorphism - I cannot get it to work whenI press run
		Casualties calculate = new Casualties ();

		Casualties.lossesLannister();
		int menWomenChildren1 = calculate.menWomenChildren1(200, 60, 25);
		System.out.println(menWomenChildren1);	
		
		Casualties.lossesStark();
		int menWomenChildren2 = calculate.menWomenChildren2(97,40, 5, 5);
		System.out.println(menWomenChildren2);	
	}
	
	
}
	

