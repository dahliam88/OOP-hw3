package BattleoftheIronThrone;

public class CompetitorDescriptions extends BattleofThrone implements Competitors {

	public void Daenerys() {
		System.out.println("\nDaenerys is from House Targaryen and is The Mother of Dragons");
	}
	public void Cersei() {
		System.out.println("\nCersei is from House Lannister and is The Evil Queen");
	}
	public void Jon() {
		System.out.println("\nJon is from House Stark and is The King of the North");
	}
	
	public void startBattle() {
		System.out.println("Battle Begins with Daenerys, Jon and Cersei!");
	}
	
	public void stopBattle() {
		System.out.println("\nBattle Ends, Daenerys Targaryen wins!");
	}
	
//encapsulation
	private String killed;
	private String missing;
	private String captured;
	private String wounded;
	
	public String getKilled() {
		return killed;
	}
	public void setKilled(String killed) {
		this.killed = killed;
	}
	public String getMissing() {
		return missing;
	}
	public void setMissing(String missing) {
		this.missing = missing;
	}
	public String getCaptured() {
		return captured;
	}
	public void setCaptured(String captured) {
		this.captured = captured;
	}
	public String getWounded() {
		return wounded;
	}
	public void setWounded(String wounded) {
		this.wounded = wounded;
	}

}
