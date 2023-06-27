import java.util.ArrayList;

public class Main {

			public static void main(String[] args) {
				 ergasiaepiskeyhs erg1= new ergasiaepiskeyhs("Αλλαγή λαδιών", 20);
				 ergasiaepiskeyhs erg2= new ergasiaepiskeyhs("Αλλαγή φίλτρου καμπίνας", 5);
				 ergasiaepiskeyhs erg3= new ergasiaepiskeyhs("Συντήρηση φρένων", 30);

				 typosatallaktikoy antal1 = new typosatallaktikoy("Συσκευασία λαδιών 4lt", 30);
				 typosatallaktikoy antal2 = new typosatallaktikoy("Φίλτρο λαδιού", 20);
				 typosatallaktikoy antal3 = new typosatallaktikoy("Φίλτρο καμπίνας", 30);
				 typosatallaktikoy antal4 = new typosatallaktikoy("Τακάκι φρένων εμπρός τροχού", 5);
				 typosatallaktikoy antal5 = new typosatallaktikoy("Τακάκι φρένων πίσω τροχού", 5);
				 typosatallaktikoy antal6 = new  typosatallaktikoy("Υγρό φρένων", 10);

				    fakelosepiskeywn fak1 = new fakelosepiskeywn();
				    fakelosepiskeywn fak2 = new fakelosepiskeywn();
				    
				    ArrayList<ergasiaepiskeyhs> ergasies = new ArrayList<ergasiaepiskeyhs>();
				    ergasies.add(erg1);
				    ergasies.add(erg2);
				    ergasies.add(erg3);
				    
				    ArrayList<typosatallaktikoy> antallakt = new ArrayList<typosatallaktikoy>();
				    antallakt.add(antal1);
				    antallakt.add(antal2);
				    antallakt.add(antal3);
				    antallakt.add(antal4);
				    antallakt.add(antal5);
				    antallakt.add(antal6);
				    
				    fak1.addErgasia(erg1);
				    fak1.addErgasia(erg2);
				    fak1.addAntallaktiko(antal1);
				    fak1.addAntallaktiko(antal2);
				    fak1.addAntallaktiko(antal3);
				    fak1.setWres(24);
				    

				    fak2.addErgasia(erg3);
				    fak2.addAntallaktiko(antal4);
				    fak2.addAntallaktiko(antal4);
				    fak2.addAntallaktiko(antal4);
				    fak2.addAntallaktiko(antal4);
				    fak2.addAntallaktiko(antal5);
				    fak2.addAntallaktiko(antal5);
				    fak2.addAntallaktiko(antal5);
				    fak2.addAntallaktiko(antal5);
				    fak2.addAntallaktiko(antal6);
				    fak2.setWres(48);
				    
				    

				    //printing 
				    System.out.println("Εργασίες:");
				    for(ergasiaepiskeyhs erg: ergasies) {
				    	erg.printData();
				    }
				     
				     
				     System.out.println("\n");
				     System.out.println("Ανταλλακτικά:");
				     for(typosatallaktikoy antal: antallakt) {
				    	 antal.printData1();
				     }
				     
				     System.out.println("\n");
				     System.out.println("Επισκευή 1:");
				     System.out.print("Η/οι μέρα/ες της εργασίας είναι ");
				     System.out.println((int)(fak1.getWres())/24+" και το κόστος είναι " +fak1.getTotalCost()+"€\n");
				     System.out.println("Επισκευή 2:");
				     System.out.print("Η/οι μέρα/ες της εργασίας είναι ");
				     System.out.println((int)(fak2.getWres())/24 +" και το κόστος είναι " +fak2.getTotalCost()+"€\n");
				    


	}

}
