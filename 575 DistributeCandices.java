import java.util.HashMap;
import java.util.Set;

class Solution {
    public int distributeCandies(int[] candies) {
        HashMap<Integer, Integer> result = new HashMap<Integer, Integer>();
        for(int i : candies){
            if (result.containsKey(i)){result.put(i, result.get(i)+1);}
            else {result.put(i, 1);}
        }
        Set keyset = result.keySet();
        int categorySize = keyset.size();
        int arrayLength = candies.length;
        if (categorySize >= (arrayLength/2)){ return arrayLength/2;}
        else{return categorySize;}
    }
}
