class Solution {
    public int countWords(String[] words1, String[] words2) {

        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        for (String a : words1) {
            map1.merge(a, 1, Integer::sum);
        }

        for (String a : words2) {
            map2.merge(a, 1, Integer::sum);
        }

        int count = 0;

        for (String a : map1.keySet()) {
            if (map1.get(a) == 1 && map2.getOrDefault(a, 0) == 1) {
                count++;
            }
        }

        return count;
    }
}