package Summer.ArrayAndHashMap;

import java.util.*;

public class WordLadder
{
    Set<String> set;
    Queue<String> qu;
    public int ladderLength(String beginWord, String endWord, List<String> wordList)
    {
        if(!wordList.contains(endWord)) return 0;
        set=new HashSet<>();
        for(String each:wordList)
        {
            set.add(each);
        }
        qu=new LinkedList<>();
        qu.offer(beginWord);

        int res=0;
        while(!qu.isEmpty())
        {
            int size = qu.size();
            res++;
            for (int i = 0; i < size; i++)
            {

                String curWord=qu.poll();
                for(int j=0;j<curWord.length();j++)
                {
                    char []ch1=curWord.toCharArray();
                    for(char ch='a';ch<='z';ch++)
                    {
                        ch1[j]=ch;
                        String newword=String.valueOf(ch1);
                        if(curWord.equals(endWord))
                        {
                            return res;
                        }
                        if(set.contains(newword) )
                        {
                            set.remove(newword);
                            qu.offer(newword);
                        }
                    }
                }
            }
        }
        return 0;
    }
}

