import java.util.ArrayList;
import java.util.List;

public abstract class ActionBase {
    private final List<PortfeuilBase> profils = new ArrayList<>();

    public void attach(PortfeuilBase p){
        profils.add(p);
    }

    public void detach(PortfeuilBase p){
        profils.remove(p);
    }

    public void notifier() {
        for (PortfeuilBase portfeuilBase : profils){
            portfeuilBase.update();
        }
    }
}
