import java.util.ArrayList;

interface IsLandVehicle {
    void drive();
}

interface IsEmergency {
    void soundSiren();
}

class PoliceCar implements IsLandVehicle, IsEmergency {

     private int emergencyLevel;

     public PoliceCar(int emergencyLevel) {
        this.emergencyLevel = emergencyLevel;
     }

     public void drive() {
        System.out.println("Police car is driving.");
     }

     public void soundSiren() {
        System.out.println("Siren is ON!");
     }

     public void chaseSuspect() {
        System.out.println("Chasing suspect at level " + emergencyLevel);
     }
}

public class Main {
    public static void main(String[] args) {
        
        ArrayList<IsLandVehicle> myList = new ArrayList<>();

        PoliceCar policeCar = new PoliceCar(5);

        myList.add(policeCar);

        for (IsLandVehicle vehicle : myList) {
            vehicle.drive();
        }

        policeCar.soundSiren();
        policeCar.chaseSuspect();
    
    }
}