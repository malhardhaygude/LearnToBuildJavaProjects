package com.in28minutes.SpringBootUnitTestingandMockingwithMockitoandJUnit;

import com.in28minutes.SpringBootUnitTestingandMockingwithMockitoandJUnit.mockito.mockitodemo.BusinessService;
import com.in28minutes.SpringBootUnitTestingandMockingwithMockitoandJUnit.mockito.mockitodemo.DataService;
import org.h2.store.Data;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;



@RunWith(MockitoJUnitRunner.class)
public class BusinessServiceMockTest {
   @Mock
   DataService dataService;

   @InjectMocks
   BusinessService businessService;

   @Test
   public void TestFindGreatestOfAll(){
         Mockito.when(dataService.retrieveAllData()).thenReturn(new int[]{256,17,12});
         Assert.assertEquals(256, businessService.findGreatestOfAll());
   }

    @Test
    public void testFindTheGreatestFromAllData_ForOneValue() {
            Mockito.when(dataService.retrieveAllData()).thenReturn(new int[]{ 45 });
            Assert.assertEquals(45, businessService.findGreatestOfAll());
    }

    @Test
    public void testFindTheGreatestFromAllData_ForNoValue() {
        Mockito.when(dataService.retrieveAllData()).thenReturn(new int[]{ 0 });
        Assert.assertEquals(0, businessService.findGreatestOfAll());
    }

    }
