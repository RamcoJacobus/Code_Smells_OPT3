import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        CursusBestelling cursusBestelling1 = new DuikCursusBestelling();
        cursusBestelling1.orderproces();
        CursusBestelling cursusBestelling2 = new SnorkelCursusBestelling();
        cursusBestelling2.orderproces();

        LuisteraarManager luisteraarManager = new LuisteraarManager();
        luisteraarManager.addLuisteraar(new Duikcentrum());
        luisteraarManager.addLuisteraar(new Instructeur("John"));
        luisteraarManager.addLuisteraar(new Instructeur("Emily"));

        CursusUpdateManager cursusUpdateManager = new CursusUpdateManager();
        cursusUpdateManager.setLuisteraarManager(luisteraarManager);
        cursusUpdateManager.setCursusUpdate("Nieuwe duikcursus beschikbaar!");
        cursusUpdateManager.setCursusUpdate("Snorkelcursus geannuleerd.");
    }
}