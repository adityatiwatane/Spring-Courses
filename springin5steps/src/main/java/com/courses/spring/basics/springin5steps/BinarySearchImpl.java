package com.courses.spring.basics.springin5steps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class  BinarySearchImpl  {

    @Autowired
    private SortAlgorithm sortAlgorithm;

    public void setSortAlgorithm( SortAlgorithm sortAlgorithm ) {
        this.sortAlgorithm = sortAlgorithm;
    }
    public int binarySearch(int[] numbers, int numbersToSearchFor) {
       
        //BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
        
        int[] sortedNumbers =  sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);
         //implementing sorting logic 
        //search the array
        //return the result
        return 3;
    }
    //sorting an array 

    //seARCH THE ARRAY
    //search the result
}