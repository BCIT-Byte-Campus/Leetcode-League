import java.util.StringTokenizer;

class Solution {
    public String reverseWords(String s) {
        StringTokenizer str = new StringTokenizer(s);
        List<String> list = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        while (str.hasMoreTokens()) {
            list.add(str.nextToken());
        }

        for(int i=list.size()-1; i>=0; i--){
            sb.append(list.get(i));
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}