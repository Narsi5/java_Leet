public class SortColour {
    public void sortColors(int[] nums) {
        int i=0,min,j=1,temp;
        while(i<nums.length-1){
            j=j +1;
            min=i;
            while(j<nums.length){
                if(nums[j]<nums[min]){
                    min=j;
                }
                j++;
            }
            temp=nums[i];
            nums[i]=nums[min];
            nums[min]=temp;
            i++;
        }
    }

}

