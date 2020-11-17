package quiz;

public class B11_whileQuiz {
	
	public static void main(String[] args) {
		
		//while문을 이용하여
		
		// 1. 1부터 100까지의 3의 배수의 총합을 구해라
		
		// 2. 200부터 1까지 출력
		
		// 3. 1부터 200까지의 숫자 중 2의 배수도 아니고 3의 배수도 아닌 숫자들의 총합을 구해라
		
		int n = 1;
		int total = 0;
		
		while(n<=100) {
			if (n%3==0) {
				total+=n;
			}
			n++;
		}
		
		System.out.println(total);
		
		n=200;
		while(n>0) {
			System.out.println(n);
			n--;
		}
		
		n=1;
		total = 0;
		while(n<=200) {
			if (n%2!=0 && n%3!=0) {
				total+=n;
			}
			n++;
		}
		
		System.out.println(total);
		
		
		
		
		
		
		
		
	}

}
