package Summer.google;

public class MultiplyString {
    public String multiply(String num1, String num2) {
        int[] res=new int[num1.length()+num2.length()-1];

        for(int i=0;i<num1.length();i++)
        {
            for(int j=0;j<num2.length();j++)
            {
                res[i+j]+=num1.charAt(i)-'0'*num2.charAt(j);
            }
        }

        for(int k=res.length-1;k>0;k--)
        {
            res[k-1]=res[k]/10;
            res[k]=res[k]%10;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<res.length;i++)
        {
            sb.append(res[i]);
        }
        return sb.toString();

    }
}
