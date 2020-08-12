package CSE214;

public class ItemInfo {

	private String products;
	private double price;
	private String rfidTagNumber;
	private String originalLocation;
	private String currentLocation;
	
	public void setProducts(String products) {
		this.products = products;
	}
	public String getProducts() {
		return products;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	
	public void setRfidTagNumber(String rfidTagNumber) {
		try {
		this.rfidTagNumber = rfidTagNumber;
		if(rfidTagNumber.length()>9||rfidTagNumber.length()<9) {
			throw new rfidBoundaryException();
		}
		} catch(rfidBoundaryException e) {
			System.out.println("Tag number can not be less than or greater than 9.");
		}
	}
	public String getRfidTagNumber() {
		return rfidTagNumber;
	}
	
	public void setOriginalLocation(String originalLocation) {
		try {
		this.originalLocation = originalLocation;
		if(originalLocation.length()>6||originalLocation.length()<6) {
			throw new originalLocationBoundaryException();
		}
		}catch(originalLocationBoundaryException e) {
			System.out.println("Original Location length can not be less than or greater than 6");
		}
	}
	public String getOriginalLocation() {
		return originalLocation;
	}
	
	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}
	public String getCurrentLocation() {
		return currentLocation;
	}
}

