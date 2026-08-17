import java.util.*;

class MyQueue {
    Stack<Integer> s1 = new Stack<>(); // Input Stack
    Stack<Integer> s2 = new Stack<>(); // Output Stack

    public MyQueue() {
    }
    
    public void push(int x) {
        s1.push(x); // O(1)
    }
    
    public int pop() {
        shiftStacks();
        return s2.pop(); // O(1) amortized
    }
    
    public int peek() {
        shiftStacks();
        return s2.peek(); // O(1) amortized
    }
    
    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }

    // Helper function duplicate code bachane ke liye
    private void shiftStacks() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
    }
}