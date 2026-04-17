class MinStack {
    ArrayList<Integer> stack;

    public MinStack() {
        stack=new ArrayList<>();
    }
    
    public void push(int val) {
        stack.add(val);
    }
    
    public void pop() {
        stack.remove(stack.size()-1);
    }
    
    public int top() {
        return stack.get(stack.size()-1);
    }
    
    public int getMin() {
        int min=Integer.MAX_VALUE;
        for(int ele:stack){
            if(min>ele){
                min=ele;
            }
        }
        return min;
    }
}
