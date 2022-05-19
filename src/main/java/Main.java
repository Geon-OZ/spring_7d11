import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random random = new Random();
        Bus bus1 = new Bus(random.nextInt(50));
        Bus bus2 = new Bus(random.nextInt(50));

        bus1.showInfo();
        bus1.drive();
        bus1.takeBus(2);
        bus1.minOil(50);
        bus1.checkOil();
        bus1.changeStatus();
        bus1.pluOil(10);
        bus1.checkOil();
        bus1.changeStatus();
        bus1.takeBus(45);
        bus1.takeBus(5);
        bus1.rightNow();
        bus1.minOil(45);
        bus1.checkOil();
        bus1.minOil(10);
        bus1.checkOil();
        bus1.showInfo();

        Taxi taxi1 = new Taxi(random.nextInt(9999));
        Taxi taxi2 = new Taxi(random.nextInt(9999));

        taxi1.takeTaxi(2, "Seoul", 2);
        taxi1.feeInfo();
        taxi1.minOil(80);
        taxi1.takeFee();
        taxi1.check();
        taxi1.takeTaxi(5,"ansan", 50);
        taxi1.takeTaxi(3,"Guro",12);
        taxi1.feeInfo();
        taxi1.minOil(20);
        taxi1.takeFee();
        taxi1.check();
    }
}
