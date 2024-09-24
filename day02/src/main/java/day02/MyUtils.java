package day02;

public class MyUtils {

	
	//1부터 10 까지의 합
	
	public int getTen() {
		int sum =0;
		for(int i =1; i<=10; i++) {
			sum+= i;
		}
		return sum;
	}
	
	
	// 약수구하기	- 약수서블릿수정본에서 사용할 !
	public String getDivisor(int su) {
		
		int[] arr = new int[20];	//20 개짜리 배열 하나 만들고 
		
		
		//4의 약수  1,2,3,4 중에서  => 1,2,4  나온다
		
		int index = 0; 
		for(int i =1; i<=su; i++) {
			if(su % i == 0) {
				arr[index] = i;
				index++;
			}
		}
		
		//배열을 하나의 문자열로 만들어주기
		String result = "";
		
		for (int i = 0; i<index; i++) {
			result += arr[i] + "  " ;
		}
		
		
		return result;
	}
	//잘 작동하는지 출력해보자 
	//스태틱이 아닌 메소드를 호출해서 사용하려면  객체생성해
	public static void main(String[] args) {
		MyUtils m = new MyUtils();
		String result = m.getDivisor(1244);
		System.out.println(result);
	}
	
	
}
