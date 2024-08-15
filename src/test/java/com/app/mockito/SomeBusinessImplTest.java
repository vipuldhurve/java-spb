package com.app.mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SomeBusinessImplTest {

    @Mock
    private SomeDataService dataServiceMock;

    @InjectMocks
    private SomeBusinessImpl someBusinessImpl;

    @Test
    public void findGreatestFromAllDataTest_ThreeValues() {
//        SomeDataService dataServiceMock = mock(SomeDataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{25, 5, 7});
//        SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServiceMock);
        assertEquals(25, someBusinessImpl.findGreatestFromAllData());
    }

    @Test
    public void findGreatestFromAllDataTest_EmptyArray() {
//        SomeDataService dataServiceMock = mock(SomeDataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{});
//        SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServiceMock);
        assertEquals(Integer.MIN_VALUE, someBusinessImpl.findGreatestFromAllData());
    }
}
