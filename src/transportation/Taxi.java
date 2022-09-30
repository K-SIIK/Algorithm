package transportation;

public class Taxi extends Transportation {
    private static int taxiNum;
    private final String taxiName;
    private int surcharge;

    Taxi() {
        this.maxPassengers = 4;
        this.maxGas = 70;
        this.fare = 3000;
        this.taxiName = "택시" + taxiNum++;
    }

    @Override
    public void runCar() {
        System.out.println("기사 : " + taxiName + " 운행을 시작하겠습니다.");
    }


    @Override
    public void changeStatus() {
        if (runStatus) System.out.println("기사 : " + taxiName + " 운행을 중지하겠습니다.");
        else System.out.println("기사 : " + taxiName + " 운행을 재개하겠습니다.");
    }

    @Override
    public void ridePassenger(Passenger passenger) {
        if (!runStatus) System.out.println("기사 : " + "운행 안합니다.");
        if (passenger.destination < 5) {
            System.out.println("기사 : " + passenger.name + " 님, 요금은 " + fare + " 원입니다.");
            if (passenger.money < fare)
                System.err.println("기사 : " + passenger.name + " 님, " + "돈이 " + (fare - passenger.money) + "부족합니다. 내리세요");
            else {
                System.out.println("기사 : " + passenger.name + " 님, " + "목적지까지 안전하게 모시겠습니다.");
                passenger.money -= fare;
            }
        } else if (passenger.destination > 5 && passenger.destination < 10) {
            surcharge = fare + (passenger.destination - fare) * 1000;
            System.out.println("기사 : " + passenger.name + " 님, 요금은 " + surcharge + " 원입니다.");
            if (surcharge > passenger.money) {
                System.err.println("기사 : " + passenger.name + " 님, " + "돈이 " + (fare - passenger.money) + "부족합니다. 내리세요");
            } else System.out.println("기사 : " + passenger.name + " 님, " + "목적지까지 안전하게 모시겠습니다.");

        } else System.err.println("기사 : " + passenger.name + " 님, " + passenger.destination + " 만큼은 너무 멀어서 안가요.");
    }


}