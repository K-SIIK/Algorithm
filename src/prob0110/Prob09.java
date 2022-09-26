package prob0110;//정수 제곱근 판별
//n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성

class Prob09 {
    public long solution(long n) {
//       long 타입의 제곱근의 제곱이 제곱수와 같으면 n+1 제곱 리턴
        if (Math.pow((long) Math.sqrt(n), 2) == n) return (long) Math.pow(Math.sqrt(n) + 1, 2);
        else return -1;
    }

    public long solution2(long n) {
//        제곱근의 내림이 제곱근과 같으면 n+1 리턴
        double sqrt = Math.sqrt(n);
        return Math.floor(sqrt) == sqrt ? (long) Math.pow(sqrt + 1, 2) : -1;
    }
}

//  자동 형변환 - 범위가 작은 타입이 큰 타입으로 자동 형변환 가능. 반대는 불가
// byte -> short -> int -> long -> float -> double

// 제곱근의 내림 한 수가 제곱근과 값이 같으면 제곱수.
// 내림 Math.floor()