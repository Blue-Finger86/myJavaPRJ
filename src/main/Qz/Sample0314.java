public class Sample0314 {
    public static void main(String[] args) {
        int n = 0;
        for (int i = 1; i < 13; i++) {
            if (n < 8) {
                n++;
            } else {
                n--;
            }
            for (int j = 1; j < n; j++) { // 아 이게 --가 아니라 ++이 되어야 단이 넘어가는구나
                System.out.print(" " + '*' + " ");
            }
            System.out.println();
        }
    }
}
