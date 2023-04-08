public class Ex5_7 {
    public static void main(String[] args) {
        System.out.println("매개변수의 개수:"+args.length);  // 매개변수의 개수는 배열의 길이값
        for(int i = 0; i<args.length; i++) { // 배열의 길이값 만큼 반복해서 출력
            System.out.println("args[" + i + "] = \""+args[i] + "\""); //args[" + i + "] ==>이게 각 요소를 나타냄 args[i]이거랑 똑같음, \""+args[i] + "\""이게 들어가는 값을 나타냄
        }
    }
}
