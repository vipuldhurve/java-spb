package com.app.in28minutes.mockito;

public class SomeBusinessImpl {

    private SomeDataService dataService;

    public SomeBusinessImpl(SomeDataService someDataService) {
        super();
        this.dataService = someDataService;
    }

    public int findGreatestFromAllData() {
        int[] data = dataService.retrieveAllData();
        int greatestValue = Integer.MIN_VALUE;
        for (int value : data) {
            if (value > greatestValue) greatestValue = value;
        }
        return greatestValue;
    }
}
