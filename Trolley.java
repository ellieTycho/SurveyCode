public class Item{

	String name;
	double price;
	
	public Item(String n, double p){
		name = n;
		price = p;
	}	
	
	public int getPrice(){
		return price;
	}	
}

public class Trolley{

	ArrayList<Item> trolley;
	
	public Trolley(){
		trolley = new ArrayList<Item>();
	}	
	
	public void addItem(Item i){
		trolley.add(i);
	}
	
	public void removeItem(Item i){
		trolley.remove(i);
	}
	
	public double calculateTrolleyTotal(){
		double total = 0;
		for(Item i: trolley){
			total = total + i.getPrice();
		}
		
		return total;
	} 
}

public class Order{
	
	private Trolley trolley;
	
	public Order(Trolley t){
		trolley = t;
	}
	
	private double getTotal(){
		return trolley.calculateTrolleyTotal(); 
	}
	
}
