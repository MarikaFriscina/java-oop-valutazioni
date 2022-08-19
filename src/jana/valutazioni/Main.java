package jana.valutazioni;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//creo array studenti vuoto

		System.out.println("Quanti alunni nella classe?");
		
		Scanner scan=new Scanner(System.in);
		int numStud;
		numStud=Integer.parseInt(scan.nextLine());
		
		Studente[] studenti=new Studente[numStud];
		
		//per ogni posizione dell'array chiedo i dati
		for(int i=0;i<studenti.length;i++) {
			
			int idStudente= i+1;
			System.out.println("Dati dello studente "+idStudente+":");
			System.out.println("Percentuale assenze: ");
			int percAssenze= Integer.parseInt(scan.nextLine());
			System.out.println("Media voti: ");
			double mediaVoti= Double.parseDouble(scan.nextLine());
			
			studenti[i]= new Studente(idStudente,percAssenze,mediaVoti);
		}
		
		//per ogni studente controllo se è promosso o bocciato
		
		for(int i=0;i<studenti.length;i++) {
			System.out.println("Lo studente "+ studenti[i].idStudente);
			
			if(studenti[i].isPromosso()) {
				System.out.println("E' promosso.");
			}else {
				System.out.println("E' bocciato");
			}
		}
		
		scan.close();

	}

}
