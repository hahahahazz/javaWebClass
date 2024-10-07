package Cafe;

public class Order {
//order_Cid, order_Mid, order_cnt, order_price, order_point, order_Sid
	String order_Cid;
	String order_Mid;
	String order_cnt;
	String order_price;
	String order_point;
	String order_Sid;
	public Order() {
		// TODO Auto-generated constructor stub
	}
	public Order(String order_Cid, String order_Mid, String order_cnt, String order_price, String order_point,
			String order_Sid) {
		super();
		this.order_Cid = order_Cid;
		this.order_Mid = order_Mid;
		this.order_cnt = order_cnt;
		this.order_price = order_price;
		this.order_point = order_point;
		this.order_Sid = order_Sid;
	}
	@Override
	public String toString() {
		return "Order [order_Cid=" + order_Cid + ", order_Mid=" + order_Mid + ", order_cnt=" + order_cnt
				+ ", order_price=" + order_price + ", order_point=" + order_point + ", order_Sid=" + order_Sid + "]";
	}
	public String getOrder_Cid() {
		return order_Cid;
	}
	public void setOrder_Cid(String order_Cid) {
		this.order_Cid = order_Cid;
	}
	public String getOrder_Mid() {
		return order_Mid;
	}
	public void setOrder_Mid(String order_Mid) {
		this.order_Mid = order_Mid;
	}
	public String getOrder_cnt() {
		return order_cnt;
	}
	public void setOrder_cnt(String order_cnt) {
		this.order_cnt = order_cnt;
	}
	public String getOrder_price() {
		return order_price;
	}
	public void setOrder_price(String order_price) {
		this.order_price = order_price;
	}
	public String getOrder_point() {
		return order_point;
	}
	public void setOrder_point(String order_point) {
		this.order_point = order_point;
	}
	public String getOrder_Sid() {
		return order_Sid;
	}
	public void setOrder_Sid(String order_Sid) {
		this.order_Sid = order_Sid;
	}
	
}
