package ba.unsa.etf.si.JUnitPrimjer;


public class Razlomak {
	int brojnik, nazivnik;
	
	Razlomak () {
		brojnik = nazivnik = 1;
	}
	
	Razlomak (int b) {
		brojnik = b;
		nazivnik = 1;
	}
	
	Razlomak (int b, int n) throws Exception {
		if (n==0) throw new Exception("Nazivnik ne moze biti nula");
		brojnik=b; nazivnik=n;
		skrati();
	}
	
	public void skrati() {
		if (nazivnik<0) {
			// predznak cemo uvijek drzati u brojniku
			brojnik=-brojnik; nazivnik=-nazivnik; 
		}
		int min = Math.abs(brojnik); //min = 5
		if (nazivnik<min) min=nazivnik; //min = 5
		
		for (int i=min; i>2; i--) { //i=5 i>2 i--
			if (brojnik%i==0 && nazivnik%i==0) {
				brojnik /= i; //1
				nazivnik /= i; //4
			}
		}
	}
	
	Razlomak zbir(Razlomak r) {
		int naz = nazivnik*r.nazivnik;
		int bro = brojnik*r.nazivnik + r.brojnik*nazivnik;
		Razlomak rez;
		try {
			rez = new Razlomak(bro,naz);
		} catch(Exception e) {
			// Nemoguce jer nazivnik niti jednog od razlomaka nije nula
			rez = new Razlomak();
		}
		return rez;
	}
	
	Razlomak negacija() {
		Razlomak rez;
		try {
			rez = new Razlomak(-brojnik,nazivnik);
		} catch(Exception e) {
			// Nemoguce jer nazivnik nije nula
			rez = new Razlomak();
		}
		return rez;
	}

	Razlomak razlika(Razlomak r) {
		return zbir(r.negacija());
	}
	
	Razlomak proizvod(Razlomak r) {
		int bro = brojnik*r.brojnik;
		int naz = nazivnik*r.nazivnik;
		Razlomak rez;
		try {
			rez = new Razlomak(bro,naz);
		} catch(Exception e) {
			// Nemoguce jer nazivnik niti jednog od razlomaka nije nula
			rez = new Razlomak();
		}
		return rez;
	}
	
	Razlomak reciprocni() {
		Razlomak rez;
		try {
			rez = new Razlomak(nazivnik,brojnik); 
		} catch(Exception e) {
			// Nemoguce jer nazivnik nije nula
			rez = new Razlomak();
		}
		return rez;		
	}
	
	Razlomak kolicnik(Razlomak r) {
		return proizvod(r.reciprocni());
	}
	
	String ispisi() {
		return new String(brojnik + "/" + nazivnik);
	}
	
	public static void main(String[] args) {
		try {
			Razlomak r = new Razlomak(6,18);
			System.out.println(r.ispisi());
		} catch(Exception e) {
			System.out.print("IZUZETAK: "+e.getMessage());
		}
	}
}
