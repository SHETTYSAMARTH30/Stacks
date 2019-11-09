class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        for(int i=0;i<nums1.length;i++){
            
            int id=0;
            int max=nums1[i];
            
            for(int j=0;j<nums2.length;j++){
                if(nums2[j]==nums1[i]){
                    id=j;
                    break;
                }
            }
            
            for(int k=id+1;k<nums2.length;k++){
                
                if(max<nums2[k]){
                    nums1[i]=nums2[k];
                    break;
                }
    
            }
            
            if(nums1[i]==max){
                nums1[i]=-1;
            }
        }
        return nums1;
    }
}
