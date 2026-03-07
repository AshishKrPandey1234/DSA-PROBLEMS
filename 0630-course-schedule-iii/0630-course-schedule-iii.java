class Solution {
    public int scheduleCourse(int[][] courses) {
        Queue<Integer>priorityQueue=new PriorityQueue<>(Collections.reverseOrder());
        int duration=0;
        Arrays.sort(courses,(a,b)->Integer.compare(a[1],b[1]));
        for(int course[]:courses){
            duration+=course[0];
            priorityQueue.offer(course[0]);
            if(duration>course[1]){
                duration-=priorityQueue.poll();
            }
        }
        return priorityQueue.size();
    }
}