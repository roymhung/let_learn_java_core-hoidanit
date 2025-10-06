package lab04;

public class Product {
	private String name;
	private double price;
	private double tax;

	// Constructors
	public Product() {
	}

	public Product(String name, double price, double tax) {
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	// Getter và Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	// Tính giá sau thuế
	public double getTaxPrice() {
		return price * tax;
	}

	// In thông tin sản phẩm
	@Override
	public String toString() {
		return "Product{name='" + name + "', price=" + price + ", tax=" + tax + "}";
	}
}
