public abstract class Aircraft {
    protected String id;
    protected TowerMediator tower;
    protected boolean emergency;

    public Aircraft(String id, TowerMediator tower, boolean emergency) {
        this.id = id;
        this.tower = tower;
        this.emergency = emergency;
    }

    public void send(String msg) {
        tower.broadcast(msg, this);
    }

    public abstract void receive(String msg);
    public abstract void requestRunway();

    public boolean isEmergency() {
        return emergency;
    }

    public String getId() {
        return id;
    }
}
