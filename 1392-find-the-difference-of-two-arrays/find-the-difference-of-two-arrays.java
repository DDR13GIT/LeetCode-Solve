class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        for (int i : nums1) {
            s1.add(i);
        }
        for (int i : nums2) {
            s2.add(i);
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int i : s1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i : s2) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        List<List<Integer>> answer = new ArrayList<>();

        for (int i : s1) {
            if (map.containsKey(i) && map.get(i) == 1) {
                l1.add(i);
            }
        }
        for (int i : s2) {
            if (map.containsKey(i) && map.get(i) == 1) {
                l2.add(i);
            }
        }
        answer.add(l1);
        answer.add(l2);

        return answer;
    }
}