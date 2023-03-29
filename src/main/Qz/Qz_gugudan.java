public class Qz_gugudan {


public static void main(String[] args) {
        int i, j;

            for ( i = 1; i < 10; i++) {
                 for ( j = 2; j < 9; j++){
                    System.out.printf("%d * %d = %2d", j, i, j*i); // 퐁, 가로로 출력
                    System.out.print("     "); // 당, 가로로 출력
                }
                System.out.printf("%d * %d = %d\n", j, i, j*i); // 세로로 출력
            }

    }
}