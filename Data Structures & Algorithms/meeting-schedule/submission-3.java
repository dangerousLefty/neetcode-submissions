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
    public boolean canAttendMeetings(List<Interval> intervals) {
        Interval[] intArr = intervals.toArray(new Interval[0]);
        Arrays.sort(intArr, (a,b) -> Integer.compare(a.start, b.start));

        for (int i = 1; i < intArr.length; i++){

            if (intArr[i].start < intArr[i-1].end){
                return false;
            }
        }
        
        return true;
    }
}
