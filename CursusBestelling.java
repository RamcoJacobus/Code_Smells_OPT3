abstract class CursusBestelling {
    abstract void selecteerCursus();
    abstract void betaal();
    abstract void leverCursusmateriaal();

    public final void orderproces() {
        selecteerCursus();
        betaal();
        leverCursusmateriaal();
    }
}

class DuikCursusBestelling extends CursusBestelling {
    @Override
    void selecteerCursus() {
        System.out.println("Duikcursus geselecteerd");
    }

    @Override
    void betaal() {
        System.out.println("Betaling voor duikcursus voltooid");
    }

    @Override
    void leverCursusmateriaal() {
        System.out.println("Cursusmateriaal voor duikcursus geleverd");
    }
}

class SnorkelCursusBestelling extends CursusBestelling {
    @Override
    void selecteerCursus() {
        System.out.println("Snorkelcursus geselecteerd");
    }

    @Override
    void betaal() {
        System.out.println("Betaling voor snorkelcursus voltooid");
    }

    @Override
    void leverCursusmateriaal() {
        System.out.println("Cursusmateriaal voor snorkelcursus geleverd");
    }
}