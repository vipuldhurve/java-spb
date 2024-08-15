package com.app.componentScan;

import org.springframework.stereotype.Component;

@Component
public class ComponentJdbcConnection {
    public ComponentJdbcConnection(){
        System.out.println("JDBC Conenction");
    }
}
