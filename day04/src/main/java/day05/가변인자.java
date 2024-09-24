package day05;

public class 가변인자 {
	
	
	//
	public void a(String a) {
		System.out.println();
		
		
	}
	
	// 가변인자 는  ... 문법을 쓴다 
	public void b(String ...a) {
		
		for(String str : a) {
			System.out.println(str);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		가변인자 obj = new 가변인자();
		obj.a("안녕");
		
		
		obj.b("안녕");
		obj.b("안녕","hi");
		obj.b("안녕","hi","hello");
		
		
	}

}
