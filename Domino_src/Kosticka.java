
public class Kosticka {
	private int leva;
	private int prava;
	
	public Kosticka(int leva, int prava) {
		this.setLeva(leva);
		this.setPrava(prava);
	}

	@Override
	public String toString() {
		return "["+ getLeva() + "|" + getPrava() + "]";
	}
	
	public void otoc() {
		int pomoc = getLeva();
		setLeva(getPrava());
		setPrava(pomoc);
	}

	public int getLeva() {
		return leva;
	}

	public void setLeva(int leva) {
		this.leva = leva;
	}

	public int getPrava() {
		return prava;
	}

	public void setPrava(int prava) {
		this.prava = prava;
	}

}
