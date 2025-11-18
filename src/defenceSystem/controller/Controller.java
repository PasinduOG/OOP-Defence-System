package defenceSystem.controller;

import defenceSystem.model.DefenceObserver;
import java.util.ArrayList;

public class Controller<T extends DefenceObserver> {
    private ArrayList<T> defenceList = new ArrayList<>();
    
    public void addDefence(T obj){
        defenceList.add(obj);
    }
    
    public void updateDefence(String message){
        for (T obj : defenceList) {
            obj.updateMessage(message);
        }
    }
    
    public void setAreaClearMessage(boolean clear){
        for (T obj : defenceList) {
            obj.clearArea(clear);
        }
    }
    
    public void enableButtons(int value){
        for (T obj : defenceList) {
            obj.enableButtons(value);
        }
    }
}
