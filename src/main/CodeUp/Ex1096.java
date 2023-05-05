import java.util.Arrays;
import java.util.Scanner;

public class Ex1096 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[][]a = new int[19][19];			//19X19 2차원 배열 생성

	int n = sc.nextInt();				//흰 돌을 놓을 횟수 입력

	for(int i = 0; i < n; i++) {			//반복문 사용하여 흰 돌을 놓을 좌표 입력
		int x = sc.nextInt();
		int y = sc.nextInt();
		a[x-1][y-1] = 1;			//내가 입력한 좌표에서 -1한 실제 위치에 1을 입력(기본 값은 0으로 들어가있음)
	}

	for(int i = 0; i < a.length; i++) {		//반복문 사용하여 배열 출력 
		for(int j = 0; j < a.length; j++) {
			System.out.print(a[i][j]+" ");
		}
			System.out.println();
	}
	}
}