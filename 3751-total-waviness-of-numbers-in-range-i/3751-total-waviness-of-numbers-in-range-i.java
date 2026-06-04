class Solution {
    public int totalWaviness(int num1, int num2) {
        int s=0;
        for(int i=num1;i<=num2;i++){
            
            int[] digits = String.valueOf(i)
                .chars()
                .map(c -> c - '0')
                .toArray(); 
            int cw=0;
            if(digits.length<3) continue; 
            for(int j=1;j<digits.length-1;j++){
                if(digits[j-1]<digits[j] && digits[j]>digits[j+1]){
                    cw++;
                   
                }else if(digits[j-1]>digits[j] && digits[j+1]>digits[j]){
                    cw++;
                   
                }
            }    
             s=s+cw;
        }
        return s;
    }
}