public class Ex07_05_1 {
    public static void main(String[] args){
        int a = 100;

        while(a == 200) {   // 조건식이 거짓이기 때문에 출력구문 실행이 안 됨
            System.out.printf("while문 내부에 들어왔습니다.\n");
        }
        do {  // 무조건 실행하는 구문 그 다음에 while구문을 만남
            System.out.printf("do~while문 내부에 들어왔습니다.\n");
        } while(a == 200); // 조건식 거짓 어차피 출력 안 됨.
    }
}
