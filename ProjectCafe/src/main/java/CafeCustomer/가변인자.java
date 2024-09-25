package CafeCustomer;

public class 가변인자 {

	//
	public void a (String a) {
		System.out.println(a);
	}
	
	public void b(String ...a) {
		for(String str : a) {
			System.out.println(str);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		가변인자 obj = new 가변인자();
		obj.a("안녕?");
		
		obj.b("하세요?");
		obj.b("안녕", "하세요");
		obj.b("안녕", "하세요", "?");
		obj.b("안녕", "하세요", "?","><");
		
	}

}
