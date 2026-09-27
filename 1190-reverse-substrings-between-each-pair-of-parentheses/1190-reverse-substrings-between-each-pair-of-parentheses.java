class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> mainstack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            
            if(c!=')'){
                mainstack.push(c);
            }else{
                ArrayList<Character> temp=new ArrayList<>();
                while(mainstack.peek()!='('){
                    temp.add(mainstack.pop());

                }
                mainstack.pop();
                for(char x:temp){
                    mainstack.push(x);
                }
            }

        }
        StringBuilder sb=new StringBuilder();
        while(!mainstack.isEmpty()){
            sb.append(mainstack.pop());
        }
        return sb.reverse().toString();
    }
}