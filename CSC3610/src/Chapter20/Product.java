package Chapter20;

public class Product {
	private String name;
	private  int weight;
	Product( ) {
		this.name = "";
		this.weight = 0;
	}
	Product( String name, int weight ) {
		this.name = name;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}
	public String  toString() {
		return "Product{ name:" + name +
	          " weight:" + weight + "}";
	}

}
