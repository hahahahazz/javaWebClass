package Cafe;

import java.util.ArrayList;

public class CustomerService {

	CustomerDAO dao = new CustomerDAO();
	public ArrayList<Customer> getCusList(){
		return dao.cafeCusList();
	}
	
}
