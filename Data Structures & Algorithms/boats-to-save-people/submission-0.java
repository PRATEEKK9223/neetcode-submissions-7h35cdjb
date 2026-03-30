class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int i=0;
        int j=people.length-1;
        int boat=0;
        Arrays.sort(people);
        while(i<=j){
            if(people[i]+people[j]<=limit){
                boat+=1;
                i++;
                j--;
            }else if(people[i]+people[j]>limit){
                boat+=1;
                j--;
            }
        }

        return boat;
    }
}