import java.util.ArrayList;
import java.util.List;

class LuisteraarManager {
    private List<CursusObserver> luisteraars;

    public LuisteraarManager() {
        luisteraars = new ArrayList<>();
    }

    public void addLuisteraar(CursusObserver luisteraar) {
        luisteraars.add(luisteraar);
    }

    public void notifyAllObservers(String cursusUpdate) {
        for (CursusObserver observer : luisteraars) {
            observer.update(cursusUpdate);
        }
    }
}