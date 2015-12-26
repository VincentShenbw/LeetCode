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
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> result = new ArrayList<Interval>();
        Interval tmp = null;
        int i = 0;
        int start, end;
        boolean flag = false;
        while (i<intervals.size())
        {
            tmp = intervals.get(i);
            if (flag||tmp.end<newInterval.start)
            {
                result.add(tmp);
                i++;
                continue;
            }
            else if (tmp.end>=newInterval.start)
            {
                if (tmp.start>newInterval.start) {
                    start = newInterval.start;
                }
                else
                {
                    start = tmp.start;
                }
                while (i<intervals.size())
                {
                    tmp = intervals.get(i);
                    if (tmp.start>newInterval.end)
                    {
                        end = newInterval.end;
                        result.add(new Interval(start, end));
                        flag = true;
                        break;
                    }
                    else if (tmp.start<=newInterval.end&&tmp.end>=newInterval.end)
                    {
                        end = tmp.end;
                        result.add(new Interval(start, end));
                        i++;
                        flag = true;
                        break;
                    }
                    else
                    {
                        i++;
                    }
                }
                if (!flag)
                {
                	end = newInterval.end;
                	result.add(new Interval(start, end));
                	flag = true;
                }
            }
        }
        if (!flag)
        {
            result.add(newInterval);
        }
        return result;
    }
}