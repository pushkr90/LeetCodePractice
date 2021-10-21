package Summer.google;

public class StringCompression {
    public int compress(char[] chars) {
        int index=0,i=0,l=chars.length;

        while(i<l)
        {
            char c=chars[i];
            int j=i;
            while(j<l && c==chars[j])
            {
                j++;
            }
            int count=j-i;
            chars[index++]=c;
            if(count==1)
            {

            }
            else if(count<10)
            {

                chars[index++]=(char)(count+'0');
            }
            else{
                String count1=String.valueOf(count);
                for(char each:count1.toCharArray())
                {
                    chars[index++]=each;
                }
            }
            i=j;
        }
        return index;
    }
}
