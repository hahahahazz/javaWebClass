package day05실습0;

public class CafeMenu {
	
	String menu_id;
	String menu_name;
	String menu_price;
	String menu_point;
	public String getMenu_id() {
		return menu_id;
	}
	public void setMenu_id(String menu_id) {
		this.menu_id = menu_id;
	}
	public String getMenu_name() {
		return menu_name;
	}
	public void setMenu_name(String menu_name) {
		this.menu_name = menu_name;
	}
	public String getMenu_price() {
		return menu_price;
	}
	public void setMenu_price(String menu_price) {
		this.menu_price = menu_price;
	}
	public String getMenu_point() {
		return menu_point;
	}
	public void setMenu_point(String menu_point) {
		this.menu_point = menu_point;
	}
	public CafeMenu(String menu_id, String menu_name, String menu_price, String menu_point) {
		super();
		this.menu_id = menu_id;
		this.menu_name = menu_name;
		this.menu_price = menu_price;
		this.menu_point = menu_point;
	}
	@Override
	public String toString() {
		return "CafeMenu [menu_id=" + menu_id + ", menu_name=" + menu_name + ", menu_price=" + menu_price
				+ ", menu_point=" + menu_point + "]";
	}
	
	public CafeMenu() {
		// TODO Auto-generated constructor stub
	}

}
