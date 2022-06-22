class Solution {
    
    public int findMaxConsecutiveOnes(int[] nums) {
         int aux=0;
         int maxOnes = 0;
        for(int i = 0;i < nums.length; i++){
            switch(nums[i]){
                case 0:
                     //   System.out.println("NOP");
                        aux = maxOnes;
                        maxOnes = 0;
                        System.out.println("nums["+nums[i] +"] aux "+aux+" maxOnes "+maxOnes);
                    break;
                case 1:
                    maxOnes++; 
                    //System.out.println("YES");
                    System.out.println("nums["+nums[i] +"] aux "+aux+" maxOnes "+maxOnes);
                    break;
            }
        }
        return (maxOnes > aux)? maxOnes : aux;
    }
}
public static void main(String[] args)
    {
             
      
        System.out.println(findMaxConsecutiveOnes(arr));
    }