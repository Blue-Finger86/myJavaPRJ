public class Ex07_01 {
    public static void main(String[] args) {
        int i;
        i = 0;

        while(i<5) {
            System.out.printf("while문을 공부합니다.\n");
            i++; // 변수를 변화시키는 로직을 안 넣으면 무한루프 생성됨
        }
    }
}
