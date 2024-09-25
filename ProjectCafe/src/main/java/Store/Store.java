package Store;

public class Store {
	
	String store_id;
	String store_name;
	String store_tell;
	String store_total;
	public String getStore_id() {
		return store_id;
	}
	public void setStore_id(String store_id) {
		this.store_id = store_id;
	}
	public String getStore_name() {
		return store_name;
	}
	public void setStore_name(String store_name) {
		this.store_name = store_name;
	}
	public String getStore_tell() {
		return store_tell;
	}
	public void setStore_tell(String store_tell) {
		this.store_tell = store_tell;
	}
	public String getStore_total() {
		return store_total;
	}
	public void setStore_total(String store_total) {
		this.store_total = store_total;
	}
	public Store(String store_id, String store_name, String store_tell, String store_total) {
		super();
		this.store_id = store_id;
		this.store_name = store_name;
		this.store_tell = store_tell;
		this.store_total = store_total;
	}
	
	public Store() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Store [store_id=" + store_id + ", store_name=" + store_name + ", store_tell=" + store_tell
				+ ", store_total=" + store_total + "]";
	}
	
	

}
