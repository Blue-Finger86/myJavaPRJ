public class Ex06_08 {
    public static void main(String[] args) {
        int hap = 0;
        int i; // 메모리에 안 올라간 i

        for (i = 1; i <= 10; i++) { // 여기서 초깃값을 설정하면서 i가 메모리에 올라감
            hap = hap + i;
        }
        System.out.printf("1에서 10까지의 합 : %d \n", hap);
    }
}
