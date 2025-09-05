public class Bicycle {
    String color;
    int gear;
    int currentSpeed;
    int fullSpeed = 20;
    String bellSound;


    public void Pedal() {
        System.out.println("השחקן התחיל לפדל");
        while (currentSpeed != fullSpeed) {
            if (gear == 1) {
                currentSpeed += 1;
                System.out.println("מהירות האופניים היא " + currentSpeed);
            } else {
                if (gear == 2) {
                    currentSpeed += 3;
                    System.out.println("מהירות האופניים היא " + currentSpeed);
                } else {
                    if (gear == 3) {
                        currentSpeed += 5;
                        System.out.println("מהירות האופניים היא " + currentSpeed);
                    }
                }

            }

        }
        System.out.println("האופניים הגיעו למהירות מקסימלית של 20 קמש");
    }

    public void ChangeGear(int gear) {
        this.gear = gear;
        System.out.println("האופניים נכנסו להילוך " + gear);
    }

    public void Stop() {
        System.out.println("השחקן בלם");
        currentSpeed = 0;
    }

    public void RingBell() {
        System.out.println("ring ring");
    }

    public void ChangeColor(String color) {
        this.color = color;
    }

    public void Describe() {
        System.out.println(color);
        System.out.println(currentSpeed);
        System.out.println("ring ring");

    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public String describe() {
        return "color: " + color +

                " current speed: " + currentSpeed + " bell sound :" + bellSound;
    }
}