package cafe;

public class Cafe {

	String id;
	String name;
	String price;
	String point;
	
	public Cafe() {
		// TODO Auto-generated constructor stub
	}
	
	public Cafe(String id, String name, String price, String point) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.point = point;
	}


	@Override
	public String toString() {
		return "Cafe [id=" + id + ", name=" + name + ", price=" + price + ", point=" + point + "]";
	}

	
	
//
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	public String getPoint() {
		return point;
	}


	public void setPoint(String point) {
		this.point = point;
	}
	

	
	
	
}
