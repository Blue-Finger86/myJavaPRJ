import java.util.Arrays;

public class Ex5_4_1 {
    public static void main(String[] args) {
        int[]numArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(numArr));

        for(int i = 0; i < 100; i++) { //임의의 위치 -> n번째 에 있는 값과 첫 번째 값을 교환하는 일을 100번 반복해서 배열을 싹 다 섞어버림, 둘이 서로 바꾸는 게 아니라 빈 박스 하나를 두고 셋이 돌아가면서 값을 바꾸는 것임(저글링처럼)
            int n = (int)(Math.random() * 10);
            int tmp = numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = tmp;
        }
        System.out.print(Arrays.toString(numArr));
    }
}
