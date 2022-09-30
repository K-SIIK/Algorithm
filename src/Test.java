import java.util.ArrayList;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        int month = 9;
        int day = 30;
        String subject = "Java";
        String name = "조경민";
        String date = month + "월 " + day + "일";

        ArrayList<String> topics = new ArrayList<>(Arrays.asList("JRE", "JDK", "메모리"));

        System.out.println("안녕하세요, " + date + " " + subject + " 특강을 맡게 된 " + name + " 입니다.");

        System.out.print("오늘 다룰 토픽은 ");
        for (int i = 0; i < topics.size(); i++) {

            if (i != topics.size()-1) {
                System.out.print(topics.get(i) + ", ");
            } else {
                System.out.print(topics.get(i));
            }
        }
        System.out.print(" 입니다.");
    }
}