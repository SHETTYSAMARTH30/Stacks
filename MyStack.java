class MyStack {

    /** Initialize your data structure here. */
    Deque<Integer> d=new ArrayDeque<Integer>();
    public MyStack() {
        
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        d.add(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return d.removeLast();
    }
    
    /** Get the top element. */
    public int top() {
        return d.getLast();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return d.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
