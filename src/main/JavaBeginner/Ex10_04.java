public class Ex10_04 {
    public static void main(String[] args) {
        int a = 100, b = 0;
        int result;
        try {
            if(b == 0)
                throw new Exception("0으로 나누려고요? 안 됩니다."); //메모리에 올려라 에러 객체를 그리고 던져라
            result = a / b;
        } catch (Exception e) { //던지면 받아주는 애가 있어야 함 얘가 받아주는 애 -> catch(보내는 애랑 받는 애가 똑같이 생겨야 받을 수 있음)
            System.out.print("발생 오류 ==> ");
            System.out.println(e.getMessage());
        }
    }
}
