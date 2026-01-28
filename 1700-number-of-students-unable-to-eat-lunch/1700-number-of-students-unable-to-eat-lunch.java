class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new LinkedList<>();
        for (int student : students) {
            queue.offer(student);
        }
        
        int sandwichIndex = 0;
        int attempts = 0;
        
        while (!queue.isEmpty() && attempts < queue.size()) {
            int student = queue.poll();
            
            if (student == sandwiches[sandwichIndex]) {
                sandwichIndex++;
                attempts = 0; 
            } else {
                queue.offer(student); 
                attempts++;
            }
        }
        
        return queue.size();
    }
}