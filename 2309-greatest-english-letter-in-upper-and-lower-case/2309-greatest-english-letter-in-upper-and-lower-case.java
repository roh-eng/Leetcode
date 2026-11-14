class Solution {
    public String greatestLetter(String s) {
        HashSet<Character> lowerset=new HashSet<>();
        HashSet<Character> upperset=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isLowerCase(c)){
                lowerset.add(c);
            }else{
                upperset.add(c);
            }
        }
        for (char c = 'Z'; c >= 'A'; c--) {
            if (upperset.contains(c) && lowerset.contains(Character.toLowerCase(c))) {
                return String.valueOf(c);
            }
        }

        return "";
    }
}