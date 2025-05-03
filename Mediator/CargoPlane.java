public class CargoPlane extends Aircraft {
    public CargoPlane(String id, TowerMediator tower, boolean emergency) {
        super(id, tower, emergency);
    }

    @Override
    public void receive(String msg) {
        System.out.println("[CargoPlane " + id + "] received: " + msg);
    }

    @Override
    public void requestRunway() {
        if (tower.requestRunway(this)) {
            System.out.println("[CargoPlane " + id + "] granted access to runway.");
        } else {
            System.out.println("[CargoPlane " + id + "] waiting...");
        }
    }
}
