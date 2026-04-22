class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int size=temperatures.length;
        int[] result = new int[size];

        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<size;i++){
            while(!stack.isEmpty() && temperatures[stack.peek()]<temperatures[i]){
                result[stack.peek()]=i-stack.pop();
            }
            stack.push(i);
           
        }

        return result;
    }
}
