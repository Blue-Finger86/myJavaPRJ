import java.util.Scanner;

public class Ex1069 {
    public static void main(String[] args) {
        // 평가를 영문자 1개로 입력, 해당하는 내용 출력(평가를 문자로 받아 내용을 다르게 출력한다.)

        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        switch(ch){
            case 'A':
                System.out.print("best!!!");
                break;
            case 'B':
                System.out.print("good!!");
                break;
            case 'C':
                System.out.print("run!");
                break;
            case 'D':
                System.out.print("slowly~");
                break;
            default:
                System.out.print("what?");
        }
    }
}



// 정답!