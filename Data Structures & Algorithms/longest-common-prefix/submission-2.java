class Solution {
    public String longestCommonPrefix(String[] strs) {
        //example ["bat", "bag", "bank", "band"]

        StringBuilder str = new StringBuilder();

        //take the first String as reference
        String referernce = strs[0]; 
        //dance
        
        //iterate over each letter of reference str untill some string is out of bounds, or a char is mismatch
        for (int i = 0; i < referernce.length(); i++){
            char ptr = referernce.charAt(i); // start with 'b' then 'a' .... 
            //'d'
            // ptr = 'a'

            for (int j = 1; j < strs.length; j++){ //j starts with 1 because you start comparing with second string in arr
                //j = 2
                String temp = strs[j];
                //danger
                //suppose ranger

                //if (temp.length() < 1 || temp.charAt(i) != ptr){
                if (i >= temp.length() || temp.charAt(i) != ptr){
                    //character missmatch, return the string formed till now
                    //return str.toString();
                    return str.toString();
                }

            }
                str.append(ptr);
            }
            return str.toString();
        }
        
    }