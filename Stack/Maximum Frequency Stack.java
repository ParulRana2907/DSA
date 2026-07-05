class FreqStack {
    Map<Integer, Integer> freq = new HashMap<>();
    Map<Integer, Stack<Integer>> group = new HashMap<>();
    int max = 0;

    public FreqStack() {}

    public void push(int val) {
        int f = freq.getOrDefault(val, 0) + 1;
        freq.put(val, f);

        max = Math.max(max, f);
        group.computeIfAbsent(f, k -> new Stack<>()).push(val);
    }

    public int pop() {
        int val = group.get(max).pop();
        freq.put(val, freq.get(val) - 1);

        if (group.get(max).isEmpty()) max--;
        return val;
    }
} 
