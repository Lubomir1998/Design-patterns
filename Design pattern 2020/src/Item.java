
public class Item {
	
	private String name;
	private int quantity;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void buy(){
		System.out.println("Bought: " + "\n" + "item - " + name + ", quantity - " + quantity);
	}
	
	public void sell(){
		System.out.println("Sold: " + "\n" + "item - " + name + ", quantity - " + quantity);
	}

}
