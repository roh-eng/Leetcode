class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        ArrayList<String> res = new ArrayList<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list1.length;i++){
            int sum=0;
            for(int j=0;j<list2.length;j++){
                if(list1[i].equals(list2[j])){
                    sum=i+j;
                
                if(min>sum){
                    min=sum;
                    res.clear();
                    res.add(list1[i]);

                }else if(min==sum){
                    res.add(list1[i]);

                }
            }
        }
        }
        String arr[]=new String[res.size()];
        for(int k=0;k<res.size();k++){
            arr[k]=res.get(k);
        }
        return arr;
    }
}