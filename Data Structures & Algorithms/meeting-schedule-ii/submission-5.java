/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        if (intervals.size() == 0) {return 0;}

        int[] startTimes = new int[intervals.size()];
        int[] endTimes = new int[intervals.size()];

        for (int i = 0; i < intervals.size(); i++){
            startTimes[i] = intervals.get(i).start;
            endTimes[i] = intervals.get(i).end;
        }
        Arrays.sort(startTimes);
        Arrays.sort(endTimes);
        int maxRooms = 1;
        int rooms = 1;

        //int s = 0;
        int e = 0;

        for (int s = 1; s < startTimes.length; s++){
            if (startTimes[s] < endTimes[e]){
                rooms++;
                maxRooms = Math.max(maxRooms, rooms);
            }

            else {
                e++;
            }
        }

        return maxRooms;
    }
}
