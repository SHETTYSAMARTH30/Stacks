class RemMulDuplicates {
    public String removeDuplicates(String s, int k) {
        
        char c[]=new char[s.length()];
        int top=-1;
        int rear=-1;
        
        for(int i=0;i<s.length();i++){
            
            char ch=s.charAt(i);
            
            if(top==-1){
                top=top+1;
                rear=rear+1;
                c[top]=ch;
            }
            else if(c[top]!=ch){
                top=top+1;
                rear=rear+1;
                c[top]=ch;
            }
            else if(c[top]==ch){
                int count=0;
                top=top+1;
                rear=rear+1;
                c[top]=ch;
                for(int j=0;j<k;j++){
                    if((rear!=-1)&&(c[top]==c[rear])){
                        count++;
                        rear=rear-1;
                    }else{
                        rear=top;
                        break;
                    }
                }
                if(count==k){
                    top=top-k;
                    rear=top;
                }
                
            }
  
        }
                  
        String s1="";
  
        for(int l=0;l<=top;l++){
            Character c1=c[l];
            s1+=c1.toString();
        }
        return s1;
    }
}
