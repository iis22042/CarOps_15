import java.util.ArrayList;

public class fakelosepiskeywn {
private double wres;
private ArrayList<ergasiaepiskeyhs> ektelesmenes_erg = new ArrayList<ergasiaepiskeyhs>();
private ArrayList<typosatallaktikoy> antal = new ArrayList<typosatallaktikoy>();//periexei kai to eidos kai to plithos
private float price;
private String plate;

//prosthetei thn ergasia ston fakelo
public void addErgasia(ergasiaepiskeyhs erg){
ektelesmenes_erg.add(erg);
}

//prosthetei ta antallaktika pou xrhsimopoihthkan ston fakelo
public void addAntallaktiko(typosatallaktikoy ant){
antal.add(ant);
}

public void setWres(double wres){
this.wres = wres;
}

public double getWres(){
return wres;
}

public float getTotalCost() {
	float sum=0;
	
	for (typosatallaktikoy antallaktiko : antal) {
      sum+= antallaktiko.getPriceAntal();
    }
	
	for (ergasiaepiskeyhs episkeyh : ektelesmenes_erg) {
	      sum+= episkeyh.getPriceErg();
	    }
	
	
	return sum;
	
	
}


 }