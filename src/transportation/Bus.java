package transportation;

public class Bus extends Transportation {
    private static int busNum;
    private final String busName;

    public Bus() {
        this.maxPassengers = 10;
        this.maxGas = 100;
        this.fare = 2500;
        this.busName = "버스" + busNum++;
    }

    @Override
    public void runCar() {
        System.out.println("기사 : " + busName + " 운행을 시작하겠습니다.");
    }

    @Override
    public void changeStatus() {
        if (runStatus) System.out.println("기사 : " + busName + " 운행을 중지하겠습니다.");
        else System.out.println("기사 : " + busName + " 운행을 재개하겠습니다.");
    }

    @Override
    public void ridePassenger(Passenger passenger) {
        if (!runStatus) System.out.println("기사 : 운행 안합니다.");
        passengersC++;
        if (passenger.money < 2500) {
            System.err.println("기사 : " + passenger.name + " 님 요금이 부족합니다. 내려주세요");
        } else {
            System.out.println("기사 : " + passenger.name + "님, 안녕하세요!");
        }
        if (passengersC > maxPassengers) {
            System.err.println("기사 : " + passenger.name + " 님, 만원 입니다. 내려 주세요.");
        }
    }


}
