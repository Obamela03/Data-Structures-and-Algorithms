package org.example.SearchAlgorithms;

public class LinearSearch
{
    public static int linearSearch(int [] array, int target){
        for (int i: array){
            if (array[i] == target)
                System.out.println(target + " is found on index " + i);
        }
    return -1; //NOT_FOUND = -1
    }
}
