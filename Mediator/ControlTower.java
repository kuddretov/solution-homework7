import java.util.*;

public class ControlTower implements TowerMediator {
    private List<Aircraft> aircrafts = new ArrayList<>();
    private Queue<Aircraft> landingQueue = new LinkedList<>();
    private boolean runwayFree = true;

    public void registerAircraft(Aircraft a) {
        aircrafts.add(a);
    }

    @Override
    public void broadcast(String msg, Aircraft sender) {
        if ("MAYDAY".equalsIgnoreCase(msg)) {
            System.out.println("[ControlTower] EMERGENCY from " + sender.getId());
            clearRunwayForEmergency(sender);
        } else {
            for (Aircraft a : aircrafts) {
                if (a != sender) {
                    a.receive("[Tower Broadcast] " + msg);
                }
            }
        }
    }

    private void clearRunwayForEmergency(Aircraft emergencyAircraft) {
        runwayFree = true;
        for (Aircraft a : aircrafts) {
            if (a != emergencyAircraft) {
                a.receive("Hold position - Emergency landing in progress");
            }
        }
        System.out.println("[ControlTower] Emergency clearance granted to " + emergencyAircraft.getId());
        System.out.println("[ControlTower] --- " + emergencyAircraft.getId() + " lands immediately ---");
    }

    @Override
    public boolean requestRunway(Aircraft a) {
        if (a.isEmergency()) {
            broadcast("MAYDAY", a);
            return true;
        }
        if (runwayFree) {
            runwayFree = false;
            return true;
        } else {
            landingQueue.add(a);
            return false;
        }
    }
}
