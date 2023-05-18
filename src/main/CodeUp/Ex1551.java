import java.util.Scanner;
//원하는 만큼(n)값 입력한 후, 원하는 값이 저장된 순서(위치) 출력하기
//입력과 출력은 메인에, 위치 찾아주는 건 메소드에 만들어서 호출하기

class func11 {
    public static int f(int a, int b[]) {               //위치 찾아주는 메소드
        for (int i = 0; i < b.length; i++) {            //b.length()이렇게 쓰면 오류나는 이유는?
            if (b[i] == a) {
                return i+1;
            }
        }
        return -1;
    }
}

public class Ex1551 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();                        //입력할 데이터의 개수
        int[]b = new int[n];

        for (int i = 0; i < n; i++) {               //반복문 사용하여 n개만큼의 데이터 배열에 입력
            b[i] = sc.nextInt();
        }

        int k = sc.nextInt();                       //위치를 찾고 싶은 값 입력

        System.out.println(func11.f(k, b));         //메소드 호출하여 원하는 데이터의 위치값 출력
    }
}


//입력할 때 한 칸씩 띄워야 하나? 12345 이렇게 붙어서 입력하면 안 뜨네?