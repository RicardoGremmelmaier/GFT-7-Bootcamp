import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        var bankOption = -1;

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        BankAccount account = new BankAccount(initialBalance);
        BankSlip bankSlip = new BankSlip(100.0);
        System.out.println("Bank account created with balance: " + account.getBalance() + " and special check: " + account.getSpecialCheck());
        
        do {
            System.out.println("====================================");
            System.out.println("1. Deposit money");
            System.out.println("2. Make a payment");
            System.out.println("3. Withdraw money");
            System.out.println("4. Check balance");
            System.out.println("5. Check if using special check");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            bankOption = scanner.nextInt();

            switch (bankOption) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    account.payment(bankSlip);
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;

                case 4:
                    System.out.println("Current balance: " + account.getBalance());
                    System.out.println("Special check available: " + account.getSpecialCheck());
                    break;

                case 5:
                    if (account.isUsingSpecialCheck()) {
                        System.out.println("You are currently using the special check.");
                    } else {
                        System.out.println("You are not using the special check.");
                    }
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
            }

            if (account.isUsingSpecialCheck()){
                System.out.println("You are currently using the special check. We are trying to pay your special check.");
                account.paySpecialCheck();
            }

            System.out.println("====================================");

        } while (bankOption != 0);
        System.out.println("Thank you for using the bank system!");

        Car car = new Car();
        System.out.println("Car created with initial speed: " + car.getSpeed() + " and gear: " + car.getGear());
        var carOption = -1;
        do {
            System.out.println("====================================");
            System.out.println("1. Start car");
            System.out.println("2. Stop car");
            System.out.println("3. Accelerate car");
            System.out.println("4. Brake car");
            System.out.println("5. Check speed and gear");
            System.out.println("6. Turn left");
            System.out.println("7. Turn right");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            carOption = scanner.nextInt();

            switch (carOption) {
                case 1:
                    car.start();
                    break;

                case 2:
                    car.stop();
                    break;

                case 3:
                    car.accelerate();
                    break;

                case 4:
                    car.brake();
                    break;

                case 5:
                    System.out.println("Current speed: " + car.getSpeed() + ", Current gear: " + car.getGear() + ", Is running: " + car.isRunning());
                    break;

                case 6:
                    car.turnLeft();
                    break;
                
                case 7:
                    car.turnRight();
                    break;
    
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
            }

            System.out.println("====================================");

        } while (carOption != 0);
        System.out.println("Thank you for using the car system!");
        System.out.println("====================================");


        PetWash petWash = new PetWash();
        Pet pet = new Pet();
        System.out.println("Pet wash created with initial water level: " + petWash.getWaterLevel() + " and soap level: " + petWash.getSoapLevel());
        var washOption = -1;
        do {
            System.out.println("====================================");
            System.out.println("1. Add water");
            System.out.println("2. Check water level");
            System.out.println("3. Add soap");
            System.out.println("4. Check soap level");
            System.out.println("5. Put pet in wash");
            System.out.println("6. Remove pet from wash");
            System.out.println("7. Wash pet");
            System.out.println("8. Clean machine");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            washOption = scanner.nextInt();

            switch (washOption) {
                case 1:
                    petWash.addWater();
                    break;

                case 2:
                    petWash.getWaterLevel();
                    break;

                case 3:
                    petWash.addSoap();
                    break;

                case 4:
                    petWash.getSoapLevel();
                    break;

                case 5:
                    petWash.putPet(pet);
                    break;

                case 6:
                    petWash.removePet(pet);
                    break;

                case 7:
                    petWash.washPet(pet);
                    break;

                case 8:
                    petWash.cleanMachine();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option, please try again.");
            }

            System.out.println("====================================");

        } while (washOption != 0);
        System.out.println("Thank you for using the pet wash system!");

        scanner.close();
    }
}
