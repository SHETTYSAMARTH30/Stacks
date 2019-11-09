class BackSpaceComp {
    public boolean backspaceCompare(String S, String T) {
        
        Stack<Character> st=new Stack<Character>();
        Stack<Character> st1=new Stack<Character>();
        
        for(int i=0;i<S.length();i++){
            
            char c=S.charAt(i);
            
            if(c=='#'){
                if(st.empty()){
                    continue;
                }
                st.pop();
            }
            else{
                st.push(c);
            }
        }
        
        for(int j=0;j<T.length();j++){
            
            char c1=T.charAt(j);
            if(c1=='#'){
                if(st1.empty()){
                    continue;
                }
                st1.pop();
            }
            else{
                st1.push(c1);
            }
        }
        
        return (st.equals(st1));
        
    }
}
