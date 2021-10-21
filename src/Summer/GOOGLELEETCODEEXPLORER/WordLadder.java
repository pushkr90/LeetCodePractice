package Summer.GOOGLELEETCODEEXPLORER;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set=new HashSet<>(wordList);
        Queue<String> qu=new LinkedList<>();
        qu.offer(beginWord);
        int level=0;

        while (!qu.isEmpty())
        {
            int size=qu.size();


            level++;
            for (int i=0;i<size;i++)
            {
                String curr=qu.poll();
                if(curr==endWord) return level;
                char [] curr1=curr.toCharArray();
                for(char c1:curr1)
                {
                    for(char c='a';c<='z';c++)
                    {
                        curr1[c1]=c;
                        String newWord=curr1.toString();

                        if(set.contains(newWord))
                        {
                            set.remove(newWord);
                            qu.offer(newWord);
                        }

                    }
                }
            }
        }
        return 0;

    }
}
