import java.util.ArrayList;
import java.util.List;

public abstract class ActionBase {
    private final List<PortfeuilleBase> profils = new ArrayList<>();

    public void attach(PortfeuilleBase p){
        profils.add(p);
    }

    public void detach(PortfeuilleBase p){
        profils.remove(p);
    }

    public void notifier() {
        for (PortfeuilleBase portfeuilBase : profils){
            portfeuilBase.update();
        }
    }
}
