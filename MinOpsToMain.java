class MinOpsToMain {
    public int minOperations(String[] logs) {
        
        //Total number of moves in order to reach to main directory
        int result = 0;
        
        for(String s : logs){
            
            //Remain in same folder, hence we do nothing
            if(s.equals("./"))
                continue;
            
            //We need to move 1 step back to parent folder. If we are in main directory then stay there
            else if(s.equals("../"))
                    result = Math.max(0, --result);
            
            //Move to next directory. Hence we increment count by 1
            else
                result++;
        }
        
        return result;
    }
}
