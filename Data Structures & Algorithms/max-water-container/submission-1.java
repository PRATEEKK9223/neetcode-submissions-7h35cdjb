class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j=heights.length-1;
        int maxWater=0;
        while(i<j){
            int w=j-i;
            int h=Math.min(heights[i],heights[j]);
            int area=h*w;
            maxWater=Math.max(area,maxWater);
            int ran=heights[i] < heights[j] ? i++ :j-- ;
        }

        return maxWater;
    }
}
