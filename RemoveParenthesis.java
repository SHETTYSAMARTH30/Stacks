class RemoveParenthesis {
    public String removeOuterParentheses(String S) {
        
        Stack<Character> st=new Stack<>();
        
        String ans="";
        for(int i=0;i<S.length();i++){
            
            if(S.charAt(i)== '(' && st.isEmpty()){
                st.push(S.charAt(i));
            }
            else if(S.charAt(i)=='('){
                st.push(S.charAt(i));
                ans+=S.charAt(i);
            }
            else{
                st.pop();
                if(!st.isEmpty()){
                    ans+=S.charAt(i);
                }
            }
        }
        return ans;
    }
}
