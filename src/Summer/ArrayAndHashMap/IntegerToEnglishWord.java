package Summer.ArrayAndHashMap;

public class IntegerToEnglishWord {
        String[] belowTwenty={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
        String[] belowHundred={"","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
    public String numberToWords(int num) {

        if(num==0)
        {
            return "Zero";
        }
         return check(num);


    }
    public String check(int num)
    {
        String result="";
        if(num==0)
        {
            result= "";
        }
        else if(num<20)
        {
           result= belowTwenty[num];
        }
        else if(num<100)
        {
            result= belowTwenty[num/10]+" "+check(num%10);
        }
        else if(num<1000)
        {
            result= check(num/100)+" Hundered "+ check(num%100);
        }
        else if(num<1000000)
        {
            result= check(num/1000)+" Thousand "+check(num%1000);
        }
        else if(num<1000000000)
        {
            result= check(num/1000000)+" Million "+check(num%1000000);
        }else {
            result= check(num/1000000000)+" Billion "+check(num%1000000000);
    }
        return result;

    }
}
