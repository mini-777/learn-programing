package CSE214;

public class ItemInfoNode extends ItemInfo{
	private Object data;
	private ItemInfoNode next;
	private ItemInfoNode prev;

	public ItemInfoNode() {
	}
	
	public void setInfo(ItemInfo info) {
		this.data = info;
	}
	public ItemInfo getInfo() {
		return (ItemInfo) data;
	}
	
	public void setNext(ItemInfoNode node) {
		next = node;
	}
	public void setPrev(ItemInfoNode node) {
		prev = node;
	}
	public ItemInfoNode getNext() {
		return next;
	}
	public ItemInfoNode getPrev() {
		return prev;
	}
	
}

