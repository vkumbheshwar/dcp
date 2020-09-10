package practice.dcp.day1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 */
public class FindPairWithSumk
{
    
    public static boolean findPairWithSumk(Integer[] inputArray, Integer k)
    {
        Set<Integer> inputSet = new HashSet<Integer>(Arrays.asList(inputArray));
        Optional<Integer> firstElement = inputSet.stream().filter(n -> inputSet.contains(k - n)).findFirst();
        return firstElement.isPresent();        
    }
    
    public static void main(String[] args)
    {
        Integer[] inputArray = new Integer[] {10, 15, 3, 7};
        System.out.println(findPairWithSumk(inputArray, 18));
    }
    
    

}
