public class Ex07_01_1 {
    //for구문 while구문으로 바꿔보기
    public static void main(String[] args) {
        int i;

        i = 1; // 초깃값은 while문 위로
        while(i<5) { // 조건식은 while문과 함께
            System.out.printf("while 문을 공부합니다.\n");
            i++; // 증감식은 while문 블록 안 제일 끝에 위치하게
        }
    }
}
