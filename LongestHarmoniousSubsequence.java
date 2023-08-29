import java.util.HashMap;

public class LongestHarmoniousSubsequence {

       public static void main(String[] args) {
        int[] firstSequence = {1, 3, 2, 2, 5, 2, 3, 7};
        System.out.println(getHarmoniousSubsequence(firstSequence)); 
        
        
        int[] secondSequence = {1, 2, 3, 4};
        System.out.println(getHarmoniousSubsequence(secondSequence));  

        
        int[] thirdSequence = {1, 1, 1, 1};
        System.out.println(getHarmoniousSubsequence(thirdSequence)); 
    }

    public static int getHarmoniousSubsequence(int[] nums) {

        int maxLength = 0;
        HashMap<Integer, Integer> numFreq = new HashMap<>();
        
        for (int num : nums) {
            numFreq.put(num, numFreq.getOrDefault(num, 0) + 1);
        }
        
        for (int num : numFreq.keySet()) {
            if (numFreq.containsKey(num + 1)) {
                maxLength = Math.max(maxLength, numFreq.get(num) + numFreq.get(num + 1));
            }
        }
    
        return maxLength;
    }
    
}
