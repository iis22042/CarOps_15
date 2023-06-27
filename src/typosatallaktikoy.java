
public class typosatallaktikoy{

private String name;
private int price;

public typosatallaktikoy(String name,int price){
this.name = name;
this.price = price;
}

public void printData1(){
	
	System.out.printf(name+", "+price+"€\n");
	
}

public int getPriceAntal() {
	return price;
	
}




}