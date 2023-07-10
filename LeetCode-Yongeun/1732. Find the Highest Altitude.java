class Solution {
    public int largestAltitude(int[] gain) {
        int maximum = 0;
        int altitude = 0;
        
        for (int i = 0; i < gain.length; i++) {
            altitude += gain[i];
            if (altitude > maximum) {
                maximum = altitude;
            }
        }
        
        return maximum;
    }
}