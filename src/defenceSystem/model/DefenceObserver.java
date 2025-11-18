package defenceSystem.model;

public interface DefenceObserver {
    public void updateMessage(String message);
    public void clearArea(boolean clear);
    public void enableButtons(int value);
}
