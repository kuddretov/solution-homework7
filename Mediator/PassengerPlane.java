public class PassengerPlane extends Aircraft {
    public PassengerPlane(String id, TowerMediator tower, boolean emergency) {
        super(id, tower, emergency);
    }

    @Override
    public void receive(String msg) {
        System.out.println("[PassengerPlane " + id + "] received: " + msg);
    }

    @Override
    public void requestRunway() {
        if (tower.requestRunway(this)) {
            System.out.println("[PassengerPlane " + id + "] granted access to runway.");
        } else {
            System.out.println("[PassengerPlane " + id + "] waiting...");
        }
    }
}
