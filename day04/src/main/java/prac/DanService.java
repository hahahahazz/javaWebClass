package prac;

public class DanService {

	public String getDan(int su) {
		//2단 정보 = 이서비스에서 핵심데이터 = 모델 model 
				String result ="";			// 2*1 = 2
				
				for(int i =1; i<=9; i++) {
					String unit = su +"*" + i + "=" + su*i +"<br>"; 
					result += unit;
				}
		return result;
				
				
	}
	
	public static void main(String[] args) {
		DanService s =new DanService();
		String result = s.getDan(5);
		System.out.println(result);
		
		/*
		int su =3;
		String result ="";			// 2*1 = 2
		
		for(int i =1; i<=9; i++) {
			String unit = su +"*" + i + "=" + su*i +"<br>"; 
			result += unit;
		}	
		*/
		
		
	}
}
