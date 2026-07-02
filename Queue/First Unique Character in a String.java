class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> m = new HashMap<>();
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!m.containsKey(ch)) {
                q.add(i);
            }

            m.put(ch, m.getOrDefault(ch, 0) + 1);

            while (!q.isEmpty() && m.get(s.charAt(q.peek())) > 1) {
                q.remove();
            }
        }

        return q.isEmpty() ? -1 : q.peek();
    }
}
