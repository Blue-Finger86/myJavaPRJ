import java.util.Arrays;

public class Ex5_1_2 {
    public static void main(String[] args) {
        int[]arr1 = new int[10];
        int[]arr2 = new int[10];
        int[]arr3 = {100, 95, 80, 70, 60};
        char[]arrch = {'a', 'b', 'c', 'd'};

        for(int i = 0; i < arr1.length; i++) {
            arr1[i] = i + 1;
        }
        for(int i = 0; i < arr2.length; i++) {
            arr2[i] = (int)(Math.random()*10) + i; // *10을 괄호안에 넣어주지 않으면 랜덤 배치가 안 됨
        }

        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + ",");
        }
        System.out.println();

        System.out.println(Arrays.toString(arr2)); // 위에서 arr1은 출력되게 해놨으니까 arr2부터 시작해야 함
        System.out.println(Arrays.toString(arr3));
        System.out.println(arr1);
        System.out.println(arrch);
    }
}
