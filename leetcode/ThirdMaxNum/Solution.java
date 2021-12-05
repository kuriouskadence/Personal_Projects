public class ThirdMaxNum{


    public int thirdMax(int [] nums){
        int[] maxes = new int[0];
        While(nums.length > 0 && maxes.length < 3){
            if(maxes.length != 3){
               return maxes[0];
            } else{
                return maxes[2];
            }
        }
    }

    
    public int findMax(int [] numms, int max){
        int max[0];
        for(int i = 1; i < numms.length; i++){
            if(numms[i] > max){
                max = numms[i];
            }
        }
    }

    public int[] removeMax(int[] origArr, int max){
        int checkMax = 0;
        int[] remoMax = new int [origArr.length];
        for(int i = 0; i < origArr.length; i++){
            if(origArr[i] != max){
                remoMax[checkMax] = origArr[i];
            }
        } checkMax++;
    }

        public int[] addMax(int[] maxesArr, int max){
            int[] plusMax = new int[maxesArr.length];
            for(int i = 0; i < maxes.length; i++){
                plusMax[i] = maxes[i];
            }
        }


}