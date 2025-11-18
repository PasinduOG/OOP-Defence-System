package defenceSystem.controller;

import defenceSystem.model.DefenceObserver;
import java.util.ArrayList;

public class Controller<T extends DefenceObserver> {
    ArrayList<T> defenceList = new ArrayList<>();
}
