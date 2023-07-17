class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
 
        HashSet<Integer> firstList = new HashSet<>();
        HashSet<Integer> secondList = new HashSet<>();

        List<HashSet<Integer>> result = new ArrayList();

        for (int i = 0; i < nums1.length; i++) {
        boolean found = false;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                firstList.add(nums1[i]);
            }
        }

        for (int i = 0; i < nums2.length; i++) {
        boolean found = false;
            for (int j = 0; j < nums1.length; j++) {
                if (nums2[i] == nums1[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                secondList.add(nums2[i]);
            }
        }

        result.add(firstList);
        result.add(secondList);

        List<List<Integer>> resultList = new ArrayList<>();
        for (HashSet<Integer> set : result) {
            List<Integer> list = new ArrayList<>(set);
            resultList.add(list);
        }

        return resultList;
    }
}