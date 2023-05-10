public class Ex10_01 {
    public static void main(String[] args) {
        int[] aa = new int[3];
        try {
            aa[2] = 100 / 0; //0으로 나눌 수 있는 수는 없다 -> 에러 발생(수학적 오류), but catch 불가능
            //catch는 내가 에러날 걸 예상한 부분
            aa[3] = 100;   //없는 변수에 값을 넣으려고 해서 에러 발생
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("배열 첨자가 배열 크기보다 커요~~");
//            System.out.println("오류 메시지 : " + e);
//        } catch (ArithmeticException e) {
//            System.out.println("0으로 나눠서 에러가 발생해요");
//            System.out.println("오류 메시지: " + e);
        } catch(Exception e) {
            System.out.println("자바에서 발생되는 모든 에러를 다 잡을 수 있는 사람 등장");
            System.out.println("오류 메시지 : " + e);
        } finally {
            System.out.println("정상동작하든지, 오류가 나든지 finally는 무조건 실행됩니다.");
        }
    }
}


//배열의 길이가 3이면 인덱스 3은 있을 수가 없음(배열의 범위를 넘어서 값을 넣으려 해서) -> 오류 발생
//실행하다가 에러가 나니까 실행을 멈추고 예외 처리 구문 출력  catch -> "에러를 잡아라"
//try~catch~finally 는 세트고 finally는 선택인데 써주는 것이 좋다. 오류가 나든 안 나든 끝을 내주어야 하니까
//object한테 상속 받은 애가 Exception(모든 에러의 조상) -> 예외 처리 담당하는 집안 (무조건 이 조상님을 거쳐서 가게 되어 있음 모든 오류는!)
//                          ㄴ모든 에러를 다 잡아낼 수 있음, 대신 제일 마지막 위치에 넣어야 함