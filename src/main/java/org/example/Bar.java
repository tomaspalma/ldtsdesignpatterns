package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Bar {
    public abstract boolean isHappyHour();
    public abstract void startHappyHour();
    public abstract void endHappyHour();

    public void addObserver(BarObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(BarObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for(BarObserver observer: observers) {
            if(isHappyHour()) {
                observer.happyHourStarted(this);
            } else {
                observer.happyHourEnded(this);
            }
        }
    }

    protected boolean happyHour;
    protected List<BarObserver> observers = new ArrayList<>();
}
