import java.util.Scanner;

public class Ex1095 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); 	// 출석을 몇 번 부를 것인지
		int[]a = new int[n];; 	// 길이가 n인 배열 생성		

		for(int i = 0; i < a.length; i++) {	// 출석 부름과 동시에 불린 번호들 배열 a의 인덱스에 집어 넣기
			a[i] = sc.nextInt();
		}


		int tmp = 0; 		//  값의 크기 비교 후, 교환할 때 사용할 빈 변수 하나 생성  

		// 큰 값은 뒷 번호, 작은 값은 앞 번호를 의미한다.
		for(int i = 0; i < a.length; i++) {
			for(int j = i + 1; j < a.length; j++) {
				if(a[i] > a[j]) { 		// 앞 순서의 값이 뒷 순서의 값보다 크다면
					tmp = a[i];	// 앞 순서의 값은 빈 변수에 넣어놓고
					a[i] = a[j];		// 뒷 순서의 값을 앞 순서로 보낸다.
					a[j] = tmp;	// 그리고 뒷 순서에는 빈 변수가 갖고 있던 더 큰 값이 들어간다.
				}
			}
		}

		System.out.println(a[0]); 	// 가장 빠른 번호 즉, 최솟값을 담고 있는 인덱스 0번째의 값을 출력한다.
	}
}
					 
			