class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> radiantQueue = new LinkedList<>();
        Queue<Integer> direQueue = new LinkedList<>();
        int n = senate.length();

        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') {
                radiantQueue.offer(i);
            } else {
                direQueue.offer(i);
            }
        }

        while (!radiantQueue.isEmpty() && !direQueue.isEmpty()) {
            int radiantIndex = radiantQueue.poll();
            int direIndex = direQueue.poll();

            if (radiantIndex < direIndex) {
                radiantQueue.offer(radiantIndex + n);
            } else {
                direQueue.offer(direIndex + n);
            }
        }

        return radiantQueue.isEmpty() ? "Dire" : "Radiant";
    }
}