class Solution {
    public boolean halvesAreAlike(String s) {
        int avc=0;
        int bvc=0;
        int mid=s.length()/2;
        String x=s.toLowerCase();
        for(int i=0;i<mid;i++){
            char c=x.charAt(i);
            if(c=='a'|| c=='e'||c=='i'|| c=='o'||c=='u'){
                avc++;
            }
        }
        for(int i=mid;i<s.length();i++){
            char c=x.charAt(i);
            if(c=='a'|| c=='e'||c=='i'|| c=='o'||c=='u'){
                bvc++;
            }
        }
        return avc==bvc;
    }
}