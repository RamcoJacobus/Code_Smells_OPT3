class CursusUpdateManager {
    private LuisteraarManager luisteraarManager;

    public void setLuisteraarManager(LuisteraarManager luisteraarManager) {
        this.luisteraarManager = luisteraarManager;
    }

    public void setCursusUpdate(String cursusUpdate) {
        luisteraarManager.notifyAllObservers(cursusUpdate);
    }
}