import java.util.*;

class MyStack {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public MyStack() {}

    public void push(int x) {
        // Step 1: Naya element q2 mein dalo
        q2.add(x);

        // Step 2: q1 ke saare elements q2 mein shift kar do
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        // Step 3: q1 aur q2 ko swap kar do
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
        return q1.remove(); // Direct O(1)
    }

    public int top() {
        return q1.peek(); // Direct O(1)
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}