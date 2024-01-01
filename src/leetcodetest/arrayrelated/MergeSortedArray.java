package leetcodetest.arrayrelated;

class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
           int mergedArray[] = new int[nums1.length];
        int i = 0, j = 0;
        for(int k = 0 ; k < nums1.length ; k++){
            if(j >= n){
                mergedArray[k] = nums1[i];
                i++;
            }else{
            if(i < m && nums1[i] <= nums2[j] ){
                mergedArray[k] = nums1[i];
                i++;
            }else{
                if(  j < n){
                 mergedArray[k] = nums2[j];
                j++;
                }
            }
            }
        }
        
        for(int k = 0 , l = 0; k < nums1.length ; k++){
                nums1[k] = mergedArray[k] ;
        }
            
    }
    
}