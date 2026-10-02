class Solution {
    public String getEncryptedString(String s, int k) {
        int n=s.length();
        char[] chars = new char[n];
        for(int i=0;i<chars.length;i++){
            chars[i]=s.charAt((i + k) % chars.length);
        }
        return new String(chars);
    }
}