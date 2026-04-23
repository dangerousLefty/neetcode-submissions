class Solution {

    public String encode(List<String> strs) {
        StringBuilder builder = new StringBuilder();

        for (String s : strs){
            builder.append(s.length());
            builder.append(';');
            builder.append(s);
        }

        //System.out.println(builder.toString());
        return builder.toString();
    }

    public List<String> decode(String str) {
        List<String> returnList = new ArrayList<>();
        if (str.length() == 0){return returnList;}

        StringBuilder lengthBuilder = new StringBuilder();

        int ptr = 0;
        while (ptr < str.length()){
            while (str.charAt(ptr) != ';'){
                lengthBuilder.append(str.charAt(ptr));
                ptr++;
            }

            int length = Integer.parseInt(lengthBuilder.toString());
            String word = str.substring(ptr+1, ptr + 1 + length);
            returnList.add(word);

            ptr = ptr + 1 + length;
            lengthBuilder.setLength(0);
        }
        return returnList;
    }
}
