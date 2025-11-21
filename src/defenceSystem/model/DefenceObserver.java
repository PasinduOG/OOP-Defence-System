package defenceSystem.model;

public interface DefenceObserver {
    public void updateMessage(String message);
    public void clearArea(boolean clear);
    public void enableButtons(int value);
    public void engineRunning();
    public int getSoldierCount();
    public int getAmmoCount();
    public int getFuelCount();
}
