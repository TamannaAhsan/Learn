package array;

import java.util.HashMap;
import java.util.Map;

public class ArrayBasic {
    public void findFrequencyInArray(int[] arr){
        Map<Integer, Integer> frequency = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            if(frequency.containsKey(arr[i])){
                frequency.put(arr[i], frequency.get(arr[i])+1);
            }
            else {
                frequency.put(arr[i],1);
            }
        }
        frequency.forEach((key, value)-> System.out.println("Number: "+key+" Number of occurance: "+value));
    }
}
