import java.util.ArrayList;
import java.util.Random;

public class Hrac {
	private String jmeno;
	private ArrayList<Kosticka> kosticky;
	private static Random generator = new Random();
	
	public Hrac(String jmeno) {
		this.jmeno = jmeno;
		this.kosticky = new ArrayList<Kosticka>();
	}
	
	public void novaKosticka(Kosticka k) {
		kosticky.add(k);
	}
	
	public void novaHra(int pocetKosticek) {
		for(int i = 0; i < pocetKosticek; i++) {
			this.novaKosticka(new Kosticka(generator.nextInt(6)+1,generator.nextInt(6)+1));
		}
	}

	@Override
	public String toString() {
		if(kosticky.size()==0) {
			return "Vsechny kosticky jiz byly pouzity.";
		}
		String cislovani = "";
		int poradi = 0;
		for(Kosticka k : kosticky) {
			cislovani += poradi+". "+k+"\n"; 
			poradi++;
		}
		return cislovani;
		//return kosticky.toString();//vyuziji toString() ArrayListu a toString() Kosticky
	}
	
	public int kolikKosticek() {
		return kosticky.size();
	}
	
	public Kosticka vezmiKosticku(int i) {
		if(kosticky.size()<=i || i<0) {
			return null;
		}
		Kosticka k = kosticky.get(i);
		kosticky.remove(i);
		return k;
	}
	

}
