package com.courses.spring.basics.springin5steps;

public class  BinarySearchImpl  {
      
    private SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        super();
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int numbersToSearchFor) {
       
        //BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
        
        int[] sortedNumbers =  bubbleSortAlgorithm.sort(numbers);
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