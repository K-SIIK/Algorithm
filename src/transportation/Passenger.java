package transportation;

public class Passenger {
    String name;
    int money;
    int destination;
    static int cnt;
    Passenger() {
        this.name = "아무개" + cnt++;
        this.money = (int) (Math.random() * 10000);
        this.destination = (int) (Math.random() * 15);
    }

}
