public class Containerwithmostwater {
    public int maxArea(int[] height) {
        int maxarea = 0;
        int i = 0;
        int j = height.length -1;
        while(i<j){
            int currentarea = (j - i) * Math.min(height[i],height[j]);
            maxarea = Math.max(maxarea,currentarea);
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return maxarea;
    }
}
