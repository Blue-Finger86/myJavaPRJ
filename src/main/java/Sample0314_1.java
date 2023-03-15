public class Sample0314_1 {
    public static void main(String[] args) {
        int j, i;
        for (i = 0; i < 6; i++) { //6번째 줄까지 한 줄씩 늘어나게
            for (j = 0; j < 5-i; j++) { // 공백이 한 칸씩 줄어들게
                System.out.print(" "); // 공백 출력
            }
            for (j = 0; j < 1+i*2; j++) { // *가 양족에 하나씩 늘어나게
                System.out.print('*'); // * 출력
            }
            System.out.println(); // 삼각형 완성
        }
        for (i = 0; i < 6; i++) {
            for (j = 0; j < 1+i; j++) { // 공백이 한 칸씩 늘어나게
                System.out.print(" "); // 공백 출력
            }
            for (j = 0; j < 9-i*2; j++) { // *를 양쪽에서 하나씩 줄어들게 (근데 교수님 이게 제가 6줄 짜리를 짰는데 6에서 빼면 모양이 제대로 안 나오더라고요 근데 9를 넣으면 나와요 근데 왜 9인지를 모르겠어요
                System.out.print('*'); // * 출력
            }
            System.out.println(); // 역삼각형 완성
        }
    }
}
