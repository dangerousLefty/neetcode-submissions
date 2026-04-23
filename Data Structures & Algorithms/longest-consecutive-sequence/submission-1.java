class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> uniqueNums = new HashSet<>();
        int maxConsecutiveSequence = 0;

        for (int i : nums){
            uniqueNums.add(i);
        }

        for (int i : nums){
            if (uniqueNums.contains(i-1)){
                continue;
            }
            else {
                int sequence = 1;
                int compare = i + 1;
                while (uniqueNums.contains(compare)){
                    sequence++;
                    compare++;
                }

                maxConsecutiveSequence = Math.max(maxConsecutiveSequence, sequence);
            }
        }
        
        return maxConsecutiveSequence;
    }
}
