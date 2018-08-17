package Review00;

public class Books {
	private String title;
	private double price;
	private double cost; 
	private boolean isPublished;
	private boolean isHardBack;
	Books(){
		
	}
	Books( String Title, double Price, double Cost, boolean IsPublished, boolean IsHardBack ){
		this.title = Title;
		this.price = Price;
		this.isPublished = IsPublished;
		this.isHardBack = isHardBack;
    }

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getEarnings( ) {
		return this.price - this.cost;
	}
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public boolean isPublished() {
		return isPublished;
	}

	public void setPublished(boolean isPUblished) {
		this.isPublished = isPUblished;
	}

	public boolean isHardBack() {
		return isHardBack;
	}

	public void setHardBack(boolean isHardBack) {
		this.isHardBack = isHardBack;
	}
	
}

