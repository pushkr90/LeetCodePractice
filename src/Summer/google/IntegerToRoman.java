package Summer.google;

public class IntegerToRoman {
    public String intToRoman(int num) {
        int[] values=new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] ans=new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder sb=new StringBuilder();
while(num>0)
{
        for(int i=0;i<values.length;i++)
        {
            if(num>=values[i])
            {
                sb.append(ans[i]);
                num-=values[i];
                break;
            }
        }
}
        return sb.toString();
    }
}
