class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sMap = new HashMap<>();

        //populating sMap from String s
        for (char i : s.toCharArray()){
            if (!sMap.containsKey(i)){
                sMap.put(i, 1);
            }
            else {
                sMap.put(i, sMap.get(i) + 1);
            }
        }

        //compare s with t
        for (char j : t.toCharArray()){
            if (!sMap.containsKey(j)){
                return false;
            }
            else {
                sMap.put(j, sMap.get(j) - 1);

                if (sMap.get(j) == 0){
                    sMap.remove(j);
                }
            }
        }

        if (sMap.size() > 0){
            return false;
        }
        return true;
    }
}
