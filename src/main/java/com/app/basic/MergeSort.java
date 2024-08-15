package com.app.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("merge")
public class MergeSort implements Sorting {


    @Override
    public void sort(int[] numbers) {
//        Sorting logic
    }
}
