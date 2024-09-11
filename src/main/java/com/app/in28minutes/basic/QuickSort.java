package com.app.in28minutes.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSort implements Sorting {

    @Override
    public void sort(int[] numbers) {
//        Sorting logic
    }
}
