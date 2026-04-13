class Solution {
    public int calPoints(String[] operations) {
        //Stack<Integer> stack=new Stack<>();
        ArrayList<Integer> list =new ArrayList<>();
        for(String op:operations){
            if(op.equals("+")){
                int temp=list.get(list.size()-1)+list.get(list.size()-2);
                list.add(temp);
            }else if(op.equals("D")){
                int temp=list.get(list.size()-1)*2;
                list.add(temp);
            }else if(op.equals("C")){
                list.remove(list.size()-1);
            }else{
                int temp=Integer.parseInt(op);
                list.add(temp);
            }
        }
        int sum=0;

        for(int ele:list){
            sum+=ele;
        }

        return sum;

    }
}