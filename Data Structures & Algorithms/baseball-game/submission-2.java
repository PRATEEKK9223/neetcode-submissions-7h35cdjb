class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        for(String op:operations){
            if(op.equals("+")){
                int top=stack.pop();
                int newtop=stack.peek()+top;
                stack.push(top);
                stack.push(newtop);
            }else if(op.equals("D")){
                stack.push(2*stack.peek());
            }else if(op.equals("C")){
                stack.pop();
            }else{
                int temp=Integer.parseInt(op);
                stack.push(temp);
            }
        }

        int sum=0;

        while(!stack.empty()){
            sum+=stack.pop();
        }

        return sum;
    }
}