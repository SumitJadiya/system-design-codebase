package com.sumit.coding.design_patterns.behavioral.observer.solution;

import com.sumit.coding.design_patterns.behavioral.observer.solution.observable.WeatherStationObservable;
import com.sumit.coding.design_patterns.behavioral.observer.solution.observable.impl.WeatherStationObservableImpl;
import com.sumit.coding.design_patterns.behavioral.observer.solution.observer.impl.MobileDisplayObserver;
import com.sumit.coding.design_patterns.behavioral.observer.solution.observer.impl.TVDisplayObserver;

public class MainClass {

    public static void main(String[] args) {
        WeatherStationObservable stationObservable = new WeatherStationObservableImpl();

        MobileDisplayObserver mobileDisplayObserver = new MobileDisplayObserver(stationObservable);
        TVDisplayObserver tvDisplayObserver = new TVDisplayObserver(stationObservable);

        stationObservable.setTemp(26f);
        System.out.println();
        stationObservable.setTemp(29f);
        System.out.println();
        stationObservable.setTemp(24f);
    }
}
