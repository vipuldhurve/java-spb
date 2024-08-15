package com.app.cdi;

import org.springframework.beans.factory.annotation.Qualifier;

import javax.inject.Named;

@Named
public class SomeCdiDao {
    public int[] getData() {
        return new int[]{100, 50, 200, 300};
    }
}
