package Summer.ArrayAndHashMap;

public class ReverseInteger {
    public int reverse(int x)
    {

        int reverse=0;
        while(x!=0)
        {
            int temp=reverse*10+x%10;
            if(temp/10!=reverse)
            {
                return 0;
            }
            reverse=temp;
            x=x/10;
        }
        return reverse;


    }
}
