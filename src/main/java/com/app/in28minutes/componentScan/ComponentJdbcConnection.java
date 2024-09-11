package com.app.in28minutes.componentScan;

import org.springframework.stereotype.Component;

@Component
public class ComponentJdbcConnection {
    public ComponentJdbcConnection(){
        System.out.println("JDBC Conenction");
    }
}
