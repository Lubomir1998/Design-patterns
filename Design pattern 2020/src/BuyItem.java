
public class BuyItem implements Order {
	
	private Item currentItem;
	
	public BuyItem(Item currentItem){
		this.currentItem = currentItem;
	}

	@Override
	public void execute() {
		currentItem.buy();
	}

}
