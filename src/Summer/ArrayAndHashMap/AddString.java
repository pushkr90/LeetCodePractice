package Summer.ArrayAndHashMap;

public class AddString
{
    public String addStrings(String num1, String num2)
    {
        StringBuilder sb=new StringBuilder();
        int carry=0,j=0;
        int end=num1.length()-1;
        int end1=num2.length()-1;
        while(end>=0 && end1>=0)
        {

            int first=num1.charAt(end)-'0';
            int second=num2.charAt(end1)-'0';

            int total=first+second+carry;
            carry=total/10;
            int digit=total%10;
            sb.append(digit);
            end--;
            end1--;

        }

        while(end>=0)
        {
            int first=num1.charAt(end)-'0';
            int total=first+carry;
            carry=total/10;
            int digit=total%10;
            sb.append(digit);
            end--;
        }
        while(end1>=0)
        {
            int second=num2.charAt(end1)-'0';
            int total=second+carry;
            carry=total/10;
            int digit=total%10;
            sb.append(digit);
            end1--;

        }

        if(carry!=0)
        {
            sb.append(carry);
        }
        sb.reverse();
        return sb.toString();




    }
}
