package CafeCustomer;

public class Customer {

	//customer_id, customer_name, customer_tell, customer_birth, customer_point
	
	
	String customer_id;
	String customer_name;
	String customer_tell;
	String customer_birth;
	String customer_point;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String customer_id, String customer_name, String customer_tell, String customer_birth,
			String customer_point) {
		super();
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.customer_tell = customer_tell;
		this.customer_birth = customer_birth;
		this.customer_point = customer_point;
	}

	
	public Customer(String customer_id, String customer_name, String customer_tell, String customer_birth) {
		super();
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.customer_tell = customer_tell;
		this.customer_birth = customer_birth;
	}
 
	
	
	
	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", customer_name=" + customer_name + ", customer_tell="
				+ customer_tell + ", customer_birth=" + customer_birth + ", customer_point=" + customer_point + "]";
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getCustomer_tell() {
		return customer_tell;
	}

	public void setCustomer_tell(String customer_tell) {
		this.customer_tell = customer_tell;
	}

	public String getCustomer_birth() {
		return customer_birth;
	}

	public void setCustomer_birth(String customer_birth) {
		this.customer_birth = customer_birth;
	}

	public String getCustomer_point() {
		return customer_point;
	}

	public void setCustomer_point(String customer_point) {
		this.customer_point = customer_point;
	}
	
	
	
	
	
	
	
	
	
}
