class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int max = 0;
        HashSet<Character> set = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        int start = 0,end=0;
        if(set.contains(s.charAt(end))) count++;
        while(end<s.length()-1){
            end++;
            if(set.contains(s.charAt(end))) count++;
            if(end-start>=k){
                if(set.contains(s.charAt(start))){
                    count--;
                }
                start++;
            }
            max = Math.max(max,count);
            
        }
        return max;
    }
}