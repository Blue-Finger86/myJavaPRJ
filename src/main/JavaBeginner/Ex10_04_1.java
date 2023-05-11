public class Ex10_04_1 {
    public static void main(String[] args) {
        int a = 100, b = 200, c = 300;
        int zero = 0;
        int result;
        int[]arr = new int[5];

        try {
            if( zero == 0 ) {
                throw new Exception("0으로 나누는 건 불가능합니다.");  //사용자가 직접 만든 오류 메시지를
            }
            result = a+b+c/zero;
        } catch(Exception e) {
            System.out.println("오류 발생!!!");
            System.out.println(e.getMessage());  //여기서 받아서 출력합니다.
        }

        try {
            arr[6] = 15;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("에헤이 배열의 크기를 벗어났잖아요.");
        } finally {
            System.out.print("오류가 있든 없든 프로그램 끝을 알리는 사람 등장~!");
        }
    }
}
