package mera.education;

import java.util.ArrayList;
import java.util.List;

public class StringContainer {

    private List<String> container = new ArrayList<>();

    List<StringObserver> observers = new ArrayList<>();


    public void addString(String str) {
        container.add(str);
        for (StringObserver observer : observers) {
            observer.notifyStringAdded(str);
        }
    }

    public void addObserver(StringObserver newObserver) {
        observers.add(newObserver);
    }
}
