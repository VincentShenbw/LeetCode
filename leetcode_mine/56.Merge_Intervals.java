/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> result = new ArrayList<Interval>();
        if (intervals.size()==0)
        {
            return result;
        }
        Collections.sort(intervals, new Comparator<Interval>(){
            public int compare(Interval o1, Interval o2)
            {
                if (o1.start<o2.start)
                {
                    return -1;
                }
                else if (o1.start==o2.start)
                {
                    return 0;
                }
                else
                {
                    return 1;
                }
            }
        });
        result.add(intervals.get(0));
        for (int i = 1; i<intervals.size(); i++)
        {
            if (intervals.get(i).start<=result.get(result.size()-1).end)
            {
                if (intervals.get(i).end>result.get(result.size()-1).end)
                {
                    result.get(result.size()-1).end = intervals.get(i).end;
                }
            }
            else
            {
                result.add(intervals.get(i));
            }
        }
        return result;
    }
}