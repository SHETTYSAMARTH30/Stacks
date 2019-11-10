class MinStack {

    /** initialize your data structure here. */
    Stack<Integer> d=new Stack<Integer>();
    PriorityQueue<Integer> p=new PriorityQueue<>();
        
    public MinStack() {
        
        
    }
    
    public void push(int x) {
        d.push(x);
        p.add(x);
        
    }
    
    public void pop() {
        if(!d.empty()){
            int f=d.pop();
            p.remove(f);
        }
    }
    
    public int top() {
        int z=0;
        if(!d.empty())
            z=d.peek();
        return z;
        
    }
    
    public int getMin() {
        return p.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
