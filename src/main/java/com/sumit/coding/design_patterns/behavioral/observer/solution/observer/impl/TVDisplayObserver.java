package com.sumit.coding.design_patterns.behavioral.observer.solution.observer.impl;

import com.sumit.coding.design_patterns.behavioral.observer.solution.observable.WeatherStationObservable;
import com.sumit.coding.design_patterns.behavioral.observer.solution.observer.DisplayObserver;

public class TVDisplayObserver implements DisplayObserver {

    WeatherStationObservable obj;

    public TVDisplayObserver(WeatherStationObservable o) {
        this.obj = o;
        obj.register(this);
    }

    @Override
    public void update(float temp) {
        System.out.println("[TV] Current conditions: " + temp + "°C");
    }
}
