package CafeCustomer;

import java.util.ArrayList;

public class CustomerService {

	CustomerDAO dao = new CustomerDAO();
	//customer_id, customer_name, customer_tell, customer_birth, customer_point
	
	
	//전체조회
	public ArrayList<Customer> getCustomerList(){
		ArrayList<Customer> list = dao.selectAll();
		return list;
	}
	
	// 회원가입
	public void signUpMember(Customer cus) {
		dao.signUpMember(cus);
	}
	
	// ID 로 조회하기 
	public Customer getMember(String id) {
		Customer cus = dao.selectOne(id);
		return cus;
	}
	
	//회원정보 수정
	 public void modifyMember(Customer cus) {
		dao.update(cus);
	 }
	
	 //회원탈퇴
	 public void deleteMember(String id) {
		 dao.delete(id);
	 }
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		CustomerService service = new CustomerService();
		ArrayList<Customer> list = service.getCustomerList();
		
		for( int i=0; i< list.size() ; i++) {
			 System.out.println( list.get(i));
		} 
	}
	
	
}
