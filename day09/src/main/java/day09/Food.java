package day09;

public class Food {

	String name;
	int price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	//생성자
	public Food() {
		// TODO Auto-generated constructor stub
	}
	public Food(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	//객체야 너의 정보를 다 가져와줘  전체값을 한번에 보기 
	@Override
	public String toString() {
		return "Food [name=" + name + ", price=" + price + "]";
	}
	
	
}
