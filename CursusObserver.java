interface CursusObserver {
    void update(String cursusUpdate);
}

class Duikcentrum implements CursusObserver {
    @Override
    public void update(String cursusUpdate) {
        System.out.println("Duikcentrum: " + cursusUpdate);
    }
}

class Instructeur implements CursusObserver {
    private String naam;

    public Instructeur(String naam) {
        this.naam = naam;
    }

    @Override
    public void update(String cursusUpdate) {
        System.out.println("Instructeur " + naam + ": " + cursusUpdate);
    }
}