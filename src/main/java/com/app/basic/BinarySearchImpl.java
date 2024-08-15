package com.app.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

    private static Logger LOGGER = LoggerFactory.getLogger(SpbBasicApplication.class);

//    ------- Precedence -------
//    @Qualifier > @Primary > Auto-wiring by Name
    @Autowired
//    @Qualifier("quick")
    private Sorting mergeSort; //Auto-wiring by Name

//    ------- Constructor Injection -------
//    public BinarySearchImpl(Sorting sorting) {
//        this.sorting = sorting;
//    }

//    ------- Setter Injection -------
//    public void setSorting(Sorting sorting) {
//        this.sorting = sorting;
//    }

    public int binarySearch(int[] numbers, int target) {
//        1. Sorting array
        mergeSort.sort(numbers);
//        Tight Coupling
//        - If implemented sorting algorithm here and a change in sorting algorithm is needed,
//        we need to change binary search code i.e. BinarySearchImpl is tightly coupled with QuickSort
//        - So we declare a class outside this method and for dynamic binding we make use of interface
//         to dynamically bind the sorting class at runtime making application loosely coupled

//        Printing the sorting algorithm used
        System.out.println(mergeSort);

//        2. Search the array

//        3. Return result
        return 3;
    }

//    Called once the bean is created
    @PostConstruct
    public void postConstruct() {
        LOGGER.info("POST CONSTRUCT");
    }

//    Called before the bean is removed from the context/container
    @PreDestroy
    public void preDestroy() {
        LOGGER.info("PRE DESTROY");
    }
}
