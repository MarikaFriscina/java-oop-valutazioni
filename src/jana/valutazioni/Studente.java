package jana.valutazioni;

public class Studente {

	int idStudente;
	int percentAssenze;
	double mediaVoti;
	
	public Studente(int idStudente, int percentAssenze, double mediaVoti) {
		super();
		this.idStudente = idStudente;
		this.percentAssenze = percentAssenze;
		this.mediaVoti = mediaVoti;
	}
	
	//50% di assenze boccito
	//tra 25 e 50%di assenze promosso solo se mediavoti>2
	//-di 25% assenze con mediavoti>=2
	public boolean isPromosso() {
		
		boolean promosso=false;
				
		if(percentAssenze>50) {
			promosso=false;
		}else if(percentAssenze>=25 && percentAssenze<=50) {			
			promosso=mediaVoti>2;			
		}else if(percentAssenze<25 && mediaVoti>=2) {
			promosso=true;
		}
				
		return promosso;
				
		//VERSIONE SEMPLIFICATA
		/*if(percentAssenze>50) {
			return false;
		}else if(percentAssenze>=25 && percentAssenze<=50) {			
				return mediaVoti>2.0;
		}else { 
			return mediaVoti>=2.0;
		}	*/	
		
		
	}
	 
}
