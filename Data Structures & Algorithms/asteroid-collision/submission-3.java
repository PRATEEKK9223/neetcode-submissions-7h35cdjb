class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();

        for(int ele:asteroids){
            if(ele>0){
                stack.push(ele);
            }else{
                while(!stack.isEmpty() && stack.peek()>0 && stack.peek()<Math.abs(ele)){
                    stack.pop();
                }
                if(!stack.isEmpty() && stack.peek()==Math.abs(ele)){
                    stack.pop();
                }else if(stack.isEmpty() || stack.peek() < 0){
                    stack.push(ele);
                }
            }
        }
        
        int[] result=new int[stack.size()];
        int i=stack.size()-1;
        while(!stack.isEmpty()){
            result[i]=stack.pop();
            i--;
        }

        return result;
    }
}