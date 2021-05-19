import java.util.ArrayList;

public class Rada {
	private ArrayList<Kosticka> rada;
	
	public Rada() {
		rada = new ArrayList<>();
	}
	
	public boolean pridejZleva(Kosticka k) {
		if(rada.size()==0) { //v rade nebyla zadna kosticka
			rada.add(k);
			return true;
		}
		
		if(rada.get(0).getLeva() == k.getPrava()) {
			rada.add(0, k);
			return true;
		}
		
		k.otoc();
		
		if(rada.get(0).getLeva() == k.getPrava()) {
			rada.add(0, k);
			return true;
		}
		
		return false;
	}

	@Override
	public String toString() {
		return rada.toString();
	}
	
	
}
