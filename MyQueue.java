class MyQueue {

    /** Initialize your data structure here. */
    Deque<Integer> d=new ArrayDeque<Integer>();
    public MyQueue() {
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        d.addLast(x);
        
        
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return d.removeFirst();
    }
    
    /** Get the front element. */
    public int peek() {
        return d.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return d.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
