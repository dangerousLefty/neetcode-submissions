class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexTracker = new HashMap<>();

        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++){
            int contains = target - nums[i];
            if (!indexTracker.containsKey(contains)){
                indexTracker.put(nums[i], i);
            }

            else {
                result[0] = indexTracker.get(contains);
                result[1] = i;
                break;
            }
        }
        return result;
    }
}
