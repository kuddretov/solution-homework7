import java.util.*;

public class SimulationDriver {
    public static void main(String[] args) throws InterruptedException {
        ControlTower tower = new ControlTower();

        List<Aircraft> planes = new ArrayList<>();
        planes.add(new PassengerPlane("P001", tower, false));
        planes.add(new CargoPlane("C001", tower, false));
        planes.add(new PassengerPlane("P002", tower, false));
        planes.add(new CargoPlane("C002", tower, true)); // Emergency

        for (Aircraft a : planes) tower.registerAircraft(a);

        for (Aircraft a : planes) {
            Thread.sleep(1000);
            a.requestRunway();
        }
    }
}
