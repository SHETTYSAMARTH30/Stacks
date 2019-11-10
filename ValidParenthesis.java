class ValidParenthesis {
    public boolean isValid(String s) {
        
        Stack<Character> st=new Stack<Character>();
        int flag=1;
        
        if(s.equals(""))
            return true;
        
        for(int i=0;i<s.length();i++)
        {
            
            char c=s.charAt(i);
            
            if(st.empty()){
                st.push(c);
            }
            
            else if(c=='(' || c=='{' || c=='['){
                st.push(c);
            }
            
            else if(c==')' || c=='}' || c==']'){
                
                switch(c){
                    case ')':
                        if(st.peek()=='(')
                            st.pop();
                        else
                            flag=0;
                        break;
                    case '}':
                        if(st.peek()=='{')
                            st.pop();
                        else
                            flag=0;
                        break;
                    case ']':
                        if(st.peek()=='[')
                            st.pop();
                        else
                            flag=0;
                        break;
                }
                
            }
            
            if(flag==0){
                    break;
                }
            
        }
        
        if(st.empty()){
            return true;
        } else{
            return false;
        }
        
    }
}
