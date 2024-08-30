package com.in28minutes.SpringBootUnitTestingandMockingwithMockitoandJUnit.mockito.mockitodemo;

import org.springframework.stereotype.Service;

@Service
public class BusinessService {
    private DataService dataService;

    public BusinessService(DataService dataService){
        super();
        this.dataService = dataService;
    }

    public int findGreatestOfAll(){
        int[] nums = dataService.retrieveAllData();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if(max < nums[i]){
                max = nums[i];
            }
        }
        return max;
    }
}
