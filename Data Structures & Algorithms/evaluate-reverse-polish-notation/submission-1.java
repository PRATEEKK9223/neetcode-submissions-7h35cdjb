class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        
        for(String str:tokens){
           if(str.equals("+")){
                int op1=stack.pop();
                int op2=stack.pop();
                int res=op1+op2;
                stack.push(res);
           }else if(str.equals("-")){
                int op1=stack.pop();
                int op2=stack.pop();
                int res=op2-op1;
                stack.push(res);
           }else if(str.equals("*")){
                int op1=stack.pop();
                int op2=stack.pop();
                int res=op1*op2;
                stack.push(res);
           }else if(str.equals("/")){
                int op1=stack.pop();
                int op2=stack.pop();
                int res=op2/op1;
                stack.push(res);
           }else{
                int ele=Integer.parseInt(str);
                stack.push(ele);
           }
        }

        return stack.peek();
    }
}
