package CSE214;

public class ItemList extends ItemInfoNode{

	private ItemInfoNode head;
	private ItemInfoNode tail;
	private ItemInfoNode cursor;
	ItemInfoNode newNode = new ItemInfoNode();
	public ItemList() {
		head = null;
		tail = null;
		cursor = null;
		
		if(head != null) {
			newNode = head.getPrev();
		}

		head = newNode;
		if(tail == null) {
			tail = head;
		}
		if(cursor == null) {
			newNode = tail.getNext();
			tail = newNode.getPrev();
			tail = newNode;
			
		}
		cursor = head;
	
		
	}
	
	public void insertInfo(String name, String rfidTag, double price, String initPosition) {
		
	}
}
