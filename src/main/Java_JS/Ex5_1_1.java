import java.util.Arrays;

public class Ex5_1_1 {
    public static void main(String[] args) {
        int[]arr = new int[10]; //정수형 배열 선언 후 길이가 10인 배열 생성 및 초기화
        int[]arr2 = new int[10]; // 정수형 배열 선언 후 길이가 10인 배열 생성 및 초기화
        int[]arr3 = {100, 95, 80, 70, 60}; // 정수형 배열 선언 후 값 직접 대입
        char[]arrch = {'a', 'b', 'c', 'd'}; // 문자형 배열 선언 후 값 직접 대입

        for(int i = 0; i < arr.length; i++) {  // 0번째부터 전체 길이 -1 될 때까지 하나씩 커지면서 순서대로 값 부여
            arr[i] = i + 1;
        }

        for(int i = 0; i < arr2.length; i++) {  // 0번째부터 전체 길이 -1이 될 때까지 하나씩 커지면서 랜덤으로 값 부여
            arr2[i]  = (int)(Math.random()*10) + 1; // 1부터 10까지의 값
        }

        for(int i = 0; i < arr.length; i++) {  // 0번째부터 전체 길이 -1이 될 때까지 하나씩 커지면서 배열 arr 출력
            System.out.print(arr[i]+",");
        }
        System.out.println(); // 한 줄 띄우고

        //System.out.print(arr2[i]+ ","); 이렇게 출력이 가능하려면 반복문이 와야 함. 출력을 도와주는 메서드를 이용하면 훨씬 간단하게 출력 가능함
        //System.out.print(arr3[i] + ","); 그게 Arrays.toString(배열이름)메서드
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(arr); // 배열을 가리키는 참조변수 arr의 값 출력(arr이라는 변수가 가리키고 있는 배열의 메모리의 주소 값을 말함 그래서 배열 자체를 출력하려면 배열을 출력할 수 있는 특별한 메서드를 사용해줘야 함)
        System.out.print(arrch); // 배열을 가리키는 참조변수 arrch의 값 출력

    }
}
