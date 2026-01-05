class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0, tank = 0, total = 0;
        
        for(int i = 0; i < gas.length; i++) {
            int balance = gas[i] - cost[i];
            tank += balance;
            total += balance;

            if(tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }
        
        if(total < 0) return -1;
        return start;  
    }
}