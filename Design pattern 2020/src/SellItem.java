
public class SellItem implements Order {
	
	private Item currentItem;
	
	public SellItem(Item currentItem){
		this.currentItem = currentItem;
	}

	@Override
	public void execute() {
		currentItem.sell();
	}

}