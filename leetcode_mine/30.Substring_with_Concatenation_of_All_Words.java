public class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<Integer>();
        if (s==null||s.length()==0||words==null||words.length==0||s.length()<words[0].length())
        {
            return result;
        }
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i<words.length; i++)
        {
            if (!map.containsKey(words[i]))
            {
                map.put(words[i], 1);
            }
            else
            {
                map.put(words[i], map.get(words[i])+1);
            }
        }
        HashMap<String, Integer> wordmap = new HashMap<String, Integer>(map);
        int len = words[0].length();
        int count = 0;
        for (int i = 0; i<=s.length()-words.length*len; i++)
        {
            int index = i;
            while (count<words.length)
            {
                String word = s.substring(index, index+len);
                if (wordmap.containsKey(word)&&wordmap.get(word)>0)
                {
                    count++;
                    wordmap.put(word, wordmap.get(word)-1);
                    index += len;
                }
                else
                {
                    count = 0;
                    wordmap = new HashMap<String, Integer>(map);
                    break;
                }
            }
            if (count==words.length)
            {
                result.add(i);
                count = 0;
                wordmap = new HashMap<String, Integer>(map);
            }
        }
        return result;
    }
}