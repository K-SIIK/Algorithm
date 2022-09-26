package prob1120;// 3진법 뒤집기
// n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return

class Prob13 {
    public int solution(int n) {
//        StringBuilder 리버스 함수로 뒤집은후 10진법
        int answer = 0;
        StringBuilder third = new StringBuilder();
        while (n != 0) {
            third.append(n % 3);
            n /= 3;
        }
        third.reverse();

        for (int i = 0; i < third.length(); i++) {
            answer += (third.charAt(i) - '0') * (int) (Math.pow(3, i));
        }
        return answer;
    }

    public int solution2(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        String str = "";
        while (n != 0) {
            str += n % 3 + "";
            n /= 3;
        }
        str = new StringBuilder(str).reverse().toString();
        return Integer.parseInt(str, 3);
    }
}


// 3진법 문자열 10진법 int형으로 바꾸는 법 Integer.parseInt(str, 3)
// int타입 10진법 -> String 3진법  -  Integer.toString(num, 3)
// StringBuffer 보다 StringBuilder의 성능이 살짝 더 좋았음

// String VS StringBuffer & StringBuilder
// 코드가 짧을 때엔 성능의 차이가 거의 없지만 코드가 길어질 수록 상황에 맞는걸 사용해야함
// String의 경우 immutable(불변의) 속성을 가지고 있다.
// String 타입의 변수에 'hello' 라는 문자열이 저장되어 있고, 그 변수에 "world" 라는 값을 추가하게 되면
// 변수에 저장되어있는 값은 "helloworld" 일 것이다. 이 상황을 메모리 관점에서 파보자.
// "hello"를 가르키고 있던 참조 변수가 "world"라는 문자열을 더해 "helloworld"를 가르키게 되는 것처럼 보이지만 아니다.
// 문자열을 더한 순간 "hello"를 가르키던 참조변수는 가비지컬렉터에 의해 제거되고 새로운 참조변수가 생성되어 "helloworld"를 가르키게 되는 것이다.
// String 클래스는 불변하기 때문에 문자열을 수정하는 시점에서 새로운 String  인스턴스가 생성되는 원리이다.
// https://ifuwanna.tistory.com/221

// 따라서 문자열을 수정하지 않을 경우에는 좋은 성능을 기대할 수 있지만 수정이 자주 발생하는 알고리즘에 String 클래스를 사용할 경우
// Heap 메모리에 많은 가비지가 생성되어 힙메모리 부족으로 성능에 안좋은 영향을 끼칠 수 있다.

// 이를 해결하기 위해 mutable(가변의) 속성을 가진 StringBuffer & StringBuilder를 사용하는게 졶다.
// 이 클래스의 내장 함수인 추가(append()), 삭제(delete()) 등을 사용해서 수정을 하면 동일 객체 내에서 문자열을 변경하는 것이기 때문에 좋다.
// 그렇다면 이 둘의 차이는 StringBuffer는 멀티쓰레드 환경에서 안전하고, StringBuilder는 단일쓰레드 내에서 성능이 좋다.

// 단일스레드 VS 멀티스레드
// 스레드란 CPU 이용의 기본 단위이다. 프로세스 내에서 프로그램 명령을 실행하는 기본단위이다.
// 예를 들어 velog에 볼르고를 쓰고 있는 것이 스레드 1이라면 유튜브로 음악을 듣는 것을 스레드2라고 할 수 있다.
// 단일 스레드는 하나의 프로세스에서 오직 하나의 스레드만 실행하기 때문에 하나의 레지스터와 스택으로 표현이 가능하다.
// 장점은 빠르지만 단점은 여러개의 CPU를 활용하지 못한다.
// 멀티 스레드는 반대
