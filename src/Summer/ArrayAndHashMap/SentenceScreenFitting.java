package Summer.ArrayAndHashMap;

public class SentenceScreenFitting {
    public int wordsTyping(String[] sentence, int rows, int cols) {
        StringBuilder sb=new StringBuilder();
        for(String each:sentence)
        {
            sb.append(each+" ");
        }
        String latest=new String(sb);
        int len=sb.length();
        int cur=0;
        for(int i=0;i<rows;i++)
        {
            cur+=cols;
            if(latest.charAt(cur%len)==' ')
            {
                cur++;
            }
            else{
                while(cur >=0 && latest.charAt(cur%len)!=' ')
                {
                    cur--;
                }
            }
        }
        return cur/len;
    }
}
