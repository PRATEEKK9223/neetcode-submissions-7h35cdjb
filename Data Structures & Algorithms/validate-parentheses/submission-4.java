class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack =new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch=='(' || ch=='[' || ch=='{'){
                stack.push(ch);
            }else{
                if(stack.empty()){
                    return false;
                }
                if(ch==')'){
                    if(stack.pop()!='('){
                        return false;
                    }
                }else if(ch==']'){
                    if(stack.pop()!='['){
                        return false;
                    }
                }else{
                    if(stack.pop()!='{'){
                        return false;
                    }
                }
            }
        }

       if(stack.empty()){
            return true;
       }else{
        return false;
       }
    }
}
