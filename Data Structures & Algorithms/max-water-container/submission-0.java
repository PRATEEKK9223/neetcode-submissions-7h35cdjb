class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j=heights.length-1;
        int maxArea=0;
        while(i<j){
            int area;
            if(heights[i]<heights[j]){
                area=heights[i]*(j-i);
                i++;
            }else{
                area=heights[j]*(j-i);
                j--;
            }
            if(maxArea<area){
                maxArea=area;
            }
        }
    return maxArea;

    }
}
