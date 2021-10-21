package Summer.Graphs;

import java.util.*;

public class AlienDictionary
{
    public String alienOrder(String[] words)
    {
       HashMap<Character,List<Character>> adjList=new HashMap<>();
       HashMap<Character,Integer> indegree=new HashMap<>();
       for(String each:words)
       {
           for(char c:each.toCharArray())
           {
               indegree.put(c,0);
           }
       }

       for(int i=0;i<words.length-1;i++)
       {
           String  s1=words[i];
           String s2=words[i+1];
           if(s1.length()>s2.length() && s1.startsWith(s2))
           {
               return "";
           }
           int len=Math.min(s1.length(),s2.length());

           for(int j=0;j<len;j++)
           {
               char c1=s1.charAt(j);
               char c2=s2.charAt(j);
               if(c2!=c1)
               {
                   if(!adjList.containsKey(c1))
                   {
                       adjList.put(c1,new ArrayList<>());
                   }

                   adjList.get(c1).add(c2);
               }

           }
       }

       for(List<Character> each:adjList.values())
       {
           List<Character> e=each;
           for(char each1:e)
           {
               indegree.put(each1,indegree.getOrDefault(each1,0)+1);
           }
       }

       Queue<Character>qu=new LinkedList<>();
       for(char each:indegree.keySet())
       {
           if(each==0)
           {
               qu.offer(each);
           }
       }
       StringBuilder sb=new StringBuilder();

       while(!qu.isEmpty())
       {
           char curr=qu.poll();
           sb.append(curr);
           if(adjList.containsKey(curr))
           {
               List<Character> set=adjList.get(curr);
               for(Character c:set)
               {
                   indegree.put(c,indegree.get(c)-1);
                   if(indegree.get(c)==0)
                   {
                       qu.offer(c);
                   }

               }
           }
       }
       return sb.toString();
    }
}
