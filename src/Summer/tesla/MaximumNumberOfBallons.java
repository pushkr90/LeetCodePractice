package Summer.tesla;

public class MaximumNumberOfBallons {
    public int maxNumberOfBalloons(String text) {

        char[] arr=new char[]{'b','a','l','l','o','o','n'};
        int[] check=new int[26];
        for(char c:text.toCharArray())
        {

            check[c-'a']++;
        }
        int count=0;
        boolean found=false;
        for(int i=0;i<text.length();i++)
        {
            int count1=0;
            for(char each:arr)
            {
                if(check[each-'a']>0)
                {
                    found=true;
                    count1++;
                    if(check[each-'a']-- <0)
                    {
                        found=false;
                    }
                }
            }
            if(found && count1==arr.length)
            {
                count++;
            }
        }
        return count;


    }
}
