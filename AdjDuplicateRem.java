class AdjDuplicateRem {
    public String removeDuplicates(String S) {
        
        Stack<Character> s=new Stack<Character>();
        String rem="";
        
        for(int i=0;i<S.length();i++){
            
            char c=S.charAt(i);
            
            if(s.empty()){
                s.push(c);
            }
            else if(c==s.peek()){
                s.pop();
            }
            else{
                s.push(c);
            }
        }
        
        while(!s.empty()){
            Character c1=s.pop();
            rem=c1.toString()+rem;
        }
        return rem;
    }
}
