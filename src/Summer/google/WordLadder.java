package Summer.google;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList)
    {
        int res=0;

        HashSet<String> set=new HashSet<>(wordList);
        Queue<String> qu=new LinkedList<>();
        qu.offer(beginWord);
        while(!qu.isEmpty())
        {
            int size= qu.size();
            res++;
            for(int i=0;i<size;i++) {
                String curr = qu.poll();

                for (int j = 0; j < curr.length(); j++)
                {
                    char[] curr1 = curr.toCharArray();
                    for (char c = 'a'; c <= 'z'; c++) {
                        curr1[j] = c;
                        String naya = new String(curr1);
                        if (naya.equals(endWord)) {
                            return res;
                        }
                        if (set.contains(naya))
                        {
                            set.remove(naya);
                            qu.offer(naya);
                        }
                    }
                }
            }

        }
        return res;
    }
}
