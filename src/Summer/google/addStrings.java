package Summer.google;

public class addStrings {
    public String addStrings(String num1, String num2)
    {
        int end1=num1.length()-1;
        int end2=num2.length()-1;
        StringBuilder sb=new StringBuilder();
        while(end1>=0 || end2>=0)
        {
        int sum=0;
        int carry=0;
            if(end1>=0 && end2>=0)
            {
                int N=num1.charAt(end1--)-'0';
                int N1=num2.charAt(end2--)-'0';

                sum=carry+N+N1;
                carry=sum/10;
                sb.append(sum%10);
            }
           else if(end1>=0)
            {
                int N=num1.charAt(end1--)-'0';
                sum=carry+N;
                carry=sum/10;
                sb.append(sum%10);

            }
            else if(end2>=0)
            {
                int N=num1.charAt(end2--)-'0';
                sum=carry+N;
                carry=sum/10;
                sb.append(sum%10);
            }
            if(carry!=0)
            {
                sb.append(carry);
            }

        }
        return sb.toString();

    }
}

/*
num2 = "129"
*num1 = "11", Output: "134"10/10
* */
