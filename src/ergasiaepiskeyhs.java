public class ergasiaepiskeyhs{
private String name;
private int price;

public ergasiaepiskeyhs(String name,int price){
this.name = name;
this.price = price;
}

public void printData(){
	
	System.out.printf(name+", "+price+"€\n");
	
}


public int getPriceErg() {
	return price;
	
}

}
