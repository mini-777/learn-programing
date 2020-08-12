package CSE214;

public class ItemList extends ItemInfoNode{

	private ItemInfoNode head;
	private ItemInfoNode tail;
	private ItemInfoNode cursor;
	private Object data;
	ItemInfoNode newNode = new ItemInfoNode(data);
	public ItemList() {
		head = null;
		tail = null;
		cursor = null;
//		if(head != null) {
//			newNode = head.getPrev();
//		}
//
//		head = newNode;
//		if(head.getNext() == null) {
//			tail = head;
//		}
//		if(cursor == null) {
//			newNode = tail.getNext();
//			tail = newNode.getPrev();
//			tail = newNode;
//			
//		}
//		cursor = head;
//	
		
	}
	
	public void insertInfo(String name, String rfidTag, double price, String initPosition) {
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else if (head != null) {

			if (rfidTag.compareTo(head.getRfidTagNumber()) < 0) {
				ItemInfoNode temp1 = (ItemInfoNode) newNode.getData();
				ItemInfoNode temp2 = temp1.getNext();
				newNode = new ItemInfoNode(data);
				if (temp2 != null) {
					newNode = temp2.getPrev();
				}
				temp1 = newNode.getPrev();
				if (newNode.getNext() == null) {
					tail = newNode;
				}
			}
		}

	}
	
	public void removeAllPurchased() {
		ItemInfoNode temp = head;
		head = temp.getNext();
		
		Object tempData = temp.getData();
		temp = null;
		
		if(head != null) {
			head = head.getPrev();
			head = null;
		}
		return;
	}
	
	public boolean moveItem(String rfidTag, String source, String dest) {
		ItemInfoNode temp = new ItemInfoNode(data);
		if(cursor.getCurrentLocation() ==null) {
			throw new IllegalArgumentException();
		}
		source = temp.getOriginalLocation();
		dest = newNode.getCurrentLocation();
		return true;
	}
	
	public void printAll() {
		System.out.println(newNode.toString());
	}
	
	public void printByLocation(String location) {
		System.out.println(newNode.getCurrentLocation().toString());
	}
	
	public void cleanStroe() {
		if(!(newNode.getCurrentLocation().equals("out"))) {
			String temp = newNode.getCurrentLocation();
			String temp2 = newNode.getOriginalLocation();
		}
		
		
	}
	public double checkOut(String cartNumber) {
		if(cartNumber.matches("c")) {
			newNode.setCurrentLocation("out");
		}
		return newNode.getPrice();
		
	}
	
	public String toString() {
		return String.format("%-21s%-26s%19s%06d", null);
	}
}
