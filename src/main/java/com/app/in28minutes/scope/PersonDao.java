package com.app.in28minutes.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// "prototype" -> One instance per Spring context
// "singleton" -> New bean whenever requested
// "request" -> one bean per HTTP request
// "session" -> One bean per User session
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class PersonDao {

//    Whenever you are trying to get a bean and one of its dependency is of scope prototype
//    Then on dependency, we should use a proxy.
//    So whenever we try to get the bean and try to get the dependency, we get a new instance
    @Autowired
    JdbcConnection jdbcConnection;

    public JdbcConnection getJdbcConnection() {
        return jdbcConnection;
    }

    public void setJdbcConnection(JdbcConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }
}
