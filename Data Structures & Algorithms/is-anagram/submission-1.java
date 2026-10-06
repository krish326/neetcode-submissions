class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            int temp = map.getOrDefault(s.charAt(i), 0) + 1;

            map.put(s.charAt(i), temp);
        }

        for (char c : t.toCharArray()) {
            if (map.containsKey(c)) {
                int temp = map.get(c);
                temp--;
                if (temp <= 0) {
                    map.remove(c);
                } else {
                    map.put(c, temp);
                }
            } else {
                return false;
            }
        }

        if (!map.isEmpty()) {
            return false;
        }
        return true;
    }
}
