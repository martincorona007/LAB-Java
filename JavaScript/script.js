var findMaxConsecutiveOnes = function(nums) {
  let aux=0;
  let maxOnes = 0;
  for(let i = 0 ; i < nums.length;i++){
      console.log("o ",nums);
      switch(nums[i]){
              case 0:
                   //   System.out.println("NOP");
                      aux = maxOnes;
                      maxOnes = 0;
                      //System.out.println("nums["+nums[i] +"] aux "+aux+" maxOnes "+maxOnes);
                  break;
              case 1:
                  maxOnes++; 
                  //System.out.println("YES");
                  //System.out.println("nums["+nums[i] +"] aux "+aux+" maxOnes "+maxOnes);
                  break;
      }
  }
  return (maxOnes > aux)? maxOnes : aux;;
};