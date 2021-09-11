package Summer.google;

public class SentenceFitiingRevision {
    public int wordsTyping(String[] sentence, int rows, int cols)
    {
        StringBuilder sb=new StringBuilder();
        for(String each:sentence)
        {
            sb.append(each+" ");
        }
        String res=new String(sb);
        int len=res.length();
        int pointer=0;
        for(int i=0;i<rows;i++)
        {
            pointer+=cols;
            if(res.charAt(pointer%len)==' ')
            {
                pointer++;
            }
            else{
                while(pointer>=0 && res.charAt(pointer%len)!=' ')
                {
                    pointer--;
                }
                pointer++;
            }

        }
        return pointer/len;
    }
}
