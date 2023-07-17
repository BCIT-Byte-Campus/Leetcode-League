class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        HashSet<Integer> occurrenceSet = new HashSet<>(countMap.values());
        return countMap.size() == occurrenceSet.size();
    }
}