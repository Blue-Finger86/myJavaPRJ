import java.util.Scanner;

public class Ex0412 {
    public static void main(String[] args) {
        int[] a = new int[5];   // 길이가 5인 정수형 배열 선언 및 생성

        Scanner sc = new Scanner(System.in);  // 값을 직접 입력할 거라서 스캐너 선언

        for (int i = 0; i < a.length; i++) {  // 인덱스 0부터 시작해서 배열의 길이보다 작아질 때까지 하나씩 키워가며 반복
            a[i] = sc.nextInt();   // 내가 입력하는 값은 배열의 각 인덱스에 들어갈 것
        }


        int max = a[0];   // 최대값을 일단 배열의 첫번째 값으로 넣어둔다(초기화 한다)
        int min = a[0];   // 최소값도 마찬가지로 배열의 첫번째 값으로 초기화한다.
        int sum = 0;     // 합을 담을 변수는 0으로 초기화한다.
        float avg = 0;   // 평균을 담을 변수도 0으로 초기화 한다.

        for (int i = 0; i < a.length; i++) {     // 인덱스 0부터 배열의 길이보다 작아질 때까지 하나씩 키워가며 반복
            if (a[i] > max) {              // 조건문으로 [i]가 최대값보다 크냐고 물어보고
                max = a[i];      // 그렇다면 최대값을 해당 인덱스로 교체
            } else if (a[i] < min) {      // 조건문으로 [i]가 최소값보다 작냐고 물어보고
                min = a[i];      // 그렇다면 최소값을 해당 인덱스로 교체
            }
            sum = sum + a[i];   // 합은 하나씩 더한 값을 보내서 담기
        }
        avg = sum / (float) a.length;   // 총합을 배열의 길이로 나누는데 실수형으로 선언해놨으니 형변환 시켜주고


        System.out.printf("최대값은 %d, 최소값은 %d, 평균은 %f", max, min, avg);
    }
}