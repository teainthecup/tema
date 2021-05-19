import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Hrac h = new Hrac("karel");
		h.novaHra(5);
		System.out.println(h);
		Rada novaRada = new Rada();
		do {
		System.out.print("Zadej poradovecislo kosticky, kterou chces vlozit do rady: ");
		int cislo = sc.nextInt();
		Kosticka schovana = h.vezmiKosticku(cislo);
		boolean slaPridat = novaRada.pridejZleva(schovana);
		if(!slaPridat) {//pokud kosticka nesla pridat vratim zpatky
			h.novaKosticka(schovana);
		}
		
		System.out.println(novaRada);
		System.out.println(h);
		}while(true);
		
		
		
	}

}
