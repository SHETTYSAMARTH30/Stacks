class Baseball {
    public int calPoints(String[] ops) {
        
        int top=-1;
        int rear=-2;
        int a[]=new int[ops.length];
        int sum=0;
        int b=0;
        
        for(int i=0;i<ops.length;i++){
            
            if((ops[i]).equals("C")){
                
                if(top==-1){
                    continue;
                }else{
                    sum=sum-a[top];
                    top=top-1;
                    rear=rear-1;
                }
            }
            
            else if((ops[i]).equals("D")){
                if(top==-1){
                    continue;
                }
                else {
                    top=top+1;
                    rear=rear+1;
                    a[top]=a[rear]*2;
                    sum=sum+a[top];
                }
            }
            
            else if((ops[i]).equals("+")){
                
                if(top==-1){
                    continue;
                }
                else if(top==0){
                    top=top+1;
                    rear=rear+1;
                    a[top]=a[rear];
                    sum=sum+a[top];
                }
                else{
                    int b1=a[top]+a[rear];
                    top=top+1;
                    rear=rear+1;
                    a[top]=b1;
                    sum=sum+b1;   
                }
            }
            
            else{
                
                String s1=ops[i];
                int c1=Integer.parseInt(s1);
                top=top+1;
                rear=rear+1;
                a[top]=c1;
                sum=sum+c1;
            }
        }
        return sum;
    }
}
