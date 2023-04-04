public class Sample_gugudan3 {
    public static void main(String[] args) {
        int g = 2; //2단부터 시작하려고

        for(int u=1; u<10; u++) { //1승부터 9승까지 9번 반복
            System.out.println(g + "*" + u + "=" + g*u); // 구구단 출력
            if(u==9) { // 9승이 되면
                g++; // 단 하나 키우고
                u = 0; // 0승으로 초기화
                System.out.println(); // 단과 단 사이에 한 줄을 띄움
                if(g==10) { // 단이 하나씩 커지면서 출력되다가 10단이 되면
                    break; // 반복문 전체 종료
                }
            }
        }
    }
}
