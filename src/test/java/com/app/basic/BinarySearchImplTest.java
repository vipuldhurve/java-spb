package com.app.basic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = SpbBasicApplication.class)
public class BinarySearchImplTest {

    @Autowired
    BinarySearchImpl binarySearchImpl;

    @Test
    public void binarySearchTest() {
        int actualResult = binarySearchImpl.binarySearch(new int[]{}, 1);
        assertEquals(3, actualResult);
    }
}
