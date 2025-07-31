public class Car {
    private boolean isRunning;
    private int speed;
    private int gear;

    public Car() {
        this.isRunning = false;
        this.speed = 0;
        this.gear = 0;
    }

    public int getSpeed() {
        return this.speed;
    }

    public int getGear() {
        return this.gear;
    }

    public Boolean isRunning() {
        return this.isRunning;
    }

    private void updateGear(){
        if (this.speed >= 0 && this.speed <= 20) {
            this.gear = 1;
        } else if (this.speed > 20 && this.speed <= 40) {
            this.gear = 2;
        } else if (this.speed > 40 && this.speed <= 60) {
            this.gear = 3;
        } else if (this.speed > 60 && this.speed <= 80) {
            this.gear = 4;
        } else if (this.speed > 80 && this.speed <= 100) {
            this.gear = 5;
        } else if (this.speed > 100 && this.speed <= 120) {
            this.gear = 6;
        } else {
            this.gear = 0;
        }
    }
    
    public void start() {
        if (!this.isRunning) {
            this.isRunning = true;
            System.out.println("Car started.");
        } else {
            System.out.println("Car is already running.");
        }
    }

    public void stop() {
        if (this.isRunning && this.speed == 0 && this.gear == 0) {
            this.isRunning = false;
            System.out.println("Car stopped.");
        } else {
            System.out.println("You can't stop the car.");
        }
    }

    public void accelerate(){
        if (!this.isRunning()){
            System.out.println("You need to start the car first.");
            return;
        }
        this.speed += 1;
        if (this.speed > 120) {
            this.speed = 120;
            this.updateGear();
            System.out.println("Maximum speed reached.");
        }
        this.updateGear();
    }

    public void brake() {
        if (!this.isRunning()) {
            System.out.println("You need to start the car first.");
            return;
        }
        this.speed -= 1;
        if (this.speed <= 0) {
            this.speed = 0;
            this.gear = 0;
            this.updateGear();
            System.out.println("Car is now at 0 speed.");
        }
    }

    public void turnLeft(){
        if (!this.isRunning()) {
            System.out.println("You need to start the car first.");
            return;
        }
        if (this.speed >= 1 && this.speed <= 40) {
            System.out.println("Car is turning left.");
        } else {
            System.out.println("You can't turn left at this speed.");
        }
    }

    public void turnRight(){
        if (!this.isRunning()) {
            System.out.println("You need to start the car first.");
            return;
        }
        if (this.speed >= 1 && this.speed <= 40) {
            System.out.println("Car is turning right.");
        } else {
            System.out.println("You can't turn right at this speed.");
        }
    }

}
