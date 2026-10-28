class Solution {
    public int calPoints(String[] operations) {
        Stack <Integer> st = new Stack<>();
        for(int i = 0 ;i<operations.length;i++){
            if(operations[i].equals("+")){
                int top1 = st.pop();
                int top2 = st.peek();
                st.push(top1);
                st.push(top1+top2);

            }
            else  if(operations[i].equals("D")){
                st.push(st.peek() *2);
            }
            else  if(operations[i].equals("C")){
                st.pop();
            }
            else{
                st.push(Integer.parseInt(operations[i]));
            }
        }
        int sum = 0;
        while(!st.isEmpty())
        {
            sum += st.peek();
            st.pop();
        }
        return sum;
    }
}