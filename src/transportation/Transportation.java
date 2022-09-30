package transportation;

public abstract class Transportation {
    int maxPassengers;
    int maxGas;
    int speed;
    int gas;
    int fare;
    int passengersC;
    boolean runStatus = true;

    public abstract void runCar();

    public abstract void changeStatus();

    public void setChangeSpeed(int changeSpeed) {
        this.speed += changeSpeed;
        if (changeSpeed > 0) {
            System.out.println("속도를 " + changeSpeed + " 만큼 올리겠습니다.");
        } else if (changeSpeed < 0) {
            System.out.println("속도를 " + -changeSpeed + " 만큼 내리겠습니다.");
        } else {
            System.err.println("변경할 속도를 다시 입력해 주세요.");
        }
        System.out.println("속도가 " + this.speed + " 이 되었습니다.");
    }


    public abstract void ridePassenger(Passenger passenger);


}

