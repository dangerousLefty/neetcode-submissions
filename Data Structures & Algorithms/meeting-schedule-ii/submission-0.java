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
        if (intervals.size() < 1) {
            return 0;
        }
        int[] startTimes = new int[intervals.size()];
        int[] endTimes = new int[intervals.size()];
        int rooms = 0;
        int maxRooms = 0;

        for (int i = 0; i < intervals.size(); i++){
            startTimes[i] = intervals.get(i).start;
            endTimes[i] = intervals.get(i).end;
        }

        Arrays.sort(startTimes);
        Arrays.sort(endTimes);

        int s = 0;
        int e = 0;

        while (s < startTimes.length){
            if (startTimes[s] < endTimes[e]){
                rooms++;
                maxRooms = Math.max(maxRooms, rooms);
                s++;
            }
            else {
                rooms--;
                e++;
            }
        }
        return maxRooms;
    }
}
