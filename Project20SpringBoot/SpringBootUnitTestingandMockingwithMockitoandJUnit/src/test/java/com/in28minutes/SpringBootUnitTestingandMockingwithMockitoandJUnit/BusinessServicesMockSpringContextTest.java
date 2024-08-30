package com.in28minutes.SpringBootUnitTestingandMockingwithMockitoandJUnit;

import com.in28minutes.SpringBootUnitTestingandMockingwithMockitoandJUnit.mockito.mockitodemo.BusinessService;
import com.in28minutes.SpringBootUnitTestingandMockingwithMockitoandJUnit.mockito.mockitodemo.DataService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BusinessServicesMockSpringContextTest {

	@MockBean
	DataService dataServiceMock;

	@Autowired
	BusinessService businessImpl;

	@Test
	public void testFindTheGreatestFromAllData() {
		Mockito.when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 24, 15, 3 });
		Assert.assertEquals(24, businessImpl.findGreatestOfAll());
	}

	@Test
	public void testFindTheGreatestFromAllData_ForOneValue() {
		Mockito.when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 15 });
		Assert.assertEquals(15, businessImpl.findGreatestOfAll());
	}

	@Test
	public void testFindTheGreatestFromAllData_NoValues() {
		Mockito.when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
		Assert.assertEquals(Integer.MIN_VALUE, businessImpl.findGreatestOfAll());
	}
}