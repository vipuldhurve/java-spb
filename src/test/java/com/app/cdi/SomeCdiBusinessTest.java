package com.app.cdi;

import com.app.in28minutes.cdi.SomeCdiBusiness;
import com.app.in28minutes.cdi.SomeCdiDao;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@ContextConfiguration(classes = SomeCdiBusiness.class)
public class SomeCdiBusinessTest {

    @InjectMocks
    SomeCdiBusiness business;

    @Mock
    SomeCdiDao daoMock;

    @Test
    public void findGreatestTest() {
        when(daoMock.getData()).thenReturn(new int[]{2, 10, 4});
        assertEquals(10, business.findGreatest());
    }
}
