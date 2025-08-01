public class PetWash {
    private int waterLevel;
    private int soapLevel;
    private boolean hasPet;
    private boolean isDirty;

    public PetWash() {
        this.waterLevel = 0;
        this.soapLevel = 0;
        this.hasPet = false;
    }

    public int getWaterLevel() {
        return waterLevel;
    }

    public int getSoapLevel() {
        return soapLevel;
    }

    public boolean hasPet() {
        return hasPet;
    }

    public void addWater() {
        if (waterLevel > 28) {
            System.out.println("Water tank is full.");
            return;
        }
        waterLevel += 2;
    }

    public void addSoap() {
        if (soapLevel > 8) {
            System.out.println("Soap dispenser is full.");
            return;
        }
        soapLevel += 2;
    }

    public void putPet(Pet pet) {
        if (hasPet){
            System.out.println("A pet is already in the wash.");
            return;
        }
        if(isDirty){
            System.out.println("The washing machine is dirty. Please clean it before adding a pet.");
            return;
        }
        hasPet = true;
        System.out.println("Pet added to the wash.");
    }

    public void removePet(Pet pet) {
        if (!hasPet) {
            System.out.println("No pet to remove.");
            return;
        }
        hasPet = false;
        System.out.println("Pet removed from the wash.");

        if (!pet.isClean()){
            System.out.println("Pet is not clean. Please, clean the washing machine.");
            isDirty = true;
        } 
    }

    public void washPet(Pet pet) {
        if (!hasPet) {
            System.out.println("No pet to wash.");
            return;
        }
        if (waterLevel < 10 || soapLevel < 2) {
            System.out.println("Not enough water or soap to wash the pet.");
            return;
        }
        pet.clean();
        waterLevel -= 10;
        soapLevel -= 2;
        System.out.println("Washing the pet...");
    }

    public void cleanMachine() {
        if (!isDirty) {
            System.out.println("Washing machine is not dirty.");
            return;
        } 
        if (waterLevel < 3 || soapLevel < 1) {
            System.out.println("Not enough water or soap to clean the machine.");
            return;
        }
        waterLevel -= 3;
        soapLevel -= 1;
        isDirty = false;
        System.out.println("Washing machine cleaned.");
    }

}
