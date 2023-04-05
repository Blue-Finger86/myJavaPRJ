public class Ex07_02 {
    public static void main(String[] args) {
        int hap = 0;
        int i;

        i = 2;
        while(i<=10) {
            hap = hap + i;
            i = i + 2;
        }
        System.out.printf("1에서 10까지의 합:%d\n", hap);
    }
}
