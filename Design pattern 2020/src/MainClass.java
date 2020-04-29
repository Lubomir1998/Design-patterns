
public class MainClass {

	public static void main(String[] args) {
		
		Item phone = new Item();
		phone.setName("Samsung");
		phone.setQuantity(1);
		
		Item book = new Item();
		book.setName("Harry Potter book");
		book.setQuantity(2);
		
		Item hat = new Item();
		hat.setName("Hat");
		hat.setQuantity(6);
		
		Person Georgi = new Person();
		BuyItem boughtItem = new BuyItem(book);
		SellItem soldItem = new SellItem(phone);
		BuyItem boughtItem2 = new BuyItem(hat);
		
			
		Georgi.takeOrder(boughtItem);
		Georgi.takeOrder(soldItem);
		Georgi.takeOrder(boughtItem2);
		
		Georgi.placeOrders();
		
	}

}
